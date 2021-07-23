package com.mcs.marksheet.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mcs.marksheet.Userdao.Userdao;
import com.mcs.marksheet.service.Login;
import com.mcs.marksheet.service.Register;
import com.mcs.mohit.Student;

@RestController
@RequestMapping("/api")
public class SheetController {
	
	
	@GetMapping("/allstudent")
	public List<Student> getdata(){
		
		
		Userdao ob = new Userdao();
		
		List<Student> result = ob.getALLDATA();
		
		return result;
		
		
		
		
	}
	
	
	
	
	@GetMapping("/adminlogin/{username}/{password}")
	public String getadmin(@PathVariable String username,@PathVariable String password) {
		
		
		System.out.println("username : "+username);
		System.out.println("password : "+password);
		
		System.out.println();
		
		Login ob = new Login();
		
		String result = ob.getadminlogin(username,password);
		
		return result;
		
		
		
		
	}
	
	
	
	@GetMapping("/student/{id}/{password}")
	public String getstudent(@PathVariable("id") int id, @PathVariable("password") String pass) {
		
		
		System.out.println("id : "+id);
		System.out.println("password : "+pass);
		
		Login ob = new Login();
		
		String result = ob.getstudentlogin(id,pass);
		
		return result;
		
		
		
		
		
		
		
	}
	
	
	
	
	
	@PostMapping("/newstudent")
	public String setStudentdata(@RequestBody Student stud ) {
		
	
		
		
		Register ob = new Register();
		
		String result = ob.newstudent(stud);
		
		 return result;
		
		
		
		
		
		
	}
	
	
	@PutMapping("/update")
	public void setUpdate(@RequestBody Student stu ) {
		
		Userdao ob = new Userdao();
		
		ob.newupdate(stu);
		
		
	}
	
	
	
	

}
