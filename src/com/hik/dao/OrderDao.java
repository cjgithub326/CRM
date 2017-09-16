/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.Order;

/**
 * @ClassName: OrderDao
 * @Description: 订单Dao接口
 * @author jed
 * @date 2017年8月13日上午11:47:48
 *
 */
public interface OrderDao {

	
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
	
	/**
	 * 
	 * @MethodName: findById
	 * @Description: 根据id获取订单
	 * @author jed
	 * @date 2017年9月5日下午9:54:11
	 * @param @param id
	 * @param @return    
	 * @return Order    返回类型
	 * @param id
	 * @return
	 *
	 */
	public Order findById(Integer id);
	
	/**
	 * 
	 * @MethodName: findLastOrderByCusId
	 * @Description: 查找指定客户最近订单
	 * @author jed
	 * @date 2017年9月10日下午11:59:20
	 * @param @param cusId
	 * @param @return    
	 * @return Order    返回类型
	 * @param cusId
	 * @return
	 *
	 */
	public Order findLastOrderByCusId(Integer cusId);
	
}
