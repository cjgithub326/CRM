/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.LinkMan;

/**
 * @ClassName: LinkManDao
 * @Description: ��ϵ��Dao�ӿ�
 * @author jed
 * @date 2017��8��13������11:47:48
 *
 */
public interface LinkManDao {

	
	/**
	 * 
	 * @MethodName: find
	 * @Description: ��ѯ��ϵ�˼���
	 * @author jed
	 * @date 2017��8��19������9:50:46
	 * @param @return    
	 * @return List<LinkMan>    ��������
	 * @return
	 *
	 */
	public List<LinkMan> find(Map<String, Object> map);
	
	
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
	 * @Description: �����ϵ��
	 * @author jed
	 * @date 2017��8��19������6:19:47
	 * @param @param linkMan
	 * @param @return    
	 * @return int    ��������
	 * @param linkMan
	 * @return
	 *
	 */
	public int save(LinkMan linkMan);
	
	/**
	 * 
	 * @MethodName: update
	 * @Description: �޸���ϵ��
	 * @author jed
	 * @date 2017��8��19������6:19:59
	 * @param @param linkMan
	 * @param @return    
	 * @return int    ��������
	 * @param linkMan
	 * @return
	 *
	 */
	public int update(LinkMan linkMan);
	
	/**
	 *  
	 * @MethodName: delete
	 * @Description: ɾ����ϵ��
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
