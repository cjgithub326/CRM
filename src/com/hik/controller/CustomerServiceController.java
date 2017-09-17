/**
 * 
 */
package com.hik.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hik.entity.CustomerService;
import com.hik.service.CustomerServiceService;
import com.hik.util.ResponseUtil;

import net.sf.json.JSONObject;

/**
 * @ClassName: CustomerServiceController
 * @Description: 客户服务Controller层
 * @author jed
 * @date 2017年8月13日上午11:54:35
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
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));   //true:允许输入空值，false:不能为空值
	}
	
	/**
	 * 
	 * @MethodName: save
	 * @Description: 添加或者修改客户服务
	 * @author jed
	 * @date 2017年8月19日下午9:32:19
	 * @param @param customerService
	 * @param @param response
	 * @param @return    
	 * @return String    返回类型
	 * @param customerService
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/save")
	public String save(CustomerService customerService,HttpServletResponse response) throws Exception{
		int resultTotal=0;
		if(customerService.getId()==null){// 添加
			resultTotal = customerServiceService.save(customerService);
		}else{//更新
			//resultTotal = customerServiceService.update(customerService);
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
	
	
	
}
