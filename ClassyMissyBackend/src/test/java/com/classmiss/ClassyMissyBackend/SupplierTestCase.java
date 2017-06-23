package com.classmiss.ClassyMissyBackend;

import java.util.List;

import org.hibernate.Session;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.classmiss.ClassyMissyBackend.dao.SupplierDAO;
import com.classmiss.ClassyMissyBackend.model.Category;
import com.classmiss.ClassyMissyBackend.model.Supplier;

public class SupplierTestCase {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.classmiss.ClassyMissyBackend");
		
		context.refresh();
		
		//Inserting a Supplier Object
		
		SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		
		// Insertion TestCase
		
		/*Supplier  supplier=new Supplier();*/
		
		/*supplier.setSupname("Aishu");
		supplier.setSupaddr("Chennai");
		
		supplierDAO.insertUpdateSupplier(supplier);
		System.out.println("Supplier Inserted");*/
		
		//Retrieval TestCase
		
		/*Supplier supplier=supplierDAO.getSupplier(3);
		System.out.println("Supplier Name:"+supplier.getSupname());
		System.out.println("Supplier Address:"+supplier.getSupaddr());*/
		
				
		//Deletion TestCase
		/*Supplier supplier=supplierDAO.getSupplier(6);
		supplierDAO.deleteSupplier(supplier);
		System.out.println("The Supplier Deleted");*/


		//Retrieving the Data
		List<Supplier> list=supplierDAO.getSupplierDetails();
   		for(Supplier supplier:list)
   		{
		System.out.println(supplier.getSupid()+":"+supplier.getSupname()+":"+supplier.getSupaddr());
   		}
		

   		//Update the Supplier
		/*Supplier supplier=supplierDAO.getSupplier(1);
		supplier.setSupname("Susikala");
		supplierDAO.insertUpdateSupplier(supplier);
		System.out.println("The Supplier Updated");*/

		
	}
}
