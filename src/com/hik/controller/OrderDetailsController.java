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

import com.hik.entity.OrderDetails;
import com.hik.entity.PageBean;
import com.hik.service.OrderDetailsService;
import com.hik.util.CollectionUtil;
import com.hik.util.ResponseUtil;
import com.hik.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * @ClassName: OrderDetailsController
 * @Description: ������ϸController��
 * @author jed
 * @date 2017��8��13������11:54:35
 *
 */
@Controller
@RequestMapping("/orderDetails")
public class OrderDetailsController {

	@Resource
	private OrderDetailsService orderDetailsService;
	
	
	/**
	 * @MethodName: list
	 * @Description: ��ѯ������ϸ
	 * @author jed
	 * @date 2017��8��19������4:10:25
	 * @param @param page
	 * @param @param rows
	 * @param @param OrderDetails
	 * @param @param response
	 * @param @return    
	 * @return String    ��������
	 * @param page
	 * @param rows
	 * @param OrderDetails
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows, @RequestParam(value="orderId",required=false)String orderId,HttpServletResponse response) throws Exception{
		if(StringUtil.isEmpty(orderId)){
			return null;
		}
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orderId",orderId);
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<OrderDetails> orderDetailsList = orderDetailsService.find(map);
		Long total = orderDetailsService.getTotal(map);
		JSONObject result = new JSONObject();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setExcludes(new String[]{"order"});
		JSONArray jsonArray = new JSONArray();
		if(CollectionUtil.isNotEmpty(orderDetailsList)){
			jsonArray = JSONArray.fromObject(orderDetailsList,jsonConfig);
		}
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: getTotalPrice
	 * @Description: ͨ������id��ȡ�����ܽ��
	 * @author jed
	 * @date 2017��9��5������10:25:12
	 * @param @return    
	 * @return String    ��������
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/getTotalPrice")
	public String getTotalPrice(String orderId,HttpServletResponse response) throws Exception{
		float totalMoney = orderDetailsService.getTotalPriceByOrderId(Integer.parseInt(orderId));
		JSONObject result = new JSONObject();
		result.put("totalMoney", totalMoney);
		ResponseUtil.write(response, result);
		return null;
	}
	
}
