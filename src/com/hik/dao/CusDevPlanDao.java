/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.CusDevPlan;

/**
 * @ClassName: CusDevPlanDao
 * @Description: �����ƻ���Dao�ӿ�
 * @author jed
 * @date 2017��8��13������11:47:48
 *
 */
public interface CusDevPlanDao {

	
	/**
	 * 
	 * @MethodName: find
	 * @Description: ��ѯ�����ƻ����
	 * @author jed
	 * @date 2017��8��19������9:50:46
	 * @param @return    
	 * @return List<CusDevPlan>    ��������
	 * @return
	 *
	 */
	public List<CusDevPlan> find(Map<String, Object> map);
	
	
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
	
	
	/**
	 * @MethodName: save
	 * @Description: ��ӿ����ƻ���
	 * @author jed
	 * @date 2017��8��19������6:19:47
	 * @param @param cusDevPlan
	 * @param @return    
	 * @return int    ��������
	 * @param cusDevPlan
	 * @return
	 *
	 */
	public int save(CusDevPlan cusDevPlan);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: �޸Ŀ����ƻ���
	 * @author jed
	 * @date 2017��8��19������6:19:59
	 * @param @param cusDevPlan
	 * @param @return    
	 * @return int    ��������
	 * @param cusDevPlan
	 * @return
	 *
	 */
	public int update(CusDevPlan cusDevPlan);
	
	/**
	 *  
	 * @MethodName: delete
	 * @Description: ɾ�������ƻ���
	 * @author jed
	 * @date 2017��8��19������6:20:18
	 * @param @param id
	 * @param @return    
	 * @return int    ��������
	 * @param id
	 * @return
	 *
	 */
	public int delete(Integer id);
	
}
