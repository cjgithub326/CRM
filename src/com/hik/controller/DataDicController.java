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
import com.hik.entity.DataDic;
import com.hik.service.DataDicService;
import com.hik.util.CollectionUtil;
import com.hik.util.ResponseUtil;
import com.hik.util.StringUtil;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @ClassName: DataDicController
 * @Description: 产品Controller层
 * @author jed
 * @date 2017年8月13日上午11:54:35
 *
 */
@Controller
@RequestMapping("/dataDic")
public class DataDicController {

	@Resource
	private DataDicService dataDicService;
	
	
	/**
	 * @MethodName: list
	 * @Description: 分页条件查询数据字典
	 * @author jed
	 * @date 2017年8月19日下午4:10:25
	 * @param @param page
	 * @param @param rows
	 * @param @param DataDic
	 * @param @param response
	 * @param @return    
	 * @return String    返回类型
	 * @param page
	 * @param rows
	 * @param DataDic
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,DataDic dataDic,HttpServletResponse response) throws Exception{
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("dataDicName", dataDic.getDataDicName());
		map.put("dataDicValue",StringUtil.formatLike(dataDic.getDataDicValue()));
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<DataDic> dataDicList = dataDicService.find(map);
		Long total = dataDicService.getTotal(map);
		JSONObject result = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		if(CollectionUtil.isNotEmpty(dataDicList)){
			jsonArray = JSONArray.fromObject(dataDicList);
		}
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: dataDicNameComboList
	 * @Description: 查询所有的数据字典名称
	 * @author jed
	 * @date 2017年8月20日上午11:48:32
	 * @param @param response
	 * @param @return    
	 * @return String    返回类型
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/findDataDicName")
	public String dataDicNameComboList(HttpServletResponse response) throws Exception{
		JSONArray jsonArray = new JSONArray();
		List<DataDic> dataDicList = dataDicService.findAll();
		if(CollectionUtil.isNotEmpty(dataDicList)){
			jsonArray = JSONArray.fromObject(dataDicList);
		}
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: dataDicComboList
	 * @Description: 根据数据字典名称查找，用户下拉框
	 * @author jed
	 * @date 2017年9月3日上午11:05:01
	 * @param @param dataName
	 * @param @param response
	 * @param @return    
	 * @return String    返回类型
	 * @param dataName
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/dataDicComboList")
	public String dataDicComboList(@RequestParam(value="dataDicName")String dataDicName,HttpServletResponse response) throws Exception{
		JSONArray jsonArray = new JSONArray();
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("dataDicName", dataDicName);
		List<DataDic> dataDicList = dataDicService.find(map);
		if(CollectionUtil.isNotEmpty(dataDicList)){
			jsonArray = JSONArray.fromObject(dataDicList);
		}
		ResponseUtil.write(response, jsonArray);
		return null;
	}
	
	/**
	 * 
	 * @MethodName: save
	 * @Description: 添加或者修改数据字典
	 * @author jed
	 * @date 2017年8月19日下午9:32:19
	 * @param @param dataDic
	 * @param @param response
	 * @param @return    
	 * @return String    返回类型
	 * @param dataDic
	 * @param response
	 * @return
	 * @throws Exception 
	 *
	 */
	@RequestMapping("/save")
	public String save(DataDic dataDic,HttpServletResponse response) throws Exception{
		long resultTotal=0L;
		if(dataDic.getId()==null){//添加
			resultTotal = dataDicService.save(dataDic);
		}else{//更新
			resultTotal = dataDicService.update(dataDic);
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
	 * @Description: 删除数据字典
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
	public String delete(@RequestParam(value="ids")String ids,HttpServletResponse response) throws Exception{
		String[] idsStr = ids.split(",");
		for(int i=0;i<idsStr.length;i++){
			dataDicService.delete(Integer.parseInt(idsStr[i]));
		}
		JSONObject result = new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
	
}
