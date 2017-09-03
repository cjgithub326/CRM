/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;


import com.hik.entity.Customer;

/**
 * @ClassName: CustomerService
 * @Description: �ͻ���Ϣ�ӿ�
 * @author jed
 * @date 2017��8��20������10:13:58
 *
 */
public interface CustomerService {
	
	
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
