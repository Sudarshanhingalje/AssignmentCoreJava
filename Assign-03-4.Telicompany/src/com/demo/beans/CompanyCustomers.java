package com.demo.beans;

import java.util.ArrayList;
import java.util.List;


class CompanyCustomers extends Customer {
	private String relationshipManager;
	private double creditLine;
	private List<String> extensions;
	private List<String> numbers;

	public CompanyCustomers(int custId, String name, String email, String relationshipManager, double creditLine, double discounts, String plan) {
		super(custId, name, email, null, null, discounts, plan);
		this.relationshipManager = relationshipManager;
		this.creditLine = creditLine;
		this.extensions = new ArrayList<>();
		this.numbers = new ArrayList<>();
	}

}


