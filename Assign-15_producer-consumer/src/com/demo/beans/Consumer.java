package com.demo.beans;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	private BlockingQueue<Product> queue;
	private File file;

	public Consumer(BlockingQueue<Product> queue, File file) {
		this.queue = queue;
		this.file = file;
	}

	@Override
	public void run() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			while (true) {
				Product product = queue.take();
				double amount = product.quantity * product.price + (product.price * 0.1);
				String line = String.format("%s:%s:%d:%.2f:%.2f", product.id, product.name, product.quantity, product.price, amount);
				writer.write(line);
				writer.newLine();
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
