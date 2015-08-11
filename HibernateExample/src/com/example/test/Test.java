package com.example.test;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;  
  
public class Test {  
public static void main(String[] args) {  
	 Configuration configuration = new Configuration();
     configuration.configure("hibernate.cfg.xml");
     StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
     SessionFactory sessionFactory = configuration.buildSessionFactory(ssrb.build());
     Session session = sessionFactory.openSession();
      
    Transaction t=session.beginTransaction();  
      
    Employee e1=new Employee();  
    e1.setId(1001);  
    e1.setFirstName("poonam");  
    e1.setLastName("shah");  
      
    Employee e2=new Employee();  
    e2.setId(1002);  
    e2.setFirstName("sumit");  
    e2.setLastName("kumar");  
      
    session.persist(e1);  
    session.persist(e2);  
      
    t.commit();  
    session.close();  
    System.out.println("successfully saved");  
}  
}  