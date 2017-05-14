package com.lxl.service;

import org.springframework.transaction.annotation.Transactional;

import com.lxl.dao.ProductDao;
import com.lxl.model.Product;

public class ProductService {
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Transactional
	public void add(Product product) {
		productDao.save(product);
	}
}
