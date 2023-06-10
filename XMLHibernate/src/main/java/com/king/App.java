package com.king;
import com.pojo.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	
    	SessionFactory session = cfg.buildSessionFactory();
    	
    	Session sn =session.openSession();
    	Transaction trs = sn.beginTransaction();
    	Employee emp =new Employee();
    	emp.seteId(11051);
    	emp.setFirstName("Masoom");
    	emp.setLastName("Raza");
    
    	
    
    	emp.seteId(12051);
    	emp.setFirstName("Md");
    	emp.setLastName("Ekramul");
    	
    	sn.save(emp);
    	trs.commit();
//    	SessionFactory session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	System.out.println(session);
        System.out.println( "Hello World!" );
    }
}
