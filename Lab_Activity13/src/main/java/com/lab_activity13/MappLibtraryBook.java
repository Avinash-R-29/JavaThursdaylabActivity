package com.lab_activity13;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappLibtraryBook {

	public static void main(String[] args) 
	{
		SessionFactory factory=new Configuration().configure("hibernatebook.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		
		Library l1= new Library();
		l1.setLib_Name("Banglore University Library");
		session.save(l1);

		
		Library l2=new Library();
		l2.setLib_Name("Manglore University Library");
		session.save(l2);
		session.getTransaction().commit();
		
		
		session.beginTransaction();
		
		Books b1=new Books();
		b1.setBook_Name("Java Book");
		b1.setBook_Author("Jemes gosling");
		
		Books b2= new Books();
		b2.setBook_Name("C++");
		b2.setBook_Author("Dennis Ritchie ");
		
		Books b3= new Books();
		b3.setBook_Name("JavaScript");
		b3.setBook_Author("Brendran Eich");
		
		Books b4= new Books();
		b4.setBook_Name("AngularJs");
		b4.setBook_Author("Misko");
		session.getTransaction().commit();
		
		session.beginTransaction();

		ArrayList<Books> list1=new ArrayList<>();
		list1.add(b1);
		list1.add(b2);
		
		ArrayList<Books> list2=new ArrayList<>();

		list2.add(b3);
		list2.add(b4);
		
		l1.setList(list1);
		l2.setList(list2);
			
		session.getTransaction().commit();
		factory.close();
		

	}

}
