package com.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Product;

public class CartService {
	private static List<Product> products = new ArrayList<>();
	private static Map<String, List<Product>> carts = new HashMap<>();

	static {
		// Initialize products
		products.add(new Product(1, "Shoes", 3000, 100));
		products.add(new Product(2, "Shirts", 500, 200));
		products.add(new Product(3, "Bags", 2000, 300));
		products.add(new Product(4, "Mobile", 3000, 400));
		products.add(new Product(5, "Watch", 1500, 100));
		products.add(new Product(6, "Sandals", 2500, 250));
		products.add(new Product(7, "AK-47", 3000, 100));
		products.add(new Product(8, "Shirts", 500, 200));
		products.add(new Product(9, "Bags", 2000, 300));
		products.add(new Product(10, "Smart-Watch", 3000, 400));
		products.add(new Product(11, "Furniture-chair", 1500, 100));


	}

	public static void displayMenu() {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Buy Products");
			System.out.println("2. Send the delivery of cart");
			System.out.print("\nEnter your choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				buyProducts();
				break;
			case 2:
				sendDelivery();
				break;
			default:
				System.out.println("Invalid choice. Please enter again.");
			}
		} while (choice != 2);
	}

	private static void buyProducts() 
	{
		
		// Display available products
		System.out.println("Available Products:");
		for (Product product : products) {
			System.out.println(product.getId() + ". " + product.getName());
	}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter product ID: ");
		int productId = scanner.nextInt();
		System.out.print("Enter quantity: ");
		int qty = scanner.nextInt();
		Product selectedProduct = null;
		for (Product product : products) {
			if (product.getId() == productId) {
				selectedProduct = product;
				break;
			}
		}
		
		if (selectedProduct != null && selectedProduct.getQty() >= qty) {
			double amount = selectedProduct.getPrice() * qty;
			System.out.println("Amount: " + amount + "/-");
			addToCart(selectedProduct, qty);
		} else {
			System.out.println("Product not available or quantity exceeded.");
		}
	}

	//to add the cart selected product 
	private static void addToCart(Product product, int qty) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String username = scanner.nextLine();
		List<Product> cart = carts.getOrDefault(username, new ArrayList<>());
		cart.add(new Product(product.getId(), product.getName(), product.getPrice(), qty));
		carts.put(username, cart);
	}

	
	private static void sendDelivery() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("List of usernames:");
		for (String username : carts.keySet()) {
			System.out.println(username);
		}
		System.out.print("Enter username for billing : ");
		String username = scanner.nextLine();
		
		
		List<Product> cart = carts.get(username);
		if (cart != null) {
			double totalAmount = 0;
			System.out.println("Billing amount for " + username + ":");
			for (Product product : cart) {
				System.out.println(product.getName() + " - " + product.getPrice() + " x " + product.getQty());
				totalAmount += product.getPrice() * product.getQty();
			}
			System.out.println("Total Amount: " + totalAmount + "/-");
			System.out.print("Do you want to deliver? (y/n): ");
			char choice = scanner.next().charAt(0);
			if (choice == 'y') {
				System.out.println("Order delivered.");
				carts.remove(username);
			} else {
				System.out.println("Order not delivered.");
			}
		} else {
			System.out.println("No cart found for username: " + username);
		}
	}
}


