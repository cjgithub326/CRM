/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;

import com.hik.entity.CustomerService;
/**
 * @ClassName: CustomerServiceService
 * @Description: �ͻ�����Servie�ӿ�
 * @author jed
 * @date 2017��9��17������7:16:42
 *
 */
public interface CustomerServiceService {

	/**
	 * 
	 * @MethodName: save
	 * @Description: ��ӿͻ�����
	 * @author jed
	 * @date 2017��9��17������7:12:45
	 * @param @param customerService
	 * @param @return    
	 * @return int    ��������
	 * @param customerService
	 * @return
	 *
	 */
	public int save(CustomerService customerService);
	
	/**
	 * 
	 * @MethodName: find
	 * @Description: ���ҷ��񼯺�
	 * @author jed
	 * @date 2017��9��17������11:03:50
	 * @param @param map
	 * @param @return    
	 * @return List<CustomerService>    ��������
	 * @param map
	 * @return
	 *
	 */
	public List<CustomerService> find(Map<String, Object>map);
	
	/**
	 * 
	 * @MethodName: getTotal
	 * @Description: ��ȡ�ܼ�¼��
	 * @author jed
	 * @date 2017��9��17������11:04:59
	 * @param @param map
	 * @param @return    
	 * @return Long    ��������
	 * @param map
	 * @return
	 *
	 */
	public Long getTotal(Map<String, Object>map);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: �޸Ŀͻ�����
	 * @author jed
	 * @date 2017��9��17������11:31:06
	 * @param @param customerService
	 * @param @return    
	 * @return int    ��������
	 * @param customerService
	 * @return
	 *
	 */
	public int update(CustomerService customerService);
}
