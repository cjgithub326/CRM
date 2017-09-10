/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;

import com.hik.entity.CustomerLoss;

/**
 * @ClassName: CustomerLossService
 * @Description: 客户流失接口类
 * @author jed
 * @date 2017年9月10日下午5:52:13
 *
 */
public interface CustomerLossService {

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
}
