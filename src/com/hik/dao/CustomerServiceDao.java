/**
 * 
 */
package com.hik.dao;

import com.hik.entity.CustomerService;

/**
 * @ClassName: CustomerServiceDao
 * @Description: �ͻ�����Dao�ӿ�
 * @author jed
 * @date 2017��9��17������7:11:42
 *
 */
public interface CustomerServiceDao {

	/**
	 * 
	 * @MethodName: save
	 * @Description: ��ӿͻ�����
	 * @author jed
	 * @date 2017��9��17������7:12:45
	 * @param @param customerService
	 * @param @return    
	 * @return int    ��������
	 * @param customerService
	 * @return
	 *
	 */
	public int save(CustomerService customerService);
}
