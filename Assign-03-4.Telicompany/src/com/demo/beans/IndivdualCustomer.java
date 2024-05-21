package com.demo.beans;



class IndividualCustomer extends Customer {
	private String phoneNumber;

	public IndividualCustomer(int custId, String name, String email, String phoneNumber, String creditClass, double discounts, String plan) {
		super(custId, name, email, null, creditClass, discounts, plan);
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}



}


