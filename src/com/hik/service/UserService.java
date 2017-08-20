/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;

import com.hik.entity.User;

/**
 * @ClassName: UserService
 * @Description: �û�Service�ӿ�
 * @author jed
 * @date 2017��8��13������11:49:22
 *
 */
public interface UserService {

	/**
	 * @MethodName: login
	 * @Description: �û���¼
	 * @author jed
	 * @date 2017��8��13������4:36:08
	 * @param @param user
	 * @param @return    
	 * @return User    ��������
	 * @param user
	 * @return
	 *
	 */
	public User login(User user);
	
	/**
	 * 
	 * @MethodName: find
	 * @Description: ��ѯ�����û�
	 * @author jed
	 * @date 2017��8��19������9:50:46
	 * @param @return    
	 * @return List<User>    ��������
	 * @return
	 *
	 */
	public List<User> find(Map<String, Object> map);
	
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
	 * @Description: ����û�
	 * @author jed
	 * @date 2017��8��19������6:19:47
	 * @param @param user
	 * @param @return    
	 * @return int    ��������
	 * @param user
	 * @return
	 *
	 */
	public int save(User user);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: �޸��û�
	 * @author jed
	 * @date 2017��8��19������6:19:59
	 * @param @param user
	 * @param @return    
	 * @return int    ��������
	 * @param user
	 * @return
	 *
	 */
	public int update(User user);
	
	/**
	 *  
	 * @MethodName: delete
	 * @Description: ɾ���û�
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
