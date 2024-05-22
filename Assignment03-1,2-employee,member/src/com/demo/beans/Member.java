package com.demo.beans;

public class Member {

    private int id;
    private String name;
    private String mobileNo;
    private String emailId;
    private String typeOfMembership;
    private double amountPaid;
    
    
//	public Member(int id, String name, String mobileNo, String emailId, String typeOfMembership, double amountPaid) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.mobileNo = mobileNo;
//		this.emailId = emailId;
//		this.typeOfMembership = typeOfMembership;
//		this.amountPaid = amountPaid;
//	}
//
//
//	
//	public Member() {
//		super();
//	}



	//getter and setter

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


	public String getTypeOfMembership() {
		return typeOfMembership;
	}


	public void setTypeOfMembership(String typeOfMembership) {
		this.typeOfMembership = typeOfMembership;
	}


	public double getAmountPaid() {
		return amountPaid;
	}


	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	
	 
	
	
	
    
    
}
