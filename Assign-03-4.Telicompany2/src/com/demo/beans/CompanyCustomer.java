package com.demo.beans;

import java.util.List;

public class CompanyCustomer extends Person implements Customer {
	private int custId;
	private String relationshipManager;
	private String creditLine;
	private List<String> extensions;
	private List<String> numbers;
	private String plan;

	public CompanyCustomer(int custId, String name, String email, String relationshipManager, String creditLine, List<String> extensions, List<String> numbers) {
		super(name, email);
		this.custId = custId;
		this.relationshipManager = relationshipManager;
		this.creditLine = creditLine;
		this.extensions = extensions;
		this.numbers = numbers;
	}

	public void assignPlan(String plan) {
		this.plan = plan;
	}
}

