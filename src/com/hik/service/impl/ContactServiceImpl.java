/**
 * 
 */
package com.hik.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hik.dao.ContactDao;
import com.hik.entity.Contact;
import com.hik.service.ContactService;

/**
 * @ClassName: ContactServiceImpl
 * @Description: 交往记录Service接口实现类
 * @author jed
 * @date 2017年9月4日下午10:21:20
 *
 */
@Service("contactService")
public class ContactServiceImpl implements ContactService{

	@Resource
	private ContactDao contactDao;
	
	@Override
	public List<Contact> find(Map<String, Object> map) {
		return contactDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return contactDao.getTotal(map);
	}

	@Override
	public int save(Contact contact) {
		return contactDao.save(contact);
	}

	@Override
	public int update(Contact contact) {
		return contactDao.update(contact);
	}

	@Override
	public int delete(Integer id) {
		return contactDao.delete(id);
	}

}
