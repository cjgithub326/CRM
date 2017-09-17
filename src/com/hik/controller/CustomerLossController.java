/**
 * 
 */
package com.hik.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hik.entity.CustomerLoss;
import com.hik.entity.PageBean;
import com.hik.service.CustomerLossService;
import com.hik.util.CollectionUtil;
import com.hik.util.ResponseUtil;
import com.hik.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * @ClassName: CustomerLossController
 * @Description: �ͻ���ʧController��
 * @author jed
 * @date 2017��8��13������11:54:35
 *
 */
@Controller
@RequestMapping("/customerLoss")
public class CustomerLossController {

	@Resource
	private CustomerLossService customerLossService;
	
	
	/**
	 * @MethodName: list
	 * @Description: ��ҳ������ѯ�ͻ���ʧ
	 * @author jed
	 * @date 2017��8��19������4:10:25
	 * @param @param page
	 * @param @param rows
	 * @param @param CustomerLoss
	 * @param @param response
	 * @param @return    
	 * @return String    ��������
	 * @param page
	 * @param rows
	 * @param CustomerLoss
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,CustomerLoss customerLoss,HttpServletResponse response) throws Exception{
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cusName", StringUtil.formatLike(customerLoss.getCusName()));
		map.put("cusManager", StringUtil.formatLike(customerLoss.getCusManager()));
		map.put("state", customerLoss.getState());
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<CustomerLoss> customerLossList = customerLossService.find(map);
		Long total = customerLossService.getTotal(map);
		JSONObject result = new JSONObject();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		JSONArray jsonArray = new JSONArray();
		if(CollectionUtil.isNotEmpty(customerLossList)){
			jsonArray = JSONArray.fromObject(customerLossList,jsonConfig);
		}
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: findById
	 * @Description: ͨ��id���ҿͻ���ʧ
	 * @author jed
	 * @date 2017��9��17������10:38:06
	 * @param @param id
	 * @param @param response
	 * @param @return
	 * @param @throws Exception    
	 * @return String    ��������
	 * @param id
	 * @param response
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/findById")
	public String findById(@RequestParam(value="id")String id,HttpServletResponse response) throws Exception{
		CustomerLoss customerLoss = customerLossService.findById(Integer.parseInt(id));
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		JSONObject result= JSONObject.fromObject(customerLoss, jsonConfig);
		ResponseUtil.write(response, result);
		return null;
		
	}
	
	/**
	 * 
	 * @MethodName: confirmLoss
	 * @Description: ȷ�Ͽͻ���ʧ
	 * @author jed
	 * @date 2017��9��17������10:41:07
	 * @param @param id
	 * @param @param lossReason
	 * @param @param response
	 * @param @return    
	 * @return String    ��������
	 * @param id
	 * @param lossReason
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/confirmLoss")
	public String confirmLoss(String id,String lossReason,HttpServletResponse response) throws Exception{
		CustomerLoss customerLoss =new CustomerLoss();
		customerLoss.setId(Integer.parseInt(id));
		customerLoss.setLossReason(lossReason);
		customerLoss.setConfirmLossTime(new Date());
		customerLoss.setState(1);
		customerLossService.update(customerLoss);
		JSONObject result  = new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
	
}
