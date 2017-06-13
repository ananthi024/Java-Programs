package com.ms.CsBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MyBeanTestCase1
{
	public static void main(String[] args)
	{
		System.out.println("Test Case AnnotationConfigApplicationContext");
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	System.out.println("Scan Method Called");
	context.scan("com.ms.CsBackend");
	System.out.println("Refresh Method Called");
	context.refresh();
	System.out.println("My Bean Created");
	MyBean1 myBean1=(MyBean1)context.getBean("myBean");
	myBean1.display();
	}
}
