/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.SaleChance;

/**
 * @ClassName: SaleChanceDao
 * @Description: ���ۻ���Dao�ӿ�
 * @author jed
 * @date 2017��8��13������11:47:48
 *
 */
public interface SaleChanceDao {

	
	/**
	 * 
	 * @MethodName: find
	 * @Description: ��ѯ�������ۻ���
	 * @author jed
	 * @date 2017��8��19������9:50:46
	 * @param @return    
	 * @return List<SaleChance>    ��������
	 * @return
	 *
	 */
	public List<SaleChance> find(Map<String, Object> map);
	
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
	 * 
	 * @MethodName: save
	 * @Description: ������ۻ���
	 * @author jed
	 * @date 2017��8��27������10:05:36
	 * @param @param saleChance
	 * @param @return    
	 * @return int    ��������
	 * @param saleChance
	 * @return
	 *
	 */
	public int save(SaleChance saleChance);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: �޸����ۻ��� 
	 * @author jed
	 * @date 2017��8��27������4:26:13
	 * @param @param saleChance
	 * @param @return    
	 * @return int    ��������
	 * @param saleChance
	 * @return
	 *
	 */
	public int update(SaleChance saleChance);
	
	/**
	 * 
	 * @MethodName: delete
	 * @Description: ɾ�����ۻ���
	 * @author jed
	 * @date 2017��8��27������4:26:46
	 * @param @param id
	 * @param @return    
	 * @return int    ��������
	 * @param id
	 * @return
	 *
	 */
	public int delete(Integer id);
	
}
