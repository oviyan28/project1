package com.oviya.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.oviya.Configuration.DatabaseConfiguration;
import com.oviya.Dao.ProductDao;
import com.oviya.Dao.ProductDaoImpl;
import com.oviya.model.Product;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ProductDao pd =new ProductDaoImpl();
       ApplicationContext context=new AnnotationConfigApplicationContext(DatabaseConfiguration.class);
    	/*System.out.println( "Hello World!" );*/
       Product pt=new Product();
       
       pt.setPrice(67000);
       pt.setProductdesc("chuditha");
       pt.setProductName("chudiar material");
       pt.setQuantity(20);
       pd.addProduct(pt);
       
    }
}
