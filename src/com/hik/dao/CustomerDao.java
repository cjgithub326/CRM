/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.Customer;
import com.hik.entity.CustomerGc;
import com.hik.entity.CustomerGx;

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
	
	/**
	 * 
	 * @MethodName: save
	 * @Description: 保存客户信息
	 * @author jed
	 * @date 2017年9月3日上午10:41:15
	 * @param @param customer
	 * @param @return    
	 * @return int    返回类型
	 * @param customer
	 * @return
	 *
	 */
	public int save(Customer customer);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: 修改客户相信
	 * @author jed
	 * @date 2017年9月3日下午12:21:22
	 * @param @param customer
	 * @param @return    
	 * @return int    返回类型
	 * @param customer
	 * @return
	 *
	 */
	public int update(Customer customer);
	
	/**
	 * 
	 * @MethodName: delete
	 * @Description: 删除客户信息
	 * @author jed
	 * @date 2017年9月3日下午12:21:35
	 * @param @param Integer
	 * @param @return    
	 * @return int    返回类型
	 * @param customer
	 * @return
	 *
	 */
	public int delete(Integer id);
	
	/**
	 * 
	 * @MethodName: findById
	 * @Description: 根据id获取客户实体
	 * @author jed
	 * @date 2017年9月3日下午5:31:01
	 * @param @param id
	 * @param @return    
	 * @return Customer    返回类型
	 * @param id
	 * @return
	 *
	 */
	public Customer findById(Integer id);
	
	/**
	 * 
	 * @MethodName: findCustomerLoss
	 * @Description: 查找流失的客户 6个月未下单的客户
	 * @author jed
	 * @date 2017年9月10日下午11:45:01
	 * @param @return    
	 * @return List<Customer>    返回类型
	 * @return
	 *
	 */
	public List<Customer> findCustomerLoss();
	
	/**
	 * 
	 * @MethodName: findCustomerGx
	 * @Description: 查询客户贡献
	 * @author jed
	 * @date 2017年12月3日上午10:15:49
	 * @param @param map
	 * @param @return    
	 * @return List<CustomerGx>    返回类型
	 * @param map
	 * @return
	 *
	 */
	public List<CustomerGx> findCustomerGx(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName: getTotalCustomerGx
	 * @Description: 查询客户贡献记录数
	 * @author jed
	 * @date 2017年12月3日上午10:16:12
	 * @param @param map
	 * @param @return    
	 * @return Long    返回类型
	 * @param map
	 * @return
	 *
	 */
	public Long getTotalCustomerGx(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName: findCustomerGc
	 * @Description: 查询客户构成
	 * @author jed
	 * @date 2017年12月3日下午3:54:06
	 * @param @return    
	 * @return List<CustomerGc>    返回类型
	 * @return
	 *
	 */
	public List<CustomerGc> findCustomerGc();
}
