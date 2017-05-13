package com.lxl.service;

import com.lxl.dao.ProductDao;
import com.lxl.model.Product;

public class ProductService {
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void add(Product product) {
		productDao.save(product);
		System.out.println("service add");
	}
}
