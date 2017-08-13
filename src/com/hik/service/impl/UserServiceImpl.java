/**
 * 
 */
package com.hik.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hik.dao.UserDao;
import com.hik.entity.User;
import com.hik.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: 用户Service实现类
 * @author jed
 * @date 2017年8月13日上午11:50:12
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDao userDao;

	@Override
	public User login(User user) {
		return userDao.login(user);
	}

}
