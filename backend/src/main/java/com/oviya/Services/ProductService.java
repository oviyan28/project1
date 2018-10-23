package com.oviya.Services;

import com.oviya.models.Product;

public interface ProductService {
	void addProduct(Product Product);
	void updateProduct(Product Product);
	Product getProduct(int id);
	void deleteProduct(int id);
	
	

}
