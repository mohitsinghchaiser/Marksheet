package com.mcs.marksheet.jdbc.Connectivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mcs.mohit.Admin;
import com.mcs.mohit.Student;

public class StudentConnection {

	public static void main(String[] args) {

		

		
		
                SessionFactory factory = new Configuration()
     		                                .configure("hibernate.cfg.xml")
     		                                .addAnnotatedClass(Student.class)
     		                                .buildSessionFactory();
 
                Session session = factory.getCurrentSession();
		
    try {
		
			
			session.beginTransaction();
			
			Student ob = new Student("rajesh","singh","123",80,85,90,91,84);
					
			session.save(ob);
			
			session.getTransaction().commit();
			
			
		}
		finally {
			
			 factory.close(); 
			
		}
		
	}

		
		
	
	
	
	
	
	
	
						
						
						
}				
						
						
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		

