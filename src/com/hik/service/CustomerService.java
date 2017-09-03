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
	
	/**
	 * 
	 * @MethodName: save
	 * @Description: ����ͻ���Ϣ
	 * @author jed
	 * @date 2017��9��3������10:41:15
	 * @param @param customer
	 * @param @return    
	 * @return int    ��������
	 * @param customer
	 * @return
	 *
	 */
	public int save(Customer customer);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: �޸Ŀͻ�����
	 * @author jed
	 * @date 2017��9��3������12:21:22
	 * @param @param customer
	 * @param @return    
	 * @return int    ��������
	 * @param customer
	 * @return
	 *
	 */
	public int update(Customer customer);
	
	/**
	 * 
	 * @MethodName: delete
	 * @Description: ɾ���ͻ���Ϣ
	 * @author jed
	 * @date 2017��9��3������12:21:35
	 * @param @param Integer
	 * @param @return    
	 * @return int    ��������
	 * @param customer
	 * @return
	 *
	 */
	public int delete(Integer id);
	
	/**
	 * 
	 * @MethodName: findById
	 * @Description: ����id��ȡ�ͻ�ʵ��
	 * @author jed
	 * @date 2017��9��3������5:31:01
	 * @param @param id
	 * @param @return    
	 * @return Customer    ��������
	 * @param id
	 * @return
	 *
	 */
	public Customer findById(Integer id);

}
