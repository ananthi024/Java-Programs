import org.hibernate.*;
import org.hibernate.cfg.*;
public class HibernateDemo {
public static void main(String[] args)
{
	try
	{
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		
		Employee emp=new Employee();
		emp.setEmpid(1005);
		emp.setEmpname("Safna");
		emp.setSalary(33000);
		emp.setAddr("Chennai");
		
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
		System.out.println("Object Saved in Database");
	}
	catch(Exception e)
	{
		System.out.println("Exception Arised"+e);
	}
}
}
