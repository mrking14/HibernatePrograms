package com.main;

import com.emp.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction ts = session.beginTransaction();
		Employee em1 = new Employee();
		em1.setFirstName("gol");
		em1.setLastName("pol");
		em1.seteId(10);
		session.save(em1);
		
//		Here I am Getting data from Emp classs and printing on console.
		Employee em = session.get(Employee.class, 1);  
		System.out.println(em);
		
		ts.commit();
		// TODO Auto-generated method stub

	}

}
