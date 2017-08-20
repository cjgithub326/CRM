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

import com.hik.entity.PageBean;
import com.hik.entity.SaleChance;
import com.hik.service.SaleChanceService;
import com.hik.util.CollectionUtil;
import com.hik.util.ResponseUtil;
import com.hik.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * @ClassName: SaleChanceController
 * @Description: 销售机会Controller层
 * @author jed
 * @date 2017年8月13日上午11:54:35
 *
 */
@Controller
@RequestMapping("/saleChance")
public class SaleChanceController {

	@Resource
	private SaleChanceService saleChanceService;
	
	
	/**
	 * @MethodName: list
	 * @Description: 分页条件查询销售机会
	 * @author jed
	 * @date 2017年8月19日下午4:10:25
	 * @param @param page
	 * @param @param rows
	 * @param @param SaleChance
	 * @param @param response
	 * @param @return    
	 * @return String    返回类型
	 * @param page
	 * @param rows
	 * @param SaleChance
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,SaleChance saleChance,HttpServletResponse response) throws Exception{
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("customerName", StringUtil.formatLike(saleChance.getCustomerName()));
		map.put("overView", StringUtil.formatLike(saleChance.getOverView()));
		map.put("createMan", StringUtil.formatLike(saleChance.getCreateMan()));
		map.put("state", saleChance.getState());
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<SaleChance> saleChanceList = saleChanceService.find(map);
		Long total = saleChanceService.getTotal(map);
		JSONObject result = new JSONObject();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm"));
		JSONArray jsonArray = new JSONArray();
		if(CollectionUtil.isNotEmpty(saleChanceList)){
			jsonArray = JSONArray.fromObject(saleChanceList,jsonConfig);
		}
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
}
