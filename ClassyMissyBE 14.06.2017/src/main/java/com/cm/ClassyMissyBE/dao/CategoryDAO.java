package com.cm.ClassyMissyBE.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cm.ClassyMissyBE.Model.Category;

@Repository
public class CategoryDAO {
@Autowired
SessionFactory sessionFactory;
public CategoryDAO(SessionFactory sessionFactory)
{
this.sessionFactory=sessionFactory;
}
public void insertCategory(Category category)
{
	sessionFactory.getCurrentSession().saveOrUpdate(category);
}
}