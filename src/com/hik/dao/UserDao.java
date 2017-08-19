/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

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
	
	/**
	 * 
	 * @MethodName: find
	 * @Description: 查询所有用户
	 * @author jed
	 * @date 2017年8月19日上午9:50:46
	 * @param @return    
	 * @return List<User>    返回类型
	 * @return
	 *
	 */
	public List<User> find(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName: getTotal
	 * @Description: 获取总记录数
	 * @author jed
	 * @date 2017年8月19日上午9:52:52
	 * @param @param map
	 * @param @return    
	 * @return Long    返回类型
	 * @param map
	 * @return
	 *
	 */
	public Long getTotal(Map<String, Object> map);
}
