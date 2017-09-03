/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.Customer;

/**
 * @ClassName: CustomerDao
 * @Description:�ͻ�Dao
 * @author jed
 * @date 2017��9��3������9:21:30
 *
 */
public interface CustomerDao {
	
	/**
	 * 
	 * @MethodName: find
	 * @Description: ��ѯ���пͻ�
	 * @author jed
	 * @date 2017��8��19������9:50:46
	 * @param @return    
	 * @return List<Customer>    ��������
	 * @return
	 *
	 */
	public List<Customer> find(Map<String, Object> map);
	
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
