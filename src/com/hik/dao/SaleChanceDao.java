/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.SaleChance;

/**
 * @ClassName: SaleChanceDao
 * @Description: 销售机会Dao接口
 * @author jed
 * @date 2017年8月13日上午11:47:48
 *
 */
public interface SaleChanceDao {

	
	/**
	 * 
	 * @MethodName: find
	 * @Description: 查询所有销售机会
	 * @author jed
	 * @date 2017年8月19日上午9:50:46
	 * @param @return    
	 * @return List<SaleChance>    返回类型
	 * @return
	 *
	 */
	public List<SaleChance> find(Map<String, Object> map);
	
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
	 * 
	 * @MethodName: save
	 * @Description: 添加销售机会
	 * @author jed
	 * @date 2017年8月27日上午10:05:36
	 * @param @param saleChance
	 * @param @return    
	 * @return int    返回类型
	 * @param saleChance
	 * @return
	 *
	 */
	public int save(SaleChance saleChance);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: 修改销售机会 
	 * @author jed
	 * @date 2017年8月27日下午4:26:13
	 * @param @param saleChance
	 * @param @return    
	 * @return int    返回类型
	 * @param saleChance
	 * @return
	 *
	 */
	public int update(SaleChance saleChance);
	
	/**
	 * 
	 * @MethodName: delete
	 * @Description: 删除销售机会
	 * @author jed
	 * @date 2017年8月27日下午4:26:46
	 * @param @param id
	 * @param @return    
	 * @return int    返回类型
	 * @param id
	 * @return
	 *
	 */
	public int delete(Integer id);
	
}
