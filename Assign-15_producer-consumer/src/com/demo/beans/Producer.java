package com.demo.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<Product> queue;
	private String file;

	public Producer(BlockingQueue<Product> queue, String fileReader) {
		super();

		this.queue=queue;
		this.file=fileReader;

	}

	public Producer(BlockingQueue<Product> queue2, FileReader fileReader) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				String id = data[0];
				String name = data[1];
				int quantity = Integer.parseInt(data[2]);
				double price = Double.parseDouble(data[3]);
				Product product = new Product(id, name, quantity, price);
				queue.put(product);
			}
			reader.close();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
} 




