/**
 * 
 */
package com.hik.dao;

import com.hik.entity.User;

/**
 * @ClassName: UserDao
 * @Description: �û�Dao�ӿ�
 * @author jed
 * @date 2017��8��13������11:47:48
 *
 */
public interface UserDao {

	/**
	 * @MethodName: login
	 * @Description: �û���¼ 
	 * @author jed
	 * @date 2017��8��13������4:35:42
	 * @param @param user
	 * @param @return    
	 * @return User    ��������
	 * @param user
	 * @return
	 *
	 */
	public User login(User user);
}