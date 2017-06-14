package com.cm.ClassyMissyBE;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cm.ClassyMissyBE.Model.Category;
import com.cm.ClassyMissyBE.dao.CategoryDAO;

public class CategoryTestCase {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.cm.ClassyMissyBE");
	context.refresh();
	
	//Inserting a Category Object
	CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	Category category=new Category();
	category.setCatname("Ring");
	category.setCatdesc("Ring is Good Qulity and less amount");
	categoryDAO.insertCategory(category);
}
}
