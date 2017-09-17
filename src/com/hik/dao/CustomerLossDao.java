/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import org.apache.catalina.authenticator.SavedRequest;

import com.hik.entity.CustomerLoss;

/**
 * @ClassName: CustomerLossDao
 * @Description: 客户流失Dao接口
 * @author jed
 * @date 2017年8月13日上午11:47:48
 *
 */
public interface CustomerLossDao {

	
	/**
	 * 
	 * @MethodName: find
	 * @Description: 查询客户流失集合
	 * @author jed
	 * @date 2017年8月19日上午9:50:46
	 * @param @return    
	 * @return List<CustomerLoss>    返回类型
	 * @return
	 *
	 */
	public List<CustomerLoss> find(Map<String, Object> map);
	
	
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
	 * @MethodName: saveCustomerLoss
	 * @Description: 添加流失客户
	 * @author jed
	 * @date 2017年9月10日下午11:14:55
	 * @param @param customerLoss
	 * @param @return    
	 * @return int    返回类型
	 * @param customerLoss
	 * @return
	 *
	 */
	public int saveCustomerLoss(CustomerLoss customerLoss);
	
	/**
	 * 
	 * @MethodName: findById
	 * @Description: 通过id查找客户流失
	 * @author jed
	 * @date 2017年9月17日上午10:12:46
	 * @param @param id
	 * @param @return    
	 * @return CustomerLoss    返回类型
	 * @param id
	 * @return
	 *
	 */
	public CustomerLoss findById(Integer id);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: 修改客户流失记录
	 * @author jed
	 * @date 2017年9月17日上午10:13:26
	 * @param @param customerLoss
	 * @param @return    
	 * @return int    返回类型
	 * @param customerLoss
	 * @return
	 *
	 */
	public int update(CustomerLoss customerLoss);
	
}
