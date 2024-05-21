package com.demo.thread;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable {
	private BlockingQueue<Product> queue;

	public Consumer(BlockingQueue<Product> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("productamount.dat", true))) {
			Product product;
			while ((product = queue.take()) != null) {
				int quantity = product.quantity;
				double price = product.price;
				double amount = quantity * price + 0.1 * price;
				String line = product.name + ":" + quantity + ":" + price + ":" + amount + "\n";
				writer.write(line);
				System.out.println("Calculated amount for " + product.name + ": " + amount);
			}
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}
}