/**
 * 
 */
package com.hik.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hik.dao.OrderDao;
import com.hik.entity.Order;
import com.hik.service.OrderService;

/**
 * @ClassName: OrderServiceImpl
 * @Description: ����serviceʵ����ӿ�
 * @author jed
 * @date 2017��9��5������8:43:46
 *
 */
@Service("/orderService")
public class OrderServiceImpl implements OrderService{

	@Resource
	private OrderDao orderdao;
	
	@Override
	public List<Order> find(Map<String, Object> map) {
		return orderdao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return orderdao.getTotal(map);
	}

}