package com.mcs.marksheet.jdbc.Connectivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mcs.mohit.Admin;

public class AdminConnectivity {

	public static void main(String[] args) {
		
		
		
		
		SessionFactory factory = new Configuration()
				                    .configure("hibernate.cfg.xml")
				                    .addAnnotatedClass(Admin.class)
				                    .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		

		
		try {
			
			session.beginTransaction();
			
			Admin theadmin = new Admin("mohit@123","123456");
			
			session.save(theadmin);
			
			session.getTransaction().commit();
			
			
			
		}
		finally {
			factory.close();
		}
		
		
		
		
		
		
		
		
		
	}

}
