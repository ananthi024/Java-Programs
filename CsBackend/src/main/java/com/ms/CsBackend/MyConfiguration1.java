package com.ms.CsBackend;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


	@Configuration
	public class MyConfiguration1 {
		@Bean("myBean")
		public MyBean1 getMyBean1()
		{
			System.out.println("Bean Created and Stored in IOC Container");
		return new MyBean1();
		}

	}


