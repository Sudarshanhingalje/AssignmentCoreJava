package com.demo.beans;

import java.util.ArrayList;
import java.util.List;

public class Vendor extends ContactInfo{




	private int vendorId;
	private String name;
	private List<String> products;

	public Vendor(int vendorId, String name, String email, String phoneNumber) {
		super(email, phoneNumber);
		this.vendorId = vendorId;
		this.name = name;
		this.products = new ArrayList<>();
	}

	public int getVendorId() {
		return vendorId;
	}

	public String getName() {
		return name;
	}

	public void addProduct(String product) {
		products.add(product);
	}

	public List<String> getProducts() {
		return products;
	}
}



