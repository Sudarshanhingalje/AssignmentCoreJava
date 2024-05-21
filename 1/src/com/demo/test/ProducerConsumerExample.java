package com.demo.test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ProducerConsumerExample {
//	public static <Product> void main(String[] args) {
//		BlockingQueue<Product> queue = new LinkedBlockingQueue<>(10);
//		Thread producerThread = new Thread(new producerThread(queue));
//		Thread consumerThread = new Thread(new consumerThread (queue));
//		
//		
//		
//		producerThread.start();
//		consumerThread.start();
//	}
	
	
		  public static <Product> void main(String[] args) throws InterruptedException {
		    BlockingQueue<Product> queue = new LinkedBlockingQueue<>(10);
		    ExecutorService executor = Executors.newFixedThreadPool(2);
		    executor.submit(new Producer(queue));
		    executor.submit(new Consumer(queue));
		    executor.shutdown();
		    executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
		  }
		}
}


