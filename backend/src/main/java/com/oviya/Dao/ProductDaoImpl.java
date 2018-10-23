package com.oviya.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oviya.models.Product;
@Repository
@Transactional
@Component
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	public ProductDaoImpl() {
		System.out.println("ProductDaoImpl Bean is created");
		
	}

	@Override
	public void addProduct(Product Product) {
		Session session=sessionFactory.getCurrentSession();
		session.save(Product);
		 
		

	}

	@Override
	public void updateProduct(Product Product) {
		
		Session session=sessionFactory.getCurrentSession();
		session.update(Product);
		
	}

	@Override
	public Product getProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class,id);
		return product;
		
		
	}

	@Override
	public void deleteProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class,id);
		
		session.delete(product);
		// TODO Auto-generated method stub
		
	}

}
