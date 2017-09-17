/**
 * 
 */
package com.hik.dao;

import com.hik.entity.CustomerService;

/**
 * @ClassName: CustomerServiceDao
 * @Description: 客户服务Dao接口
 * @author jed
 * @date 2017年9月17日下午7:11:42
 *
 */
public interface CustomerServiceDao {

	/**
	 * 
	 * @MethodName: save
	 * @Description: 添加客户服务
	 * @author jed
	 * @date 2017年9月17日下午7:12:45
	 * @param @param customerService
	 * @param @return    
	 * @return int    返回类型
	 * @param customerService
	 * @return
	 *
	 */
	public int save(CustomerService customerService);
}
