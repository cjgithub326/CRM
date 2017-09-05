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

import com.hik.entity.Contact;
import com.hik.service.ContactService;
import com.hik.util.CollectionUtil;
import com.hik.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * @ClassName: ContactController
 * @Description: ������¼Controller��
 * @author jed
 * @date 2017��8��13������11:54:35
 *
 */
@Controller
@RequestMapping("/contact")
public class ContactController {

	@Resource
	private ContactService contactService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));   //true:���������ֵ��false:����Ϊ��ֵ
	}
	
	/**
	 * @MethodName: list
	 * @Description: ��ѯ������¼
	 * @author jed
	 * @date 2017��8��19������4:10:25
	 * @param @param page
	 * @param @param rows
	 * @param @param Contact
	 * @param @param response
	 * @param @return    
	 * @return String    ��������
	 * @param page
	 * @param rows
	 * @param Contact
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="cusId",required=false)String cusId,HttpServletResponse response) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cusId",cusId);
		List<Contact> contactList = contactService.find(map);
		JSONObject result = new JSONObject();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setExcludes(new String[]{"customer"});
		jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		JSONArray jsonArray = new JSONArray();
		if(CollectionUtil.isNotEmpty(contactList)){
			jsonArray = JSONArray.fromObject(contactList,jsonConfig);
		}
		result.put("rows", jsonArray);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: save
	 * @Description: ��ӻ����޸Ľ�����¼
	 * @author jed
	 * @date 2017��8��19������9:32:19
	 * @param @param contact
	 * @param @param response
	 * @param @return    
	 * @return String    ��������
	 * @param contact
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/save")
	public String save(Contact contact,HttpServletResponse response) throws Exception{
		long resultTotal=0L;
		if(contact.getId()==null){// ���
			resultTotal = contactService.save(contact);
		}else{//����
			resultTotal = contactService.update(contact);
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
	 * @Description: ɾ��������¼
	 * @author jed
	 * @date 2017��8��19������10:56:44
	 * @param @param ids
	 * @param @param response
	 * @param @return
	 * @param @throws Exception    
	 * @return String    ��������
	 * @param ids
	 * @param response
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="id")String id,HttpServletResponse response) throws Exception{
		contactService.delete(Integer.parseInt(id));
		JSONObject result = new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
	
	
}
