package com.cm.ClassyMissyBE.config;

import java.util.Properties;

import javax.sql.DataSource;
import javax.transaction.TransactionManager;

import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.Propagation;

@Configuration
@ComponentScan("com.cm.ClassyMissyBE")

public class DBConfig {


@Bean(name="dataSoure")	
public DataSource getDataSource()
{
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:~/test");
	dataSource.setUsername("User1");
	dataSource.setPassword("User1");
	return dataSource;
	
}
@Bean(name="sessionFactory")
public SessionFactory getSessionFactory()
{
	Properties prop=new Properties();
	prop.setProperty("hibernate.hbm2ddl.auto", "update");
	prop.put("hibernate.show_sql", "true");//optional
	prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	
	LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(getDataSource());
	sessionBuilder.setProperties(prop);
	
	return sessionBuilder.buildSessionFactory();
	
}
@Bean(name="txManager")
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
{
	HibernateTransactionManager transactionManager=new HibernateTransactionManager();
	return transactionManager;
	
}

}
