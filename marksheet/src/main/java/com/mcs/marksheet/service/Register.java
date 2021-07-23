package com.mcs.marksheet.service;

import com.mcs.marksheet.Userdao.Userdao;
import com.mcs.mohit.Student;

public class Register {
	
	
	    public Register() {
	    	
	    }
	
	
	public String newstudent(Student stud) {
		
		
		
		
		Userdao ob = new Userdao();
		
		Student temp = ob.getnewstudent(stud.getId());
		
		
		
		if(temp!=null) {
			
			return "user already exist";
			
		}
		
		else {
			
			ob.SAVESTUDENT(stud);
			return "user registered";
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
