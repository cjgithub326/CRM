/**
 * 
 */
package com.hik.controller;

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
 * @Description: 客户流失Controller层
 * @author jed
 * @date 2017年8月13日上午11:54:35
 *
 */
@Controller
@RequestMapping("/customerLoss")
public class CustomerLossController {

	@Resource
	private CustomerLossService customerLossService;
	
	
	/**
	 * @MethodName: list
	 * @Description: 分页条件查询客户流失
	 * @author jed
	 * @date 2017年8月19日下午4:10:25
	 * @param @param page
	 * @param @param rows
	 * @param @param CustomerLoss
	 * @param @param response
	 * @param @return    
	 * @return String    返回类型
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
	
}
