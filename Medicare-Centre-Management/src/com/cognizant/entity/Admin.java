package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	@Id
	@Column(name="Admin_Id")
	private String AdminId;
	
	@Column(name="First_Name")
	private String FirstName;
	
	@Column(name="Last_Name")
	private String LastName;
	
	@Column(name="Age")
	private int Age;
	
	@Column(name="Gender")
	private String Gender;
	
	public String getAdminId() {
		return AdminId;
	}

	public void setAdminId(String adminId) {
		AdminId = adminId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDoB() {
		return DoB;
	}

	public void setDoB(String doB) {
		DoB = doB;
	}

	public int getContact_Number() {
		return Contact_Number;
	}

	public void setContact_Number(int contact_Number) {
		Contact_Number = contact_Number;
	}

	public int getAlt_Contact_Number() {
		return Alt_Contact_Number;
	}

	public void setAlt_Contact_Number(int alt_Contact_Number) {
		Alt_Contact_Number = alt_Contact_Number;
	}

	public String getEmail_Id() {
		return Email_Id;
	}

	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}

	@Column(name="DoB")
	private String DoB;
	
	@Column(name="Contact_Number")
	private int Contact_Number;
	
	@Column(name="Alt_Contact_Number")
	private int Alt_Contact_Number;
	
	@Column(name="Email_Id")
     private String Email_Id;
}
