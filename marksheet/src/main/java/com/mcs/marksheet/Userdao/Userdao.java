package com.mcs.marksheet.Userdao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mcs.mohit.Admin;
import com.mcs.mohit.Student;

public class Userdao {
	
	
	
	               
	
	    public List<Student> getALLDATA(){
	    	
	    	

            SessionFactory factory = new Configuration()
         		                       .configure("hibernate.cfg.xml")
         		                       .addAnnotatedClass(Student.class)
         		                       .buildSessionFactory();

            Session session = factory.getCurrentSession();
	    	
		
		try {
			
			  session.beginTransaction();
			  
			  List<Student> theStudent = session.createQuery("from Student").getResultList();
			
			  return theStudent;
			
			
		}
		finally {
			factory.close();
		}
	    	
	    	
	    	
	    	
		
		
		
	    }
	
	
	
	
	
	
	
	     public Admin getADMINLOGIN(String user) {
	    	 
	    	 
	    	        SessionFactory factory = new Configuration()
                                                .configure("hibernate.cfg.xml")
                                                .addAnnotatedClass(Admin.class)
                                                .buildSessionFactory();

                   Session session = factory.getCurrentSession();
	    	 
	    	 
	    	 
	    	 try {
	    		 
	    		 
	    		 session.beginTransaction();
	    		 
	    		Query query = session.createQuery("from Admin u where u.username=:ue ");
 
	    				query.setParameter("ue",user);
	    				
	    		Admin result = (Admin)query.getSingleResult();
	    		
	    		
	    				
	    		
	    		 
	    		 return result;
	    		 
	    		 
	    		 
	    	 }
	    	 catch(NoResultException nre) {
	    		 return null;
	    		 
	    	 }
	    	 
	    	 finally {
	    		 
	    		 factory.close();
	    	 }
	    	 
	    	 
	    	 	 
	    	 
	    	 
	     } 
	
	
	
	

	     public Student getSTUDENTLOGIN(int id) {
	    	 
	    	 
 	        SessionFactory factory = new Configuration()
                                         .configure("hibernate.cfg.xml")
                                         .addAnnotatedClass(Student.class)
                                         .buildSessionFactory();

            Session session = factory.getCurrentSession();
 	 
 	 
 	 
 	 try {
 		 
 		 
 		 session.beginTransaction();
 		 
 		Query query = session.createQuery("from Student u where u.id=:ue ");

 				query.setParameter("ue",id);
 				
 		Student result = (Student)query.getSingleResult();
 		
 		
 				
 		
 		 
 		 return result;
 		 
 		 
 		 
 	 }
 	 catch(NoResultException nre) {
 		 return null;
 		 
 	 }
 	 
 	 finally {
 		 
 		 factory.close();
 	 }
	     
	     
	     
	     }    
	     
	     
	     
	     
	     
	     
	     public Student getnewstudent(int id) {
	    	 
	    	 
	    	 
	    	 SessionFactory factory = new Configuration()
                     .configure("hibernate.cfg.xml")
                     .addAnnotatedClass(Student.class)
                     .buildSessionFactory();

             Session session = factory.getCurrentSession();
	    	 
	    	 
	    	 
	    	 try {
	    		 
	    		 
	    		 session.beginTransaction();
	    		 
	    		 Query query = session.createQuery("from Student s where s.id=:i ");
	    		                                            
	    		 query.setParameter("i",id);
	    		 
	    		 Student result = (Student)query.getSingleResult();
	    		 
	    		 return result;
	    		 
	    		 
	    		 
	    	 }
	    	 catch(NoResultException nre) {
	    		 
	    	     return null;	 
	    	 }
	    	 
	    	 finally {
	    		 
	    		 factory.close();
	    	 }
	    	 
	    	 
	    	 
	    	 
	    	 
	     }
	     
	     
	     
	     
	     
	     public void SAVESTUDENT(Student temp) {
	    	 
	    	 
	    	 
	    	 
	    	 SessionFactory factory = new Configuration()
                     .configure("hibernate.cfg.xml")
                     .addAnnotatedClass(Student.class)
                     .buildSessionFactory();

             Session session = factory.getCurrentSession();
	    	 
	    	 
	    	 
	    	 try {
	    		 session.beginTransaction();
	    		 
	    		 Student ob = new Student(temp.getFirstname(), temp.getLastname(), temp.getPassword(), temp.getEnglish(), temp.getHindi(), temp.getMath(), temp.getScience(),
	    					temp.getSst()); 
	    		 
	    		 
	    		 session.save(ob);
	    		 
	    		 session.getTransaction().commit();
	    		 
	    		 
	    	 }
	    	 finally {
	    		 factory.close();
	    		 
	    	 }
	    	     	 
	    	 
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     public void newupdate(Student stud) {
	    	 
	    	 
	    	 
	    	 SessionFactory factory = new Configuration()
                     .configure("hibernate.cfg.xml")
                     .addAnnotatedClass(Student.class)
                     .buildSessionFactory();

             Session session = factory.getCurrentSession();
	    	 
	    	 
	    	 
	    	 try {
	    		 
	    		 session.beginTransaction();
	    		 
	    		 Student ob = session.get(Student.class, stud.getId());
	    		 
	    		 ob.setId(stud.getId());
	    		 ob.setFirstname(stud.getFirstname());
	    		 ob.setLastname(stud.getLastname());
	    		 ob.setPassword(stud.getPassword());
	    		 ob.setEnglish(stud.getEnglish());
	    		 ob.setHindi(stud.getHindi());
	    		 ob.setMath(stud.getMath());
	    		 ob.setScience(stud.getScience());
	    		 ob.setSst(stud.getSst());
	    		 
	    		 
	    		 
	    		 session.getTransaction().commit();
	    		 
	    		 
	    		 
	    		 
	    		 
	    	 }
	    	 
	    	 finally {
	    		 factory.close();
	    	 }
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	
	
	

}
