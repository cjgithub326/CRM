/**
 * 
 */
package com.hik.dao;

import com.hik.entity.User;

/**
 * @ClassName: UserDao
 * @Description: 用户Dao接口
 * @author jed
 * @date 2017年8月13日上午11:47:48
 *
 */
public interface UserDao {

	/**
	 * @MethodName: login
	 * @Description: 用户登录 
	 * @author jed
	 * @date 2017年8月13日下午4:35:42
	 * @param @param user
	 * @param @return    
	 * @return User    返回类型
	 * @param user
	 * @return
	 *
	 */
	public User login(User user);
}
