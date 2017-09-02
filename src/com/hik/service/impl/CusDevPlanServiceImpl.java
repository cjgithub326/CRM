/**
 * 
 */
package com.hik.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hik.dao.CusDevPlanDao;
import com.hik.entity.CusDevPlan;
import com.hik.service.CusDevPlanService;

/**
 * @ClassName: CusDevPlanServiceImpl
 * @Description: �ͻ������ƻ�serviceʵ����
 * @author jed
 * @date 2017��9��2������11:57:47
 *
 */
@Service("cusDevPlanService")
public class CusDevPlanServiceImpl implements CusDevPlanService{

	@Resource
	private CusDevPlanDao cusDevPlanDao;
	
	@Override
	public List<CusDevPlan> find(Map<String, Object> map) {
		return cusDevPlanDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return cusDevPlanDao.getTotal(map);
	}

	@Override
	public int save(CusDevPlan cusDevPlan) {
		return cusDevPlanDao.save(cusDevPlan);
	}

	@Override
	public int update(CusDevPlan cusDevPlan) {
		return cusDevPlanDao.update(cusDevPlan);
	}

	@Override
	public int delete(Integer id) {
		return cusDevPlanDao.delete(id);
	}

}
