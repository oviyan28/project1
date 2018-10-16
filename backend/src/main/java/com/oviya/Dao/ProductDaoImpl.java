package com.oviya.Dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oviya.model.Product;
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{
	@Autowired
	SessionFactory sessionFactory;
	

	public ProductDaoImpl() {
		System.out.println("ProductDao bean is created");
	}
		public void addProduct(Product Product) {
			try {
		Session session=sessionFactory.openSession();
		session.save(Product);
		session.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		//Transaction tx=session.beginTransaction();
		
		//tx.commit();
		//session.flush();
		

		
				}
		public void updateProduct(Product Product) {
			Session session=sessionFactory.openSession();
			session.update(Product);
			session.flush();
				}
		// TODO Auto-generated constructor stub
	

}
