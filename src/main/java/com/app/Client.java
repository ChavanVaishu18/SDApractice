package com.app;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Client {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Configuration cgf =new  Configuration().configure("Hibernate.cfg.xml");
      SessionFactory factory=cgf.buildSessionFactory();
      Session session=factory.openSession();
     Transaction tx= session.beginTransaction();
    Book b= new Book();
    b.setBookName("jdbc");
    b.setBookPublication("nehag");
    b.setPrice(128.0f);
   session.persist(b);
  
  
    tx.commit();
    System.out.println("success");
    session.close();
    
	}

}
