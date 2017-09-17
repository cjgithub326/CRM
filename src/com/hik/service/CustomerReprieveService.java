/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;

import com.hik.entity.CustomerReprieve;

/**
 * @ClassName: CustomerReprieveService
 * @Description: 客户流失暂缓Service接口类
 * @author jed
 * @date 2017年9月17日上午10:24:43
 *
 */
public interface CustomerReprieveService {

	/**
	 * 
	 * @MethodName: find
	 * @Description: 查询客户流失暂缓集合
	 * @author jed
	 * @date 2017年8月19日上午9:50:46
	 * @param @return    
	 * @return List<CustomerReprieve>    返回类型
	 * @return
	 *
	 */
	public List<CustomerReprieve> find(Map<String, Object> map);
	
	
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
	 * @Description: 添加客户流失暂缓
	 * @author jed
	 * @date 2017年8月19日下午6:19:47
	 * @param @param customerReprieve
	 * @param @return    
	 * @return int    返回类型
	 * @param customerReprieve
	 * @return
	 *
	 */
	public int save(CustomerReprieve customerReprieve);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: 修改客户流失暂缓
	 * @author jed
	 * @date 2017年8月19日下午6:19:59
	 * @param @param customerReprieve
	 * @param @return    
	 * @return int    返回类型
	 * @param customerReprieve
	 * @return
	 *
	 */
	public int update(CustomerReprieve customerReprieve);
	
	/**
	 *  
	 * @MethodName: delete
	 * @Description: 删除客户流失暂缓
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
