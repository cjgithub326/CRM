/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;

import com.hik.entity.CustomerLoss;

/**
 * @ClassName: CustomerLossService
 * @Description: �ͻ���ʧ�ӿ���
 * @author jed
 * @date 2017��9��10������5:52:13
 *
 */
public interface CustomerLossService {

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
}
