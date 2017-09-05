/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;

import com.hik.entity.Order;

/**
 * @ClassName: OrderService
 * @Description: 订单Service接口
 * @author jed
 * @date 2017年9月5日下午8:43:07
 *
 */
public interface OrderService {

	/**
	 * 
	 * @MethodName: find
	 * @Description: 查询订单集合
	 * @author jed
	 * @date 2017年8月19日上午9:50:46
	 * @param @return    
	 * @return List<Order>    返回类型
	 * @return
	 *
	 */
	public List<Order> find(Map<String, Object> map);
	
	
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
