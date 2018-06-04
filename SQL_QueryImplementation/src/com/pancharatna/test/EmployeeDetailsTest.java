package com.pancharatna.test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.pancharatna.main.LeftJoinResult;

public class EmployeeDetailsTest {

	
	@Test(expected=IllegalStateException.class)
	public void checkObjectState() {
	    final LeftJoinResult.Builder builder = new LeftJoinResult.Builder();
	    final LeftJoinResult leftObject = builder
	    									//.withleftemployeedID("101")
	    									.withleftFname("Pancharatna")
	    									.withleftLname("Doley")
	    									.withlemail("pancha89p@gmail.com")
	    									.withlgender("Male")
	    									.withrempID("101")
	    									.withrfathersName("L")
	    									.withrmothersName("M")
	    									.withryearOfJoining("2012")
	    									.withrmonthOfJoining("12").build();

	}
	
	@Test
	public void checkEMail() {
		
		final LeftJoinResult.Builder builder = new LeftJoinResult.Builder();
		final LeftJoinResult leftOject = builder.withleftemployeedID("101")
				.withlemail("hello@123.com").build();
		assertEquals("hello@123.com", leftOject.getLemail());
		
		
	}
}
