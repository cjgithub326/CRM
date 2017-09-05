/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.OrderDetails;


/**
 * @ClassName: OrderDetailsDao
 * @Description: 订单明细Dao接口
 * @author jed
 * @date 2017年8月13日上午11:47:48
 *
 */
public interface OrderDetailsDao {

	
	/**
	 * 
	 * @MethodName: find
	 * @Description: 查询订单明细集合
	 * @author jed
	 * @date 2017年8月19日上午9:50:46
	 * @param @return    
	 * @return List<OrderDetails>    返回类型
	 * @return
	 *
	 */
	public List<OrderDetails> find(Map<String, Object> map);
	
	
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
	 * @MethodName: getTotalPriceByOrderId
	 * @Description: 获取指定订单的总金额
	 * @author jed
	 * @date 2017年9月5日下午9:50:38
	 * @param @param orderId
	 * @param @return    
	 * @return float    返回类型
	 * @param orderId
	 * @return
	 *
	 */
	public Float getTotalPriceByOrderId(Integer orderId);
	
}
