package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.ArrayList;

public class NewClient {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Configuration config= new Configuration().configure("hibernate1.cfg.xml");
		SessionFactory factory =config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		User user =new User();
		List<Phone>phones = new ArrayList<Phone>();
		phones.add(new Phone(987654568l,"personal"));
		phones.add(new Phone(657466356l,"office"));
		phones.add(new Phone(987656287l,"emergency"));
		user.setName("vaishu");
		user.setPhones(phones);
		session.save(user);
		tx.commit();
		session.close();
		System.out.println("Success");
	}

}
