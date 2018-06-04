package com.pancharatna.main;

public class LeftJoinResult{

	
	
	private final String lemployeeID;
	private final String lfName;
	private final String llName;
	private final String lgender;
	private final String lemail;
	
	private final String rempID;
	private final String rfathersName;
	private final String rmothersName;
	private final String ryearOfJoining;
	private final String rmonthOfJoining;

	//Make the constructor private
	private LeftJoinResult(
			final String lemployeeID,
			final String lfName,
			final String llName,
			final String lgender,
			final String lemail,
			final String rempID,
			final String rfathersName,
			final String rmothersName,
			final String ryearOfJoining,
			final String rmonthOfJoining
			) {
		
		this.lemployeeID = lemployeeID;
		this.lfName = lfName;
		this.llName = llName;
		this.lgender = lgender;
		this.lemail = lemail;
		this. rempID= rempID;
		this.rfathersName = rfathersName;
		this.rmothersName = rmothersName;
		this.ryearOfJoining = ryearOfJoining;
		this.rmonthOfJoining =rmonthOfJoining ;
	}

	public String getLemployeeID() {
		return lemployeeID;
	}

	public String getLfName() {
		return lfName;
	}

	public String getLlName() {
		return llName;
	}

	public String getLgender() {
		return lgender;
	}

	public String getLemail() {
		return lemail;
	}

	public String getRempID() {
		return rempID;
	}

	public String getRfathersName() {
		return rfathersName;
	}

	public String getRmothersName() {
		return rmothersName;
	}

	public String getRyearOfJoining() {
		return ryearOfJoining;
	}

	public String getRmonthOfJoining() {
		return rmonthOfJoining;
	}
	
	
	
@Override
	public String toString() {
		return lemployeeID + "," + lfName + "," + llName + ","
				+ lgender + "," + lemail + "," + rempID + "," + rfathersName
				+ "," + rmothersName + "," + ryearOfJoining + ","
				+ rmonthOfJoining;
	}



	//Static Object Builder Class
	public static class Builder{
		private String lemployeeID;
		private String lfName;
		private String llName;
		private String lgender;
		private String lemail;
		
		private String rempID;
		private String rfathersName;
		private String rmothersName;
		private String ryearOfJoining;
		private String rmonthOfJoining;

		
		public Builder() {
			
		}
		
		public Builder withleftemployeedID(String empID) {
			this.lemployeeID = empID;
			return this;   //Returning the builder each time to create a fluent interface
		}
		
		public Builder withleftFname(String fname) {
			this.lfName = fname;
			return this;
		}
		
		public Builder withleftLname(String llName) {
			this.llName = llName;
			return this;
		}
		
		public Builder withlgender(String lgender) {
			this.lgender = lgender;
			return this;
		}
		
		public Builder withlemail(String lemail) {
			this.lemail = lemail;
			return this;
		}
		
		public Builder withrempID(String rempID) {
			this. rempID= rempID;
			return this;
		}
		
		public Builder withrfathersName(String rfathersName) {
			this.rfathersName = rfathersName;
			return this;
		}
		
		public Builder withrmothersName(String rmothersName) {
			this.rmothersName = rmothersName;
			return this;
		}
		
		public Builder withryearOfJoining(String ryearOfJoining) {
			this.ryearOfJoining = ryearOfJoining;
			return this;
		}
		
		public Builder withrmonthOfJoining(String rmonthOfJoining) {
			this.rmonthOfJoining =rmonthOfJoining ;
			return this;
		}
		
		//Create an actual LeftJoinRsult object in fully initialized object
		public LeftJoinResult build() {
				
			if(lemployeeID  == null) {
				throw new IllegalStateException("Object cannot be created without EmployeeID");
			}
			
			return new LeftJoinResult(lemployeeID, lfName, llName, lgender, lemail, rempID, 
					rfathersName, rmothersName, ryearOfJoining, rmonthOfJoining);
			
		}


	}
	

	
	
}