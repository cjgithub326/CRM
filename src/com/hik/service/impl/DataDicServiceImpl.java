/**
 * 
 */
package com.hik.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hik.dao.DataDicDao;
import com.hik.entity.DataDic;
import com.hik.service.DataDicService;

/**
 * @ClassName: DataDicServiceImpl
 * @Description: �����ֵ�ӿ�ʵ����
 * @author jed
 * @date 2017��8��20������10:16:35
 *
 */
@Service("datadicService")
public class DataDicServiceImpl implements DataDicService{

	@Resource
	private DataDicDao datadicDao;
	
	@Override
	public List<DataDic> find(Map<String, Object> map) {
		return datadicDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return datadicDao.getTotal(map);
	}

	@Override
	public List<DataDic> findAll() {
		return datadicDao.findAll();
	}

}
