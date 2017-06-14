package com.cm.ClassyMissyBE.config;

import java.util.Properties;

import javax.sql.DataSource;
import javax.transaction.TransactionManager;

import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.jboss.jandex.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;

import com.cm.ClassyMissyBE.Model.Category;
import com.cm.ClassyMissyBE.dao.CategoryDAO;

@Configuration
@ComponentScan("com.cm.ClassyMissyBE")
@EnableTransactionManagement

public class DBConfig {


@Bean(name="dataSoure")	
public DataSource getDataSource()
{
	System.out.println("-----Data Source Creation------");
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:~/test");
	dataSource.setUsername("User1");
	dataSource.setPassword("User1");
	System.out.println("-----Data Source Created------");
	return dataSource;
	
}
@Bean(name="sessionFactory")
public SessionFactory getSessionFactory(DataSource dataSource)
{
	System.out.println("------Hibernate Properties--------");
	Properties prop=new Properties();
	prop.setProperty("hibernate.hbm2ddl.auto", "update");
	prop.put("hibernate.show_sql", "true");//optional
	prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	System.out.println("------Hibernate Properties Created--------");
	
	System.out.println("------Local SessionFactory Builder Object Created--------");
	LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);
	sessionBuilder.setProperties(prop);
	System.out.println("------Factory Builder Object Created--------");
	sessionBuilder.addAnnotatedClass(Category.class);
	System.out.println("------Session Factory Object Creation----");
	SessionFactory sessionFactory=sessionBuilder.buildSessionFactory();
	System.out.println("------Session Factory Object Creation----");
	return sessionFactory;
	
}
@Autowired
@Bean(name="txManager")
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
{
	System.out.println("------Transaction Manager Object Creation------");
	HibernateTransactionManager transactionManager=new HibernateTransactionManager();
	System.out.println("------Transaction Manager Object Created------");
	return transactionManager;
	
}
@Autowired
@Bean(name="categoryDAO")
public CategoryDAO getCategoryDAO(SessionFactory sessionFactory)
{
	System.out.println("-----Transaction Manager Object Creation-----");
	return new CategoryDAO(sessionFactory);
	
}

}
