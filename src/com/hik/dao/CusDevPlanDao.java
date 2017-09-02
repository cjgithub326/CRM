/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.CusDevPlan;

/**
 * @ClassName: CusDevPlanDao
 * @Description: 开发计划项Dao接口
 * @author jed
 * @date 2017年8月13日上午11:47:48
 *
 */
public interface CusDevPlanDao {

	
	/**
	 * 
	 * @MethodName: find
	 * @Description: 查询开发计划项集合
	 * @author jed
	 * @date 2017年8月19日上午9:50:46
	 * @param @return    
	 * @return List<CusDevPlan>    返回类型
	 * @return
	 *
	 */
	public List<CusDevPlan> find(Map<String, Object> map);
	
	
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
	 * @Description: 添加开发计划项
	 * @author jed
	 * @date 2017年8月19日下午6:19:47
	 * @param @param cusDevPlan
	 * @param @return    
	 * @return int    返回类型
	 * @param cusDevPlan
	 * @return
	 *
	 */
	public int save(CusDevPlan cusDevPlan);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: 修改开发计划项
	 * @author jed
	 * @date 2017年8月19日下午6:19:59
	 * @param @param cusDevPlan
	 * @param @return    
	 * @return int    返回类型
	 * @param cusDevPlan
	 * @return
	 *
	 */
	public int update(CusDevPlan cusDevPlan);
	
	/**
	 *  
	 * @MethodName: delete
	 * @Description: 删除开发计划项
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
