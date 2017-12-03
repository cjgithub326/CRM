/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.Customer;
import com.hik.entity.CustomerGc;
import com.hik.entity.CustomerGx;

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
	
	/**
	 * 
	 * @MethodName: findCustomerLoss
	 * @Description: ������ʧ�Ŀͻ� 6����δ�µ��Ŀͻ�
	 * @author jed
	 * @date 2017��9��10������11:45:01
	 * @param @return    
	 * @return List<Customer>    ��������
	 * @return
	 *
	 */
	public List<Customer> findCustomerLoss();
	
	/**
	 * 
	 * @MethodName: findCustomerGx
	 * @Description: ��ѯ�ͻ�����
	 * @author jed
	 * @date 2017��12��3������10:15:49
	 * @param @param map
	 * @param @return    
	 * @return List<CustomerGx>    ��������
	 * @param map
	 * @return
	 *
	 */
	public List<CustomerGx> findCustomerGx(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName: getTotalCustomerGx
	 * @Description: ��ѯ�ͻ����׼�¼��
	 * @author jed
	 * @date 2017��12��3������10:16:12
	 * @param @param map
	 * @param @return    
	 * @return Long    ��������
	 * @param map
	 * @return
	 *
	 */
	public Long getTotalCustomerGx(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName: findCustomerGc
	 * @Description: ��ѯ�ͻ�����
	 * @author jed
	 * @date 2017��12��3������3:54:06
	 * @param @return    
	 * @return List<CustomerGc>    ��������
	 * @return
	 *
	 */
	public List<CustomerGc> findCustomerGc();
}
