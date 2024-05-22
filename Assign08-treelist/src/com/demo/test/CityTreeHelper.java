package com.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CityTreeHelper {
	public static void findTreesForCity(Scanner scanner, TreeMap<String, List<String>> cityTrees) {
		System.out.print("Enter city name: ");
		String city = scanner.nextLine();

		List<String> trees = cityTrees.get(city);
		if (trees == null) {
			System.out.println("City not found.");
		} else {
			System.out.println("Trees in " + city + ": " + trees);
		}
	}

	public static void deleteCity(Scanner scanner, TreeMap<String, List<String>> cityTrees) {
		System.out.print("Enter city name to delete: ");
		String city = scanner.nextLine();

		if (cityTrees.containsKey(city)) {
			cityTrees.remove(city);
			System.out.println("City and its trees deleted.");
		} else {
			System.out.println("City not found.");
		}
	}

	public static void addNewEntry(Scanner scanner, TreeMap<String, List<String>> cityTrees) {
		System.out.print("Enter city name: ");
		String city = scanner.nextLine();

		if (cityTrees.containsKey(city)) {
			System.out.println("City already exists.");
		} else {
			System.out.print("Enter list of trees (comma-separated): ");
			String treeList = scanner.nextLine();

			List<String> trees = Arrays.asList(treeList.split(", "));
			cityTrees.put(city, trees);
			System.out.println("City and its trees added.");
		}
	}

	public static void displayAllCitiesAndTrees(TreeMap<String, List<String>> cityTrees) {
		System.out.println("City names and their trees:");
		for (Map.Entry<String, List<String>> entry : cityTrees.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static void addNewTreeToCity(Scanner scanner, TreeMap<String, List<String>> cityTrees) {
		System.out.print("Enter city name to add tree: ");
		String city = scanner.nextLine();
		System.out.println(city);

		if (!cityTrees.containsKey(city)) {
			System.out.println("City not found.");
		} else {
			System.out.print("Enter tree to add: ");
			String tree = scanner.nextLine();

			List<String> trees = cityTrees.get(city);
			trees.add(tree);
			System.out.println("Tree added to " + city);
		}
	}

	public static void displayCitiesWithTree(Scanner scanner, TreeMap<String, List<String>> cityTrees) {
		System.out.print("Enter tree name: ");
		String tree = scanner.nextLine();

		List<String> cities = new ArrayList<>();
		for (Map.Entry<String, List<String>> entry : cityTrees.entrySet()) {
			if (entry.getValue().contains(tree)) {
				cities.add(entry.getKey());
			}
		}

		if (cities.isEmpty()) {
			System.out.println("No city found with the tree.");
		} else {
			System.out.println("Cities with tree " + tree + ": " + cities);
		}
	}
}


