/**
 * 
 */
package com.hik.service;

import com.hik.entity.User;

/**
 * @ClassName: UserService
 * @Description: 用户Service接口
 * @author jed
 * @date 2017年8月13日上午11:49:22
 *
 */
public interface UserService {

	/**
	 * @MethodName: login
	 * @Description: 用户登录
	 * @author jed
	 * @date 2017年8月13日下午4:36:08
	 * @param @param user
	 * @param @return    
	 * @return User    返回类型
	 * @param user
	 * @return
	 *
	 */
	public User login(User user);
}
