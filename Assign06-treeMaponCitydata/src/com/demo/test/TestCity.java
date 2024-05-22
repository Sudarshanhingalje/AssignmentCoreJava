package com.demo.test;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestCity {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeMap<String, String[]> cityTrees = new TreeMap<>();

		while (true) {
			System.out.println("\n1. Find list of trees for a city");
			System.out.println("2. Delete list of a particular city");
			System.out.println("3. Add new entry in tree map");
			System.out.println("4. Display all city names and list of trees");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			try {
				int choice = scanner.nextInt();
				scanner.nextLine(); // consume newline

				switch (choice) {
				case 1:
					System.out.print("Enter city name: ");
					String cityName = scanner.nextLine();

					String[] cityTreesArray = cityTrees.get(cityName);
					if (cityTreesArray == null) {
						System.out.println("City not found.");
					} else {
						System.out.println("Trees in " + cityName + ":");
						for (String tree : cityTreesArray) {
							System.out.println(tree);
						}
					}
					break;

				case 2:
					System.out.print("Enter city name to delete: ");
					String delCityName = scanner.nextLine();

					if (cityTrees.containsKey(delCityName)) {
						cityTrees.remove(delCityName);
						System.out.println("City and its trees deleted.");
					} else {
						System.out.println("City not found.");
					}
					break;

				case 3:
					System.out.print("Enter city name: ");
					String newCityName = scanner.nextLine();

					if (cityTrees.containsKey(newCityName)) {
						System.out.println("City already exists.");
					} else {
						System.out.print("Enter list of trees (comma-separated): ");
						String treesInput = scanner.nextLine();
						String[] treesArray = treesInput.split(", ");

						cityTrees.put(newCityName, treesArray);
						System.out.println("City and its trees added.");
					}
					break;

				case 4:
					System.out.println("City names and their trees:");
					Iterator<Map.Entry<String, String[]>> iterator = cityTrees.entrySet().iterator();
					while (iterator.hasNext()) {
						Map.Entry<String, String[]> entry = iterator.next();
						System.out.println(entry.getKey() + ": " + entry.getValue());
					}
					break;

				case 5:
					System.out.println("Exiting...");
					System.exit(0);
					break;

				default:
					System.out.println("Invalid choice. Please try again.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please try again.");
				scanner.nextLine(); // consume invalid input
			}
		}
	}

}


