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
import com.hik.entity.Customer;
import com.hik.entity.CustomerGc;
import com.hik.entity.CustomerGx;
import com.hik.service.CustomerService;
import com.hik.util.CollectionUtil;
import com.hik.util.DateUtil;
import com.hik.util.ResponseUtil;
import com.hik.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @ClassName: CustomerController
 * @Description: �ͻ�Controller��
 * @author jed
 * @date 2017��8��13������11:54:35
 *
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Resource
	private CustomerService customerService;
	
	
	/**
	 * @MethodName: list
	 * @Description: ��ҳ������ѯ�ͻ�
	 * @author jed
	 * @date 2017��8��19������4:10:25
	 * @param @param page
	 * @param @param rows
	 * @param @param Customer
	 * @param @param response
	 * @param @return    
	 * @return String    ��������
	 * @param page
	 * @param rows
	 * @param Customer
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,Customer customer,HttpServletResponse response) throws Exception{
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("khno", StringUtil.formatLike(customer.getKhno()));
		map.put("name", StringUtil.formatLike(customer.getName()));
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<Customer> customerList = customerService.find(map);
		Long total = customerService.getTotal(map);
		JSONObject result = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		if(CollectionUtil.isNotEmpty(customerList)){
			jsonArray = JSONArray.fromObject(customerList);
		}
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: save
	 * @Description: ����û�
	 * @author jed
	 * @date 2017��9��3������10:46:43
	 * @param @param customer
	 * @param @param response
	 * @param @return    
	 * @return String    ��������
	 * @param customer
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/save")
	public String save(Customer customer,HttpServletResponse response) throws Exception{
		long resultTotal=0L;
		if(customer.getId()==null){//���
			customer.setKhno("KH"+DateUtil.getCurrentDateStr()); // ��̬���ɿͻ����
			resultTotal = customerService.save(customer);
		}else{
			resultTotal = customerService.update(customer);
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
	 * @Description: ɾ���ͻ���Ϣ
	 * @author jed
	 * @date 2017��9��3������12:27:39
	 * @param @param ids
	 * @param @param response
	 * @param @return    
	 * @return String    ��������
	 * @param ids
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="ids")String ids,HttpServletResponse response) throws Exception{
		String [] idsStr = ids.split(",");
		for(int i=0;i<idsStr.length;i++){
			customerService.delete(Integer.parseInt(idsStr[i]));
		}
		JSONObject result = new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: findById
	 * @Description: ͨ��id��ȡʵ��
	 * @author jed
	 * @date 2017��9��3������5:40:04
	 * @param @return    
	 * @return String    ��������
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/findById")
	public String findById(@RequestParam(value="id")String id,HttpServletResponse response) throws Exception{
		Customer customer = customerService.findById(Integer.parseInt(id));
		JSONObject result = JSONObject.fromObject(customer);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: findCustomerGx
	 * @Description: ��ѯ�ͻ���������
	 * @author jed
	 * @date 2017��12��3������10:59:49
	 * @param @param page
	 * @param @param rows
	 * @param @param name
	 * @param @param response
	 * @param @return
	 * @param @throws Exception    
	 * @return String    ��������
	 * @param page
	 * @param rows
	 * @param name
	 * @param response
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/findCustomerGx")
	public String findCustomerGx(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,String name,HttpServletResponse response) throws Exception{
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", StringUtil.formatLike(name));
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<CustomerGx> customerGxList = customerService.findCustomerGx(map);
		Long total = customerService.getTotalCustomerGx(map);
		JSONObject result = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		if(CollectionUtil.isNotEmpty(customerGxList)){
			jsonArray = JSONArray.fromObject(customerGxList);
		}
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: findCustomerGc
	 * @Description: ��ѯ�ͻ���������
	 * @author jed
	 * @date 2017��12��3������4:02:13
	 * @param @param response
	 * @param @return
	 * @param @throws Exception    
	 * @return String    ��������
	 * @param response
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/findCustomerGc")
	public String findCustomerGc(HttpServletResponse response) throws Exception{
		List<CustomerGc> customerGcList = customerService.findCustomerGc();
		JSONArray jsonArray = JSONArray.fromObject(customerGcList);
		ResponseUtil.write(response, jsonArray);
		return null;
	}
}
