package com.demo.beans;

public class Customer extends ContactInfo {

		private int custId;
		private String name;
		private String creditClass;
		private double discounts;
		private String plan;

		public Customer(int custId, String name, String email, String phoneNumber, String creditClass, double discounts, String plan) {
			super(email, phoneNumber);
			this.custId = custId;
			this.name = name;
			this.creditClass = creditClass;
			this.discounts = discounts;
			this.plan = plan;
		}

		public int getCustId() {
			return custId;
		}

		public String getName() {
			return name;
		}

		public String getCreditClass() {
			return creditClass;
		}

		public double getDiscounts() {
			return discounts;
		}

		public String getPlan() {
			return plan;
		}
	
	}


