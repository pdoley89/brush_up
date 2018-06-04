package com.pancharatna.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Main {
	
	public static void main(String[] args) {
		
		String empfilePath="/Users/pancharatnadoley/myProjects/employee_100.csv";
		String empDetfilePath="/Users/pancharatnadoley/myProjects/empdetails_100.csv";
		
		
		try {
			List<Employee> emp = CSVFileReader.readEmployeeCSV(new Employee(), empfilePath);
			List<EmployeeDetails> empDetails = CSVFileReader.readEmployeeDetailsCSV(new EmployeeDetails(), empDetfilePath);
			
			List<LeftJoinResult> l = compare(emp, empDetails);
			for(LeftJoinResult row : l) {
				System.out.println(row.toString());
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static List<LeftJoinResult> compare(List<Employee> e, List<EmployeeDetails> ed) {
		
		List<LeftJoinResult> res = new ArrayList<>();
		
		int leftTableSize = e.size();
		int rightTableSize = ed.size();
		
		for(int i = 0; i < leftTableSize ; i++) {
			boolean anyMatchFound=false;
			LeftJoinResult.Builder builder =new LeftJoinResult.Builder();
			for(int j = 0; j < rightTableSize; j++) {
				
				if(e.get(i).getEmployeeID().equals(ed.get(j).getEmpID())){
					anyMatchFound = true;
					LeftJoinResult result = builder.
											withleftemployeedID(e.get(i).getEmployeeID())
											.withleftFname(e.get(i).getfName())
											.withleftLname(e.get(i).getlName())
											.withlemail(e.get(i).getEmail())
											.withlgender(e.get(i).getGender())
											.withrempID(ed.get(j).getEmpID())
											.withrfathersName(ed.get(j).getFathersName())
											.withrmonthOfJoining(ed.get(j).getMonthOfJoining())
											.withrmothersName(ed.get(j).getMothersName())
											.withryearOfJoining(ed.get(j).getYearOfJoining())
											.build();
					res.add(result);
					
				}
				
			}
			if(anyMatchFound == false) {
				LeftJoinResult result = builder.
						withleftemployeedID(e.get(i).getEmployeeID())
						.withleftFname(e.get(i).getfName())
						.withleftLname(e.get(i).getlName())
						.withlemail(e.get(i).getEmail())
						.withlgender(e.get(i).getGender())
						.withrempID(null)
						.withrfathersName(null)
						.withrmonthOfJoining(null)
						.withrmothersName(null)
						.withryearOfJoining(null)
						.build();
				res.add(result);
			}
			
		}
		
		return res;
		
	}

}
