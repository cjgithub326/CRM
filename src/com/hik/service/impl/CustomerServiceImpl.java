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
 * @Description: �ͻ���Ϣ�ӿ�ʵ����
 * @author jed
 * @date 2017��8��20������10:16:35
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
		List<Customer> customerList = customerDao.findCustomerLoss(); // ������ʧ�ͻ�
		if(CollectionUtil.isNotEmpty(customerList)){
			for(Customer c:customerList){
				CustomerLoss customerLoss = new CustomerLoss();  // ʵ�����ͻ���ʧʵ��
				customerLoss.setCusNo(c.getKhno());   // �ͻ����
				customerLoss.setCusName(c.getName());  // �ͻ�����
				customerLoss.setCusManager(c.getCusManager());  // �ͻ�����
				Order order = orderDao.findLastOrderByCusId(c.getId()); // ����ָ���ͻ�����Ķ���
				if(order==null){
					customerLoss.setLastOrderTime(null);
				}else{
					customerLoss.setLastOrderTime(order.getOrderDate()); // ����������µ�����	
				}
				customerLossDao.saveCustomerLoss(customerLoss); // ��ӵ��ͻ���ʧ��
				c.setState(1); // �ͻ�״̬�޸ĳ�1 ��ʧ״̬
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
