package com.demo.beans;

import java.time.LocalDate;

public class Product {


	private int id;
	private String name;
	private String type; // perishable or nonperishable
	private LocalDate manufacturingDate;
	private LocalDate expiryDate; // Applicable for perishable products
	private String category; // Applicable for nonperishable products
	private double price;

	// Constructor for perishable products
	public Product(int id, String name, LocalDate manufacturingDate, LocalDate expiryDate, double price) {
		this.id = id;
		this.name = name;
		this.type = "perishable";
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.price = price;
	}

	// Constructor for nonperishable products
	public Product(int id, String name, String category, double price) {
		this.id = id;
		this.name = name;
		this.type = "nonperishable";
		this.category = category;
		this.price = price;
	}

	

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	// Method to calculate tax based on product type
		public double calculateTax() {
			double tax;
			if (type.equals("perishable")) {
				                            // 5% tax for perishable products
				tax = 0.05 * price;
			} else {
			                               // 15% of price plus 100 for nonperishable products
				tax = 0.15 * price + 100;
			}
			return tax;
		}
}
