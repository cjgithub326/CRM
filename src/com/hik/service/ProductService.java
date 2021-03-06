/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;


import com.hik.entity.Product;

/**
 * @ClassName: ProductService
 * @Description: 产品信息接口
 * @author jed
 * @date 2017年8月20日上午10:13:58
 *
 */
public interface ProductService {
	
	
	/**
	 * 
	 * @MethodName: find
	 * @Description: 查询所有产品
	 * @author jed
	 * @date 2017年8月19日上午9:50:46
	 * @param @return    
	 * @return List<Product>    返回类型
	 * @return
	 *
	 */
	public List<Product> find(Map<String, Object> map);
	
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
