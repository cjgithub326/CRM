/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;

import com.hik.entity.Contact;

/**
 * @ClassName: ContactService
 * @Description: ������¼Service�ӿ�
 * @author jed
 * @date 2017��9��4������10:20:25
 *
 */
public interface ContactService {

	/**
	 * 
	 * @MethodName: find
	 * @Description: ��ѯ������¼����
	 * @author jed
	 * @date 2017��8��19������9:50:46
	 * @param @return    
	 * @return List<Contact>    ��������
	 * @return
	 *
	 */
	public List<Contact> find(Map<String, Object> map);
	
	
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
	 * @Description: ��ӽ�����¼
	 * @author jed
	 * @date 2017��8��19������6:19:47
	 * @param @param contact
	 * @param @return    
	 * @return int    ��������
	 * @param contact
	 * @return
	 *
	 */
	public int save(Contact contact);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: �޸Ľ�����¼
	 * @author jed
	 * @date 2017��8��19������6:19:59
	 * @param @param contact
	 * @param @return    
	 * @return int    ��������
	 * @param contact
	 * @return
	 *
	 */
	public int update(Contact contact);
	
	/**
	 *  
	 * @MethodName: delete
	 * @Description: ɾ��������¼
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
