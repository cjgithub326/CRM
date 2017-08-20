/**
 * 
 */
package com.hik.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hik.dao.ProductDao;
import com.hik.entity.Product;
import com.hik.service.ProductService;

/**
 * @ClassName: ProductServiceImpl
 * @Description: ��Ʒ��Ϣ�ӿ�ʵ����
 * @author jed
 * @date 2017��8��20������10:16:35
 *
 */
@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Resource
	private ProductDao productDao;
	
	@Override
	public List<Product> find(Map<String, Object> map) {
		return productDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return productDao.getTotal(map);
	}

}
