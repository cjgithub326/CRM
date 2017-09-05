/**
 * 
 */
package com.hik.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hik.dao.OrderDetailsDao;
import com.hik.entity.OrderDetails;
import com.hik.service.OrderDetailsService;

/**
 * @ClassName: OrderDetailsServiceImpl
 * @Description: ������ϸservice�ӿ�ʵ����
 * @author jed
 * @date 2017��9��5������10:04:27
 *
 */
@Service("orderDetailsService")
public class OrderDetailsServiceImpl implements OrderDetailsService{

	@Resource
	private OrderDetailsDao orderDetailsDao;
	
	@Override
	public List<OrderDetails> find(Map<String, Object> map) {
		return orderDetailsDao.find(map);
	}

	public Long getTotal(Map<String, Object> map) {
		return orderDetailsDao.getTotal(map);
	}

	@Override
	public Float getTotalPriceByOrderId(Integer orderId) {
		return orderDetailsDao.getTotalPriceByOrderId(orderId);
	}


}
