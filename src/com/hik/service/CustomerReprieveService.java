/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;

import com.hik.entity.CustomerReprieve;

/**
 * @ClassName: CustomerReprieveService
 * @Description: �ͻ���ʧ�ݻ�Service�ӿ���
 * @author jed
 * @date 2017��9��17������10:24:43
 *
 */
public interface CustomerReprieveService {

	/**
	 * 
	 * @MethodName: find
	 * @Description: ��ѯ�ͻ���ʧ�ݻ�����
	 * @author jed
	 * @date 2017��8��19������9:50:46
	 * @param @return    
	 * @return List<CustomerReprieve>    ��������
	 * @return
	 *
	 */
	public List<CustomerReprieve> find(Map<String, Object> map);
	
	
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
	 * @MethodName: save
	 * @Description: ��ӿͻ���ʧ�ݻ�
	 * @author jed
	 * @date 2017��8��19������6:19:47
	 * @param @param customerReprieve
	 * @param @return    
	 * @return int    ��������
	 * @param customerReprieve
	 * @return
	 *
	 */
	public int save(CustomerReprieve customerReprieve);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: �޸Ŀͻ���ʧ�ݻ�
	 * @author jed
	 * @date 2017��8��19������6:19:59
	 * @param @param customerReprieve
	 * @param @return    
	 * @return int    ��������
	 * @param customerReprieve
	 * @return
	 *
	 */
	public int update(CustomerReprieve customerReprieve);
	
	/**
	 *  
	 * @MethodName: delete
	 * @Description: ɾ���ͻ���ʧ�ݻ�
	 * @author jed
	 * @date 2017��8��19������6:20:18
	 * @param @param id
	 * @param @return    
	 * @return int    ��������
	 * @param id
	 * @return
	 *
	 */
	public int delete(Integer id);
}
