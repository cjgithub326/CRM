/**
 * 
 */
package com.hik.service;

import java.util.List;
import java.util.Map;

import com.hik.entity.SaleChance;

/**
 * @ClassName: SaleChanceService
 * @Description: ���ۻ���Service�ӿ�
 * @author jed
 * @date 2017��8��20������6:15:36
 *
 */
public interface SaleChanceService {

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
}
