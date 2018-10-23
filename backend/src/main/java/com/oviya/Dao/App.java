package com.oviya.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.oviya.Configuration.DatabaseConfiguration;
import com.oviya.Dao.ProductDao;
import com.oviya.Dao.ProductDaoImpl;
import com.oviya.Services.ProductService;
import com.oviya.models.Product;
import com.oviya.Services.ProductServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	      AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DatabaseConfiguration.class,ProductDaoImpl.class);
    	      //ProductDao productDao= (ProductDao)context.getBean("ProductDaoImpl");
    	    ProductService productService=(ProductService)context.getBean(ProductServiceImpl.class);
    	     Product product=productService.getProduct(2);
           	    System.out.println(product.getProductdesc());
           	 // System.out.println(product.getProductdesc());
           	// System.out.println(product.getQuantity());
           //	 System.out.println(product.getPrice());
           //	 System.out.println(product.getId()); 
    	     //  Product product=new Product();
       
    	   //INSERTING AND UPDATING    
    /*  product.setPrice(2000);
      product.setProductdesc("jeggin");
      product.setProductName("jean");
      product.setQuantity(2);
     product.setId(1);
      productDao.addProduct(product);
      productDao.updateProduct(product);   */	     
          }
}
