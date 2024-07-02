package com.app;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class hqlQueryPractice {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Configuration cgf =new  Configuration().configure("Hibernate.cfg.xml");
      SessionFactory factory=cgf.buildSessionFactory();
      Session session=factory.openSession();
     Transaction tx= session.beginTransaction();
    Book b= new Book();
    b.setBookName("OOPS");
    b.setBookPublication("NehaPubication");
    b.setPrice(138.0f);
   //session.persist(b);
   //insert query 
   Query query =session.createQuery("From Book");
   List<Book>books= query.list();
   //to retrive the data using query
   for(Book b1:books) {
   	System.out.println(b1.getBookName()+"" +b1.getBookPublication()+" "+b1.getPrice());
   }
   //upadte query using hql command
   
   String hql = "UPDATE Book set price = :price WHERE bookName = :bookName";

	Query query1= session.createQuery(hql);

	
	query1.setParameter("price", 150f);

	
	query1.setParameter("bookName", "JAVA");

	int result = query1.executeUpdate();

	System.out.println("rows affected : "+result);

    tx.commit();
    System.out.println("success");
    session.close();
	}
}
