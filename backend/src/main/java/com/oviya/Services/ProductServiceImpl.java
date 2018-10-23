package com.oviya.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oviya.Dao.ProductDao;
import com.oviya.models.Product;

@Service

@Transactional
public class ProductServiceImpl implements ProductService {
@Autowired
 ProductDao productDao;

	public ProductServiceImpl() {
		System.out.println("ProductServiceImpl Bean is created");
		// TODO Auto-generated constructor stub
	}
	public void addProduct(Product Product) {
		productDao.addProduct(Product);
	}
	public void updateProduct(Product Product) {
		productDao.updateProduct(Product);
	}
	public Product getProduct(int id) {
		return productDao.getProduct(id);
	}
	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
		
	} 

}
