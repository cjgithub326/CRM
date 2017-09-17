/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;

import com.hik.entity.CustomerService;
/**
 * @ClassName: CustomerServiceService
 * @Description: 客户服务Servie接口
 * @author jed
 * @date 2017年9月17日下午7:16:42
 *
 */
public interface CustomerServiceService {

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
	
	/**
	 * 
	 * @MethodName: find
	 * @Description: 查找服务集合
	 * @author jed
	 * @date 2017年9月17日下午11:03:50
	 * @param @param map
	 * @param @return    
	 * @return List<CustomerService>    返回类型
	 * @param map
	 * @return
	 *
	 */
	public List<CustomerService> find(Map<String, Object>map);
	
	/**
	 * 
	 * @MethodName: getTotal
	 * @Description: 获取总记录数
	 * @author jed
	 * @date 2017年9月17日下午11:04:59
	 * @param @param map
	 * @param @return    
	 * @return Long    返回类型
	 * @param map
	 * @return
	 *
	 */
	public Long getTotal(Map<String, Object>map);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: 修改客户服务
	 * @author jed
	 * @date 2017年9月17日下午11:31:06
	 * @param @param customerService
	 * @param @return    
	 * @return int    返回类型
	 * @param customerService
	 * @return
	 *
	 */
	public int update(CustomerService customerService);
}
