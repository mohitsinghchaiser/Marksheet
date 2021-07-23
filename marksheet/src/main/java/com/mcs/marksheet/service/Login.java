package com.mcs.marksheet.service;

import com.mcs.marksheet.Userdao.Userdao;
import com.mcs.mohit.Admin;
import com.mcs.mohit.Student;

public class Login {
	
	  
	    public Login() {
	    	
	    }
	
	
	    public String getadminlogin(String user,String pass) {
	    	
	    	
	    	
	    	Userdao ob = new Userdao();
	    	
	    	Admin temp = ob.getADMINLOGIN(user);
	    	
	    	
	    	if(temp!=null) {
	    		
	    		  if((temp.getPassword())!=pass) {
	    			  
	    			  return "user exist BUT password incorrect";
	    			  
	    		  }
	    		  
	    		  else {
	    			  return "user exist WELCOME USER";
	    		  }
	    		
	    		
	    			}
	    	
	    	
	    	else {
	    		
	    		return "user doesn't exist";
	    	}
	    	
	    	
	    	
	    }
	    	
	    
	    
	    	
	    	
	    	 public String getstudentlogin(int id,String pass) {
	 	    	
	 	    	
	 	    	
	 	    	Userdao ob = new Userdao();
	 	    	
	 	    	Student temp = ob.getSTUDENTLOGIN(id);
	 	    	
	 	    	
	 	    	if(temp!=null) {
	 	    		
	 	    		  if((temp.getPassword())==pass) {
	 	    			  
	 	    			  return "user exist WELCOME USER";
	 	    			  
	 	    		  }
	 	    		  
	 	    		  else {
	 	    			  return "user exist but password incorrect";
	 	    		  }
	 	    		
	 	    		
	 	    			}
	 	    	
	 	    	
	 	    	else {
	 	    		
	 	    		return "user doesn't exist";
	 	    	}
	 	    	
	    	
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    
	
	
	

}
