/**
 * 
 */
package com.hik.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hik.dao.CustomerReprieveDao;
import com.hik.entity.CustomerReprieve;
import com.hik.service.CustomerReprieveService;

/**
 * @ClassName: CustomerReprieveServiceImpl
 * @Description: 客户流失暂缓service实现类
 * @author jed
 * @date 2017年9月17日上午10:26:01
 *
 */
@Service("customerReprieveService")
public class CustomerReprieveServiceImpl implements CustomerReprieveService{

	@Resource
	private CustomerReprieveDao customerReprieveDao;
	
	@Override
	public List<CustomerReprieve> find(Map<String, Object> map) {
		return customerReprieveDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return customerReprieveDao.getTotal(map);
	}

	@Override
	public int save(CustomerReprieve customerReprieve) {
		return customerReprieveDao.save(customerReprieve);
	}

	@Override
	public int update(CustomerReprieve customerReprieve) {
		return customerReprieveDao.update(customerReprieve);
	}

	@Override
	public int delete(Integer id) {
		return customerReprieveDao.delete(id);
	}

}
