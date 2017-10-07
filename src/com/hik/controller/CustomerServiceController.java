/**
 * 
 */
package com.hik.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hik.entity.CustomerService;
import com.hik.entity.PageBean;
import com.hik.service.CustomerServiceService;
import com.hik.util.CollectionUtil;
import com.hik.util.ResponseUtil;
import com.hik.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * @ClassName: CustomerServiceController
 * @Description: �ͻ�����Controller��
 * @author jed
 * @date 2017��8��13������11:54:35
 *
 */
@Controller
@RequestMapping("/customerService")
public class CustomerServiceController {

	@Resource
	private CustomerServiceService customerServiceService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));   //true:���������ֵ��false:����Ϊ��ֵ
	}
	
	/**
	 * 
	 * @MethodName: save
	 * @Description: ��ӻ����޸Ŀͻ�����
	 * @author jed
	 * @date 2017��8��19������9:32:19
	 * @param @param customerService
	 * @param @param response
	 * @param @return    
	 * @return String    ��������
	 * @param customerService
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/save")
	public String save(CustomerService customerService,HttpServletResponse response) throws Exception{
		int resultTotal=0;
		if(customerService.getId()==null){// ���
			resultTotal = customerServiceService.save(customerService);
		}else{//����
			resultTotal = customerServiceService.update(customerService);
		}
		JSONObject result = new JSONObject();
		if(resultTotal>0){
			result.put("success", true);
		}else{
			result.put("success", false); 
		}
		ResponseUtil.write(response, result); 
		return null;
	}
	
	/**
	 * 
	 * @MethodName: list
	 * @Description: ��ҳ������ѯ�ͻ�����
	 * @author jed
	 * @date 2017��9��17������11:11:07
	 * @param @param page
	 * @param @param rows
	 * @param @param response
	 * @param @return    
	 * @return String    ��������
	 * @param page
	 * @param rows
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,String createTimefrom, String createTimeto, CustomerService customerService,HttpServletResponse response) throws Exception{
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("customer", StringUtil.formatLike(customerService.getCustomer()));
		map.put("overview", StringUtil.formatLike(customerService.getOverview()));
		map.put("serveType",customerService.getServeType());
		map.put("state", customerService.getState());
		map.put("createTimefrom", createTimefrom);
		map.put("createTimeto", createTimeto);
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<CustomerService> customerServiceList= customerServiceService.find(map);
		Long total = customerServiceService.getTotal(map);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		JSONObject result = new JSONObject();
		JSONArray  jsonArray = new JSONArray();
		if(CollectionUtil.isNotEmpty(customerServiceList)){
			  jsonArray = JSONArray.fromObject(customerServiceList, jsonConfig);
		}
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
		
	}
	
}
