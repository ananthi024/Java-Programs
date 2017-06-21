package com.classmiss.ClassyMissyBackend;

import java.util.List;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.classmiss.ClassyMissyBackend.dao.CategoryDAO;
import com.classmiss.ClassyMissyBackend.model.Category;
public class CategyTaseCase {
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.classmiss.ClassyMissyBackend");
		
		context.refresh();
		
		// Inserting a Category Object.
		CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		
		//Insertion TestCase
		
		/*Category category=new Category();
		
		category.setCatname("Hi");
		category.setCatdesc("Different Verity  Avalible");

		categoryDAO.insertUpdateCategory(category);		
		System.out.println("Category Inserted");*/
		
		//Retrieval TestCase
		
				/*Category category=categoryDAO.getCategory(3);
				System.out.println("Category Name:"+category.getCatname());
				System.out.println("Category Description:"+category.getCatdesc());*/
				
		
		
		//Deletion TestCase
		/*category=categoryDAO.getCategory(6);
				categoryDAO.deleteCategory(category);
				System.out.println("The Category Deleted");*/
		
		
		//Retrieving the Data
		
				/*List<Category> list=categoryDAO.getCategoryDetails();
				
				for(Category category:list)
				{
					System.out.println(category.getCatid()+":"+category.getCatname()+":"+category.getCatdesc());
				}*/
		
		//Update the Category
				Category category=categoryDAO.getCategory(3);
				category.setCatname("Bracelets");
				categoryDAO.insertUpdateCategory(category);
				System.out.println("The Category Updated");
}
}
