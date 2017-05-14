package com.lxl.action;

import com.lxl.model.Product;
import com.lxl.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProductAction extends ActionSupport implements ModelDriven<Product> {

	private Product product = new Product();
	
	@Override
	public Product getModel() {
		return product;
	}
	
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	public String add() {
		productService.add(product);
		return ActionSupport.SUCCESS;
	}

}
