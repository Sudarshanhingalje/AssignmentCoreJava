package com.demo.test;

import java.io.File;
import java.io.FileReader;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.demo.beans.Consumer;
import com.demo.beans.Producer;
import com.demo.beans.Product;

public class ProducerConsumerExample {
	public static void main(String[] args) {
		BlockingQueue<Product> queue = new LinkedBlockingQueue<>();
		//File inputFile = new File("productdata.dat");
		FileReader fileReader = new FileReader("C:\\Users\\HP\\eclipse-workspace\\Assign-15_producer-consumer\\src\\com\\demo\\test\\productdata.dat");
		File outputFile = new File("productamount.dat");

		Producer producer = new Producer(queue,fileReader );
		Consumer consumer = new Consumer(queue, outputFile);

		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);

		producerThread.start();
		consumerThread.start();
	}
}

