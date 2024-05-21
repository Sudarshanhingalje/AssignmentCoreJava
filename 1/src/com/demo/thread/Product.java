package com.demo.thread;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

	class Product {
	  String name;
	  int quantity;
	  double price;

	  public Product(String name, int quantity, double price) {
	    this.name = name;
	    this.quantity = quantity;
	    this.price = price;
	  }

	  @Override
	  public String toString() {
	    return name + ":" + quantity + ":" + price;
	  }
	}

	


	public class ProducerConsumerExample {
	  public static void main(String[] args) {
	    BlockingQueue<Product> queue = new LinkedBlockingQueue<>(10);
	    Thread producerThread = new Thread(new Producer(queue));
	    Thread consumerThread = new Thread(new Consumer(queue));
	    producerThread.start();
	    consumerThread.start();
	  }
	}


