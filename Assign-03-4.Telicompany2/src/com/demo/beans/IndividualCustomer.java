package com.demo.beans;

public class IndividualCustomer extends Person implements Customer {
	    private int  custId;
	    private String phoneNumber;
	    private String creditClass;
	    private double discounts;
	    private String plan;
	    
	public IndividualCustomer(int custId, String name, String email, String phoneNumber, String creditClass, double discounts) {
		super(name, email);
        this.custId = custId;
        this.phoneNumber = phoneNumber;
        this.creditClass = creditClass;
        this.discounts = discounts;
	}
	
	  public void assignPlan(String plan) {
	        this.plan = plan;
	    }

}
