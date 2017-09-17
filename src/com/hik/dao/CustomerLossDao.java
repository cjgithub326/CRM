/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import org.apache.catalina.authenticator.SavedRequest;

import com.hik.entity.CustomerLoss;

/**
 * @ClassName: CustomerLossDao
 * @Description: �ͻ���ʧDao�ӿ�
 * @author jed
 * @date 2017��8��13������11:47:48
 *
 */
public interface CustomerLossDao {

	
	/**
	 * 
	 * @MethodName: find
	 * @Description: ��ѯ�ͻ���ʧ����
	 * @author jed
	 * @date 2017��8��19������9:50:46
	 * @param @return    
	 * @return List<CustomerLoss>    ��������
	 * @return
	 *
	 */
	public List<CustomerLoss> find(Map<String, Object> map);
	
	
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
	 * @MethodName: saveCustomerLoss
	 * @Description: �����ʧ�ͻ�
	 * @author jed
	 * @date 2017��9��10������11:14:55
	 * @param @param customerLoss
	 * @param @return    
	 * @return int    ��������
	 * @param customerLoss
	 * @return
	 *
	 */
	public int saveCustomerLoss(CustomerLoss customerLoss);
	
	/**
	 * 
	 * @MethodName: findById
	 * @Description: ͨ��id���ҿͻ���ʧ
	 * @author jed
	 * @date 2017��9��17������10:12:46
	 * @param @param id
	 * @param @return    
	 * @return CustomerLoss    ��������
	 * @param id
	 * @return
	 *
	 */
	public CustomerLoss findById(Integer id);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: �޸Ŀͻ���ʧ��¼
	 * @author jed
	 * @date 2017��9��17������10:13:26
	 * @param @param customerLoss
	 * @param @return    
	 * @return int    ��������
	 * @param customerLoss
	 * @return
	 *
	 */
	public int update(CustomerLoss customerLoss);
	
}
