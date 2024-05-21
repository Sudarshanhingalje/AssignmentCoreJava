package com.demo.thread;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
	private BlockingQueue<Product> queue;

	public Producer(BlockingQueue<Product> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try (BufferedReader reader = new BufferedReader(new FileReader("productdata.dat"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(":");
				String name = parts[0];
				int quantity = Integer.parseInt(parts[1]);
				double price = Double.parseDouble(parts[2]);
				Product product = new Product(name, quantity, price);
				queue.put(product);
			}
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}
}