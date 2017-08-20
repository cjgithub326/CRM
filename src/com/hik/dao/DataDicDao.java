/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.DataDic;

/**
 * @ClassName: DataDicDao
 * @Description: �����ֵ�Dao�ӿ�
 * @author jed
 * @date 2017��8��13������11:47:48
 *
 */
public interface DataDicDao {

	
	/**
	 * 
	 * @MethodName: find
	 * @Description: ��ѯ�����ֵ伯��
	 * @author jed
	 * @date 2017��8��19������9:50:46
	 * @param @return    
	 * @return List<DataDic>    ��������
	 * @return
	 *
	 */
	public List<DataDic> find(Map<String, Object> map);
	
	/**
	 * 
	 * @MethodName: findAll
	 * @Description: ��ѯ���е������ֵ����Ƽ���
	 * @author jed
	 * @date 2017��8��20������11:32:07
	 * @param @return    
	 * @return List<DataDic>    ��������
	 * @return
	 *
	 */
	public List<DataDic> findAll();
	
	/**
	 * 
	 * @MethodName: getTotal
	 * @Description: ��ȡ�ܼ�¼��
	 * @author jed
	 * @date 2017��8��19������9:52:52
	 * @param @param map
	 * @param @return    
	 * @return Long    ��������
	 * @param map
	 * @return
	 *
	 */
	public Long getTotal(Map<String, Object> map);
	
}
