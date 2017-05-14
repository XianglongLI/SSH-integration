package com.lxl.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.lxl.model.Product;

public class ProductDao {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.save(product);
		
	}

}
