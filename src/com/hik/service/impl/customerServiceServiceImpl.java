/**
 * 
 */
package com.hik.service.impl;


import java.util.List;
import java.util.Map;

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

	@Override
	public List<CustomerService> find(Map<String, Object> map) {
		return customerServiceDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return customerServiceDao.getTotal(map);
	}

	@Override
	public int update(CustomerService customerService) {
		return customerServiceDao.update(customerService);
	}


}
