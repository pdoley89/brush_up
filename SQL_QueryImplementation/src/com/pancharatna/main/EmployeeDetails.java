package com.pancharatna.main;

//Converting the state of an object into stream of btytes and recreate them to actual object.
//A way to save the state of an object or transfer it across network.
//If a parent class implements seriqlzable, child class need not. VV is not true
import java.io.Serializable;

//emp_id,father_name,mother_name,yoj,moj
//Consider builder pattern

public class EmployeeDetails implements Serializable {

		
	//To verify the saved and loaed objects are same version. ie, 
	//to verify they have the same attributes and so, compatible for serialization
	
	//JVM will add exclusively, if not added by the developer. But it is compiler dependent.
	//De-serialization may fail in another compiler. INVALID_CLASS_EXCEPTON
	
	public static final long serialVersionUID = 283928392L;
	private String empID;
	private transient String fathersName;
	private transient String mothersName;
	private String yearOfJoining;
	private String monthOfJoining;
	
	//I belong to the class. Do not Serialize me please
	//But anybody can modify me, and use me as it is. I am the arrogant kid
	public static String justForFun; 
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public String getMothersName() {
		return mothersName;
	}
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}
	public String getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(String yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public String getMonthOfJoining() {
		return monthOfJoining;
	}
	public void setMonthOfJoining(String monthOfJoining) {
		this.monthOfJoining = monthOfJoining;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [empID=" + empID + ", fathersName=" + fathersName + ", mothersName=" + mothersName
				+ ", yearOfJoining=" + yearOfJoining + ", monthOfJoining=" + monthOfJoining + "]";
	}
	
	
	
}
