/**
 * 
 */
package com.hik.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hik.dao.CustomerDao;
import com.hik.dao.CustomerLossDao;
import com.hik.dao.OrderDao;
import com.hik.entity.Customer;
import com.hik.entity.CustomerGx;
import com.hik.entity.CustomerLoss;
import com.hik.entity.Order;
import com.hik.service.CustomerService;
import com.hik.util.CollectionUtil;

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
	
	@Resource
	private CustomerLossDao customerLossDao;
	
	@Resource
	private OrderDao orderDao;
	
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
	
	@Override
	public int update(Customer customer) {
		return customerDao.update(customer);
	}

	@Override
	public int delete(Integer id) {
		return customerDao.delete(id);
	}

	@Override
	public Customer findById(Integer id) {
		return customerDao.findById(id);
	}

	@Override
	public void checkCustomerLoss() {
		List<Customer> customerList = customerDao.findCustomerLoss(); // 查找流失客户
		if(CollectionUtil.isNotEmpty(customerList)){
			for(Customer c:customerList){
				CustomerLoss customerLoss = new CustomerLoss();  // 实例化客户流失实体
				customerLoss.setCusNo(c.getKhno());   // 客户编号
				customerLoss.setCusName(c.getName());  // 客户名称
				customerLoss.setCusManager(c.getCusManager());  // 客户经理
				Order order = orderDao.findLastOrderByCusId(c.getId()); // 查找指定客户最近的订单
				if(order==null){
					customerLoss.setLastOrderTime(null);
				}else{
					customerLoss.setLastOrderTime(order.getOrderDate()); // 设置最近的下单日期	
				}
				customerLossDao.saveCustomerLoss(customerLoss); // 添加到客户流失表
				c.setState(1); // 客户状态修改成1 流失状态
				customerDao.update(c);
			}
		}
	}

	@Override
	public List<CustomerGx> findCustomerGx(Map<String, Object> map) {
		return customerDao.findCustomerGx(map);
	}

	@Override
	public Long getTotalCustomerGx(Map<String, Object> map) {
		return customerDao.getTotalCustomerGx(map);
	}

}
