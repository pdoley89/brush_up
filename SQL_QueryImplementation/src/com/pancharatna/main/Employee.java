package com.pancharatna.main;

import java.io.Serializable;


//Suggestion: Make a Builder Pattern
public class Employee implements Serializable{

	public static final long serialVersionUID = 1L;
	
	private String employeeID;
	private String fName;
	private String lName;
	private String gender;
	private String email;
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", fName=" + fName + ", lName=" + lName + ", gender=" + gender
				+ ", email=" + email + "]";
	}
	
	
	
}
