/**
 * 
 */
package com.hik.service;

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
}
