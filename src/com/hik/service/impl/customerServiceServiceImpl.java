/**
 * 
 */
package com.hik.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hik.dao.CustomerServiceDao;
import com.hik.entity.CustomerService;
import com.hik.service.CustomerServiceService;

/**
 * @ClassName: customerServiceServiceImpl
 * @Description: 客户服务service接口实现类
 * @author jed
 * @date 2017年9月17日下午7:17:46
 *
 */
@Service("customerServiceService")
public class customerServiceServiceImpl implements CustomerServiceService{

	@Resource
	private CustomerServiceDao customerServiceDao;
	
	@Override
	public int save(CustomerService customerService) {
		return customerServiceDao.save(customerService);
	}


}
