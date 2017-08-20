/**
 * 
 */
package com.hik.dao;

import java.util.List;
import java.util.Map;

import com.hik.entity.Product;

/**
 * @ClassName: ProductDao
 * @Description: ��ƷDao�ӿ�
 * @author jed
 * @date 2017��8��13������11:47:48
 *
 */
public interface ProductDao {

	
	/**
	 * 
	 * @MethodName: find
	 * @Description: ��ѯ���в�Ʒ
	 * @author jed
	 * @date 2017��8��19������9:50:46
	 * @param @return    
	 * @return List<Product>    ��������
	 * @return
	 *
	 */
	public List<Product> find(Map<String, Object> map);
	
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
