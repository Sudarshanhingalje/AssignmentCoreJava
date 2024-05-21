package com.demo.beans;

import java.util.ArrayList;
import java.util.List;

abstract class ContactInfo {
	private String email;
	private String phoneNumber;

	public ContactInfo(String email, String phoneNumber) {
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
}
























	


class CompanyCustomer extends Customer {
	private String relationshipManager;
	private double creditLine;
	private List<String> extensions;
	private List<String> numbers;

	public CompanyCustomer(int custId, String name, String email, String relationshipManager, double creditLine, double discounts, String plan) {
		super(custId, name, email, null, null, discounts, plan);
		this.relationshipManager = relationshipManager;
		this.creditLine = creditLine;
		this.extensions = new ArrayList<>();
		this.numbers = new ArrayList<>();
	}

	public String getRelationshipManager() {
		return relationshipManager;
	}

	public double getCreditLine() {
		return creditLine;
	}

	public void addExtension(String extension) {
		extensions.add(extension);
	}

	public List<String> getExtensions() {
		return extensions;
	}

	public void addNumber(String number) {
		numbers.add(number);
	}

	public List<String> getNumbers() {
		return numbers;
	}


}


