package com.mcs.mohit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="id")
	   private int id;
	   
	   @Column(name="firstname")
	   private String firstname;
	   
	   @Column(name="lastname")
	   private String lastname;
	   
	   @Column(name="password")
	   private String password;
	   
	   @Column(name="english")
	   private int english;
	   
	   @Column(name="hindi")
	   private int hindi;
	   
	   @Column(name="math")
	   private int math;
	   
	   @Column(name="science")
	   private int science;
	   
	   @Column(name="sst")
	   private int sst;
	
	
	
	
	  public Student() {
		  
	  }




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getFirstname() {
		return firstname;
	}




	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	public String getLastname() {
		return lastname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public int getEnglish() {
		return english;
	}




	public void setEnglish(int english) {
		this.english = english;
	}




	public int getHindi() {
		return hindi;
	}




	public void setHindi(int hindi) {
		this.hindi = hindi;
	}




	public int getMath() {
		return math;
	}




	public void setMath(int math) {
		this.math = math;
	}




	public int getScience() {
		return science;
	}




	public void setScience(int science) {
		this.science = science;
	}




	public int getSst() {
		return sst;
	}




	public void setSst(int sst) {
		this.sst = sst;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + password
				+ ", english=" + english + ", hindi=" + hindi + ", math=" + math + ", science=" + science + ", sst="
				+ sst + "]";
	}




	public Student(String firstname, String lastname, String password, int english, int hindi, int math, int science,
			int sst) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.english = english;
		this.hindi = hindi;
		this.math = math;
		this.science = science;
		this.sst = sst;
	}
	
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	
	
	
	
	
	
	
	
}
