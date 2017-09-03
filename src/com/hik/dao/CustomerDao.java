/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.Customer;

/**
 * @ClassName: CustomerDao
 * @Description:客户Dao
 * @author jed
 * @date 2017年9月3日上午9:21:30
 *
 */
public interface CustomerDao {
	
	/**
	 * 
	 * @MethodName: find
	 * @Description: 查询所有客户
	 * @author jed
	 * @date 2017年8月19日上午9:50:46
	 * @param @return    
	 * @return List<Customer>    返回类型
	 * @return
	 *
	 */
	public List<Customer> find(Map<String, Object> map);
	
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
}
