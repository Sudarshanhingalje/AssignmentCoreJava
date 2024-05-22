package com.demo.test;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

	public class CityTreeProgram {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			TreeMap<String, List<String>> cityTrees = new TreeMap<>();

			while (true) {
				System.out.println("\n1. Find list of trees for a city");
				System.out.println("2. Delete list of a particular city");
				System.out.println("3. Add new entry in tree map");
				System.out.println("4. Display all city names and list of trees");
				System.out.println("5. Add a new tree in existing list");
				System.out.println("6. Accept tree name from user. Display all cities in which the tree exists");
				System.out.println("7. Exit");
				System.out.print("Enter your choice: ");

				int choice = scanner.nextInt();
				scanner.nextLine(); // Consume newline

				switch (choice) {
				case 1:
					CityTreeHelper.findTreesForCity(scanner, cityTrees);
					break;
				case 2:
					CityTreeHelper.deleteCity(scanner, cityTrees);
					break;
				case 3:
					CityTreeHelper.addNewEntry(scanner, cityTrees);
					break;
				case 4:
					CityTreeHelper.displayAllCitiesAndTrees(cityTrees);
					break;
				case 5:
					CityTreeHelper.addNewTreeToCity(scanner, cityTrees);
					break;
				case 6:
					CityTreeHelper.displayCitiesWithTree(scanner, cityTrees);
					break;
				case 7:
					System.out.println("Exiting program...");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice. Please enter a number between 1 and 7.");
					break;
				}
			}
		}
	

}


