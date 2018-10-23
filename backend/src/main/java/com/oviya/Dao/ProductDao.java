package com.oviya.Dao;
import com.oviya.models.Product;

public interface ProductDao {
void addProduct(Product Product);
void updateProduct(Product Product);
Product getProduct(int id);
void deleteProduct(int id);

}

