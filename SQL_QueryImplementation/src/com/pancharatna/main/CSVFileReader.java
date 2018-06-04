package com.pancharatna.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CSVFileReader {

	//List<Object> objects;	
	
	public static void main(String[] args) {
		
		String filePath="/Users/pancharatnadoley/myProjects/employee_100.csv";
		
		
		try {
			List<Employee> e = readEmployeeCSV(new Employee(), filePath);
			
			for(Employee emp : e) {
				System.out.println(emp.toString());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static List<Employee> readEmployeeCSV(Object o, String filePath) throws IOException{
		
		if(null != o && o instanceof Employee) {
			List<Employee> empList =  new ArrayList<Employee>();
			BufferedReader bf = null;
			FileReader fr= null;
			try {
				fr = new FileReader(new File(filePath));
				bf = new BufferedReader(fr);
				String line ;
				boolean isHeaderSet = false;
				while((line = bf.readLine()) != null) {
					if(!isHeaderSet) {
						isHeaderSet=true; //Assume some logic
						continue;
					}
			
					Employee e = new Employee();
					String[] s = line.split(",");
					e.setEmployeeID(s[0]);
					e.setfName(s[1]);
					e.setlName(s[2]);
					e.setGender(s[3]);
					e.setEmail(s[4]);
					
					empList.add(e);
				}
				
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				fr.close();
				bf.close();
			}
			return empList;
		}
		return null;
		
	}
	
	public static List<EmployeeDetails> readEmployeeDetailsCSV(Object o, String filePath) throws IOException{
		
		if(null != o && o instanceof EmployeeDetails) {
			List<EmployeeDetails> empDetList =  new ArrayList<EmployeeDetails>();
			BufferedReader bf = null;
			FileReader fr = null;
			try {
				fr = new FileReader(new File(filePath));
				bf = new BufferedReader(fr);
				String line ;
				boolean isHeaderSet = false;
				while((line = bf.readLine()) != null) {
					if(!isHeaderSet) {
						isHeaderSet=true; //Assume some logic
						continue;
					}
			
					EmployeeDetails e = new EmployeeDetails();
					String[] s = line.split(",");
					e.setEmpID(s[0]);
					e.setFathersName(s[1]);
					e.setMothersName(s[2]);
					e.setYearOfJoining(s[3]);
					e.setMonthOfJoining(s[4]);
					
					empDetList.add(e);
				}
				
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				fr.close();
				bf.close();
				
			}
			return empDetList;
		}
		return null;
	}
	
}
