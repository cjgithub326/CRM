/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;

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
	
	/**
	 * @MethodName: save
	 * @Description: 添加用户
	 * @author jed
	 * @date 2017年8月19日下午6:19:47
	 * @param @param user
	 * @param @return    
	 * @return int    返回类型
	 * @param user
	 * @return
	 *
	 */
	public int save(User user);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: 修改用户
	 * @author jed
	 * @date 2017年8月19日下午6:19:59
	 * @param @param user
	 * @param @return    
	 * @return int    返回类型
	 * @param user
	 * @return
	 *
	 */
	public int update(User user);
	
	/**
	 *  
	 * @MethodName: delete
	 * @Description: 删除用户
	 * @author jed
	 * @date 2017年8月19日下午6:20:18
	 * @param @param id
	 * @param @return    
	 * @return int    返回类型
	 * @param id
	 * @return
	 *
	 */
	public int delete(Integer id);
}
