package com.app;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Publication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Configuration cgf =new  Configuration().configure("Hibernate.cfg.xml");
	      SessionFactory factory=cgf.buildSessionFactory();
	      Session session=factory.openSession();
	     Transaction tx= session.beginTransaction();
	     Author Au= new Author();
	     Au.setAuthorName("Chavan");
	     session.persist(Au);
	     tx.commit();
	     System.out.println("success");
	     session.close();

	}

}
