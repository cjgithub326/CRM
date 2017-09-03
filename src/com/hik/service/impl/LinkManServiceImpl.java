/**
 * 
 */
package com.hik.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hik.dao.LinkManDao;
import com.hik.entity.LinkMan;
import com.hik.service.LinkManService;

/**
 * @ClassName: LinkManServiceImpl
 * @Description: ��ϵ��serviceʵ����
 * @author jed
 * @date 2017��9��3������5:27:56
 *
 */
@Service("linkManService")
public class LinkManServiceImpl implements LinkManService{

	@Resource
	private LinkManDao linkManDao;
	
	@Override
	public List<LinkMan> find(Map<String, Object> map) {
		return linkManDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return linkManDao.getTotal(map);
	}

	@Override
	public int save(LinkMan linkMan) {
		return linkManDao.save(linkMan);
	}

	@Override
	public int update(LinkMan linkMan) {
		return linkManDao.update(linkMan);
	}

	@Override
	public int delete(Integer id) {
		return linkManDao.delete(id);
	}

}
