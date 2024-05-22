package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;

public class EmployeeService {
	
	 private EmployeeDao employeeDao;

	    public EmployeeService(EmployeeDao employeeDao) {
	        this.employeeDao = employeeDao;
	    }

	    public void displayMenu() {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("1. Display all employees");
	            System.out.println("2. Search by id");
	            System.out.println("3. Search by name");
	            System.out.println("4. Display all employees with a particular designation");
	            System.out.println("5. Calculate and display net salary for all employees with a particular designation");
	            System.out.println("6. Accept department from user and display 5 employees of that department");
	            System.out.println("7. Exit");
	            System.out.print("\n Enter your choice: ");
	            
	            int choice = scanner.nextInt();
	            if (choice == 1) {
	                displayAllEmployees();
	                
	            } else if (choice == 2) {
	                System.out.print("Enter employee id: ");
	                int id = scanner.nextInt();
	                Employee employee = EmployeeService.searchById(id);
	                if (employee != null) {
	                    System.out.println(employee);
	                } else {
	                    System.out.println("No employee found with id " + id);
	                }
	                
	            } else if (choice == 3) {
	                System.out.print("Enter employee name: ");
	                scanner.nextLine();
	                String name = scanner.nextLine();
	                List<Employee> employees = employeeDao.searchByName(name);
	                for (Employee employee : employees) {
	                    System.out.println(employee);
	                }
	                
	            } else if (choice == 4) {
	                System.out.print("Enter designation: ");
	                scanner.nextLine();
	                String designation = scanner.nextLine();
	                List<Employee> employees = employeeDao.searchByDesignation(designation);
	                for (Employee employee : employees) {
	                    System.out.println(employee);
	                }
	                
	            } else if (choice == 5) {
	                System.out.print("Enter designation to calcalute salary : ");
	                scanner.nextLine();
	                String designation = scanner.nextLine();
	                List<Employee> employees = employeeDao.searchByDesignation(designation);
	                for (Employee employee : employees) {
	                    System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Net Salary: " + employee.CalculateNetSalary());
	                }
	                
	            } else if (choice == 6) {
	                System.out.print("Enter department: ");
	                scanner.nextLine();
	                String department = scanner.nextLine();
	                List<Employee> employees = employeeDao.searchByDepartment(department);
	                for (int i = 0; i < 5 && i < employees.size(); i++) {
	                    System.out.println(employees.get(i));
	                }
	                
	            } else if (choice == 7) {
	                break;
	            } else {
	                System.out.println("Invalid choice. Please try again.");
	            }
	        }
	        scanner.close();
	    }

	    private static Employee searchById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		public void addEmployee(Employee employee) {
	        employeeDao.addEmployee(employee);
	    }

	    private void displayAllEmployees() {
	        List<Employee> employees = employeeDao.getAllEmployees();
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }
	    }
	}


