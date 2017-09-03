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

import com.hik.entity.LinkMan;
import com.hik.service.LinkManService;
import com.hik.util.CollectionUtil;
import com.hik.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * @ClassName: LinkManController
 * @Description: ��ϵ��Controller��
 * @author jed
 * @date 2017��8��13������11:54:35
 *
 */
@Controller
@RequestMapping("/linkMan")
public class LinkManController {

	@Resource
	private LinkManService linkManService;
	
	
	/**
	 * @MethodName: list
	 * @Description: ��ѯ��ϵ��
	 * @author jed
	 * @date 2017��8��19������4:10:25
	 * @param @param page
	 * @param @param rows
	 * @param @param LinkMan
	 * @param @param response
	 * @param @return    
	 * @return String    ��������
	 * @param page
	 * @param rows
	 * @param LinkMan
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="cusId",required=false)String cusId,HttpServletResponse response) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cusId",cusId);
		List<LinkMan> linkManList = linkManService.find(map);
		JSONObject result = new JSONObject();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setExcludes(new String[]{"customer"});
		JSONArray jsonArray = new JSONArray();
		if(CollectionUtil.isNotEmpty(linkManList)){
			jsonArray = JSONArray.fromObject(linkManList,jsonConfig);
		}
		result.put("rows", jsonArray);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: save
	 * @Description: ��ӻ����޸���ϵ��
	 * @author jed
	 * @date 2017��8��19������9:32:19
	 * @param @param linkMan
	 * @param @param response
	 * @param @return    
	 * @return String    ��������
	 * @param linkMan
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/save")
	public String save(LinkMan linkMan,HttpServletResponse response) throws Exception{
		long resultTotal=0L;
		if(linkMan.getId()==null){// ���
			resultTotal = linkManService.save(linkMan);
		}else{//����
			resultTotal = linkManService.update(linkMan);
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
	 * @Description: ɾ����ϵ��
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
		linkManService.delete(Integer.parseInt(id));
		JSONObject result = new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
	
	
}
