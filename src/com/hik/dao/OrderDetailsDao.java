/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.OrderDetails;


/**
 * @ClassName: OrderDetailsDao
 * @Description: ������ϸDao�ӿ�
 * @author jed
 * @date 2017��8��13������11:47:48
 *
 */
public interface OrderDetailsDao {

	
	/**
	 * 
	 * @MethodName: find
	 * @Description: ��ѯ������ϸ����
	 * @author jed
	 * @date 2017��8��19������9:50:46
	 * @param @return    
	 * @return List<OrderDetails>    ��������
	 * @return
	 *
	 */
	public List<OrderDetails> find(Map<String, Object> map);
	
	
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
	
	/**
	 * 
	 * @MethodName: getTotalPriceByOrderId
	 * @Description: ��ȡָ���������ܽ��
	 * @author jed
	 * @date 2017��9��5������9:50:38
	 * @param @param orderId
	 * @param @return    
	 * @return float    ��������
	 * @param orderId
	 * @return
	 *
	 */
	public Float getTotalPriceByOrderId(Integer orderId);
	
}
