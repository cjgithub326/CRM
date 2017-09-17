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

import com.hik.entity.CustomerReprieve;
import com.hik.service.CustomerReprieveService;
import com.hik.util.CollectionUtil;
import com.hik.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * @ClassName: CustomerReprieveController
 * @Description: 客户流失暂缓Controller层
 * @author jed
 * @date 2017年8月13日上午11:54:35
 *
 */
@Controller
@RequestMapping("/customerReprieve")
public class CustomerReprieveController {

	@Resource
	private CustomerReprieveService customerReprieveService;
	
	
	/**
	 * @MethodName: list
	 * @Description: 查询客户流失暂缓
	 * @author jed
	 * @date 2017年8月19日下午4:10:25
	 * @param @param page
	 * @param @param rows
	 * @param @param CustomerReprieve
	 * @param @param response
	 * @param @return    
	 * @return String    返回类型
	 * @param page
	 * @param rows
	 * @param CustomerReprieve
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="lossId",required=false)String lossId,HttpServletResponse response) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cusId",lossId);
		List<CustomerReprieve> customerReprieveList = customerReprieveService.find(map);
		JSONObject result = new JSONObject();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setExcludes(new String[]{"customerLoss"});
		JSONArray jsonArray = new JSONArray();
		if(CollectionUtil.isNotEmpty(customerReprieveList)){
			jsonArray = JSONArray.fromObject(customerReprieveList,jsonConfig);
		}
		result.put("rows", jsonArray);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: save
	 * @Description: 添加或者修改客户流失暂缓
	 * @author jed
	 * @date 2017年8月19日下午9:32:19
	 * @param @param customerReprieve
	 * @param @param response
	 * @param @return    
	 * @return String    返回类型
	 * @param customerReprieve
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/save")
	public String save(CustomerReprieve customerReprieve,HttpServletResponse response) throws Exception{
		long resultTotal=0L;
		if(customerReprieve.getId()==null){// 添加
			resultTotal = customerReprieveService.save(customerReprieve);
		}else{//更新
			resultTotal = customerReprieveService.update(customerReprieve);
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
	 * @MethodName: delete
	 * @Description: 删除客户流失暂缓
	 * @author jed
	 * @date 2017年8月19日下午10:56:44
	 * @param @param ids
	 * @param @param response
	 * @param @return
	 * @param @throws Exception    
	 * @return String    返回类型
	 * @param ids
	 * @param response
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="id")String id,HttpServletResponse response) throws Exception{
		customerReprieveService.delete(Integer.parseInt(id));
		JSONObject result = new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
	
	
}
