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
