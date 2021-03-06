/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;


import com.hik.entity.DataDic;

/**
 * @ClassName: DataDicService
 * @Description: 数据字典接口
 * @author jed
 * @date 2017年8月20日上午10:13:58
 *
 */
public interface DataDicService {
	
	
	/**
	 * 
	 * @MethodName: find
	 * @Description: 查询数据字典
	 * @author jed
	 * @date 2017年8月19日上午9:50:46
	 * @param @return    
	 * @return List<DataDic>    返回类型
	 * @return
	 *
	 */
	public List<DataDic> find(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName: findAll
	 * @Description: 查询所有的数据字典名称集合
	 * @author jed
	 * @date 2017年8月20日上午11:32:07
	 * @param @return    
	 * @return List<DataDic>    返回类型
	 * @return
	 *
	 */
	public List<DataDic> findAll();
	
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
	 * @Description: 添加数据字典
	 * @author jed
	 * @date 2017年8月19日下午6:19:47
	 * @param @param dataDic
	 * @param @return    
	 * @return int    返回类型
	 * @param dataDic
	 * @return
	 *
	 */
	public int save(DataDic dataDic);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: 修改数据字典
	 * @author jed
	 * @date 2017年8月19日下午6:19:59
	 * @param @param dataDic
	 * @param @return    
	 * @return int    返回类型
	 * @param dataDic
	 * @return
	 *
	 */
	public int update(DataDic dataDic);
	
	/**
	 *  
	 * @MethodName: delete
	 * @Description: 删除数据字典
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
