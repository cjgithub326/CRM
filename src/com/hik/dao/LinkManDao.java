/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.LinkMan;

/**
 * @ClassName: LinkManDao
 * @Description: 联系人Dao接口
 * @author jed
 * @date 2017年8月13日上午11:47:48
 *
 */
public interface LinkManDao {

	
	/**
	 * 
	 * @MethodName: find
	 * @Description: 查询联系人集合
	 * @author jed
	 * @date 2017年8月19日上午9:50:46
	 * @param @return    
	 * @return List<LinkMan>    返回类型
	 * @return
	 *
	 */
	public List<LinkMan> find(Map<String, Object> map);
	
	
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
	 * @Description: 添加联系人
	 * @author jed
	 * @date 2017年8月19日下午6:19:47
	 * @param @param linkMan
	 * @param @return    
	 * @return int    返回类型
	 * @param linkMan
	 * @return
	 *
	 */
	public int save(LinkMan linkMan);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: 修改联系人
	 * @author jed
	 * @date 2017年8月19日下午6:19:59
	 * @param @param linkMan
	 * @param @return    
	 * @return int    返回类型
	 * @param linkMan
	 * @return
	 *
	 */
	public int update(LinkMan linkMan);
	
	/**
	 *  
	 * @MethodName: delete
	 * @Description: 删除联系人
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
