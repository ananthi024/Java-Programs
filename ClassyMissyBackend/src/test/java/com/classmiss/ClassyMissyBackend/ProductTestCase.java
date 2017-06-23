package com.classmiss.ClassyMissyBackend;

import java.util.List;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.classmiss.ClassyMissyBackend.dao.ProductDAO;
import com.classmiss.ClassyMissyBackend.model.Product;
public class ProductTestCase {
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.classmiss.ClassyMissyBackend");
		
		context.refresh();
		
		// Inserting a Product Object.
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		
		//Insertion TestCase
		
		/*Product product=new Product();
		
		product.setProdname("Diamend Ring");
		product.setProddesc("Different Types Ring Verity  Avalible");
        product.setCatid(2);
        product.setSupid(3);
        product.setPrice(10000);
        product.setQuantity(200);
        
		productDAO.insertUpdateProduct(product);		
		System.out.println("Product Inserted");*/
		
		//Retrieval TestCase
		
				/*Product product=productDAO.getProduct(3);
				System.out.println("Product Name:"+product.getProdname());
				System.out.println("Product Description:"+product.getProddesc());
				System.out.println("Product Category Id:"+product.getCatid());
				System.out.println("Product Supplier Id:"+product.getSupid());
				System.out.println("Product Price:"+product.getPrice());
				System.out.println("Product Quantity:"+product.getQuantity());*/
		
		
		//Deletion TestCase
		/*Product product=productDAO.getProduct(3);
				productDAO.deleteProduct(product);
				System.out.println("The Product Deleted");*/
		
		
		//Retrieving the Data
		
				List<Product> list=productDAO.getProductDetails();
				
				for(Product product:list)
				{
					System.out.println(product.getProdid()+":"+product.getProdname()+":"+product.getProddesc()+":"+product.getCatid()+":"+product.getSupid()+":"+product.getPrice()+":"+product.getQuantity());
				}
		
		//Update the Product
			/*Product product=productDAO.getProduct(1);
				product.setProdname("Bracelets");
				productDAO.insertUpdateProduct(product);
				System.out.println("The Product Updated");*/
}
}
