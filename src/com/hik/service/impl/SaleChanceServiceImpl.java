/**
 * 
 */
package com.hik.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hik.dao.SaleChanceDao;
import com.hik.entity.SaleChance;
import com.hik.service.SaleChanceService;

/**
 * @ClassName: SaleChanceServiceImpl
 * @Description: ���ۻ���ӿ�ʵ����
 * @author jed
 * @date 2017��8��20������6:16:25
 *
 */
@Service("saleChanceService")
public class SaleChanceServiceImpl implements SaleChanceService{

	@Resource
	private SaleChanceDao saleChanceDao;
	
	@Override
	public List<SaleChance> find(Map<String, Object> map) {
		return saleChanceDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return saleChanceDao.getTotal(map);
	}

}
