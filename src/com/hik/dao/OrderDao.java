/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.Order;

/**
 * @ClassName: OrderDao
 * @Description: ����Dao�ӿ�
 * @author jed
 * @date 2017��8��13������11:47:48
 *
 */
public interface OrderDao {

	
	/**
	 * 
	 * @MethodName: find
	 * @Description: ��ѯ��������
	 * @author jed
	 * @date 2017��8��19������9:50:46
	 * @param @return    
	 * @return List<Order>    ��������
	 * @return
	 *
	 */
	public List<Order> find(Map<String, Object> map);
	
	
	/**
	 * 
	 * @MethodName: getTotal
	 * @Description: ��ȡ�ܼ�¼��
	 * @author jed
	 * @date 2017��8��19������9:52:52
	 * @param @param map
	 * @param @return    
	 * @return Long    ��������
	 * @param map
	 * @return
	 *
	 */
	public Long getTotal(Map<String, Object> map);
	
	
}