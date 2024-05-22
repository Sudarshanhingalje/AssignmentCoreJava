package com.demo.testproduct;

import java.time.LocalDate;

import com.demo.beans.Product;

public class ProductCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example usage
		Product perishableProduct = new Product(1, "Milk", LocalDate.of(2024, 5, 1), LocalDate.of(2024, 5, 15), 10.0);
		Product perishableProduct1 = new Product(2, "bananna", LocalDate.of(2024, 5, 1), LocalDate.of(2024, 5, 15), 20.0);

        Product nonperishableProduct = new Product(2, "Chair", "furniture", 60.0);

		System.out.println("Perishable product tax: " + perishableProduct1.calculateTax());

		System.out.println("Nonperishable product tax: " + nonperishableProduct.calculateTax());
	}
}



