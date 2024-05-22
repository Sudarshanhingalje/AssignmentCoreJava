package com.demo.beans;

public class Employee {
	
	    public static final String tax = null;
		private int id;
	    private String name;
	    private String mobileNo;
	    private String emailId;
	    private String department;
	    private String designation;
	    private String dateOfJoining;
	    private double basicSalary;
	    private double hrsWorked;
	    private double ratePerHour;
	    private int noOfEmployees;
	    private double amount;
	    public double da;
	    public double hra;
	    private double pf;
	    private double gst;
		public String netSalary;

	    // Getters and setters

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public String getDateOfJoining() {
			return dateOfJoining;
		}

		public void setDateOfJoining(String dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
		}

		public double getBasicSalary() {
			return basicSalary;
		}

		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
		}

		public double getHrsWorked() {
			return hrsWorked;
		}

		public void setHrsWorked(double hrsWorked) {
			this.hrsWorked = hrsWorked;
		}

		public double getRatePerHour() {
			return ratePerHour;
		}

		public void setRatePerHour(double ratePerHour) {
			this.ratePerHour = ratePerHour;
		}

		public int getNoOfEmployees() {
			return noOfEmployees;
		}

		public void setNoOfEmployees(int noOfEmployees) {
			this.noOfEmployees = noOfEmployees;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public double getDa() {
			return da;
		}

		public void setDa(double da) {
			this.da = da;
		}

		public double getHra() {
			return hra;
		}

		public void setHra(double hra) {
			this.hra = hra;
		}

		public double getPf() {
			return pf;
		}

		public void setPf(double pf) {
			this.pf = pf;
		}

		public double getGst() {
			return gst;
		}

		public void setGst(double gst) {
			this.gst = gst;
		}
	
	public String getId1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public String CalculateNetSalary() {
	     da = 0.08 * basicSalary;
	     hra = 0.10 * basicSalary;
	     double grossSalary = basicSalary + da + hra;
	     double tax = 0.05 * grossSalary;
	      Object netSalary = grossSalary - tax;
		return (String) netSalary;
	 }

	 public double grossSalary() {
	     return basicSalary + da + hra;
	 }
	}


//	// SalariedEmployee.java
//	public class SalariedEmployee extends Employee {
//	    private double basicSalary;
//	    // Getters and setters
//	}
//
//	// ContractEmployee.java
//	public class ContractEmployee extends Employee {
//	    private int noOfHrsWorked;
//	    private double perHourRate;
//	    // Getters and setters
//	}
//
//	// Vendor.java
//	public class Vendor extends Employee {
//	    private int noOfEmployees;
//	    private double amount;
//	    // Getters and setters
//	}
//
//	// Member.java
//	public class Member {
//	    private int id;
//	    private String name;
//	    private String mobileNo;
//	    private String emailId;
//	    private String membershipType;
//	    private double amountPaid;
//	    // Getters and setters
	    
	    
	

	
	

