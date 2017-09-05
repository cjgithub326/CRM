/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;

import com.hik.entity.Contact;

/**
 * @ClassName: ContactService
 * @Description: 交往记录Service接口
 * @author jed
 * @date 2017年9月4日下午10:20:25
 *
 */
public interface ContactService {

	/**
	 * 
	 * @MethodName: find
	 * @Description: 查询交往记录集合
	 * @author jed
	 * @date 2017年8月19日上午9:50:46
	 * @param @return    
	 * @return List<Contact>    返回类型
	 * @return
	 *
	 */
	public List<Contact> find(Map<String, Object> map);
	
	
	/**
	 * 
	 * @MethodName: getTotal
	 * @Description: 获取总记录数
	 * @author jed
	 * @date 2017年8月19日上午9:52:52
	 * @param @param map
	 * @param @return    
	 * @return Long    返回类型
	 * @param map
	 * @return
	 *
	 */
	public Long getTotal(Map<String, Object> map);
	
	
	/**
	 * @MethodName: save
	 * @Description: 添加交往记录
	 * @author jed
	 * @date 2017年8月19日下午6:19:47
	 * @param @param contact
	 * @param @return    
	 * @return int    返回类型
	 * @param contact
	 * @return
	 *
	 */
	public int save(Contact contact);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: 修改交往记录
	 * @author jed
	 * @date 2017年8月19日下午6:19:59
	 * @param @param contact
	 * @param @return    
	 * @return int    返回类型
	 * @param contact
	 * @return
	 *
	 */
	public int update(Contact contact);
	
	/**
	 *  
	 * @MethodName: delete
	 * @Description: 删除交往记录
	 * @author jed
	 * @date 2017年8月19日下午6:20:18
	 * @param @param id
	 * @param @return    
	 * @return int    返回类型
	 * @param id
	 * @return
	 *
	 */
	public int delete(Integer id);
}
