package com.classmiss.ClassyMissyBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBeanTestCase {
public static void main(String[] args) {
	System.out.println("-----Test Case AnnotationConfigApplicationContext----");
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	
	
	System.out.println("---Scan Method Called----");
	context.scan("com.classmiss.ClassyMissyBackend");
	
	System.out.println("---Refresh Method Called----");
	context.refresh();
	
	System.out.println("----My Bean Created----");
	
	MyBean myBean1=(MyBean)context.getBean("myBean");
	myBean1.display();
	
	MyBean myBean2=(MyBean)context.getBean("myBean");
	myBean2.display();
}
}
