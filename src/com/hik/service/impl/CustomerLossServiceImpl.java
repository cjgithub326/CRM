/**
 * 
 */
package com.hik.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hik.dao.CustomerLossDao;
import com.hik.entity.CustomerLoss;
import com.hik.service.CustomerLossService;

/**
 * @ClassName: CustomerLossServiceImpl
 * @Description: 客户流失接口实现类
 * @author jed
 * @date 2017年9月10日下午5:53:00
 *
 */
@Service("customerLossService")
public class CustomerLossServiceImpl implements CustomerLossService{

	@Resource
	private CustomerLossDao customerLossDao;
	
	@Override
	public List<CustomerLoss> find(Map<String, Object> map) {
		return customerLossDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return customerLossDao.getTotal(map);
	}

	@Override
	public CustomerLoss findById(Integer id) {
		return customerLossDao.findById(id);
	}

	@Override
	public int update(CustomerLoss customerLoss) {
		return customerLossDao.update(customerLoss);
	}

}
