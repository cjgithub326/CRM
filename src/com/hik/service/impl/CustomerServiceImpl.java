/**
 * 
 */
package com.hik.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hik.dao.CustomerDao;
import com.hik.entity.Customer;
import com.hik.service.CustomerService;

/**
 * @ClassName: CustomerServiceImpl
 * @Description: 客户信息接口实现类
 * @author jed
 * @date 2017年8月20日上午10:16:35
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

	@Resource
	private CustomerDao customerDao;
	
	@Override
	public List<Customer> find(Map<String, Object> map) {
		return customerDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return customerDao.getTotal(map);
	}

	@Override
	public int save(Customer customer) {
		return customerDao.save(customer);
	}

}
