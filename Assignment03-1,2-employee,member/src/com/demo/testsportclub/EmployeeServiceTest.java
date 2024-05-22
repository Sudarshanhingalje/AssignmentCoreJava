package com.demo.testsportclub;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.service.EmployeeService;

public class EmployeeServiceTest {

	public static void main(String[] args) 
		
		
		{
		        EmployeeDao employeeDao = new EmployeeDao();
		        EmployeeService employeeService = new EmployeeService(employeeDao);
 
		         //salaried emp
		        Employee employee1 = new Employee();
		        employee1.setName("sudarhan hingalje");
		        employee1.setMobileNo("1234567890");
		        employee1.setEmailId("sudarshan@xyz.com");
		        employee1.setDepartment("HR");
		        employee1.setDesignation("Salaried Employee");
		        employee1.setDateOfJoining("2022-01-01");
		        employee1.setBasicSalary(50000);
		        employeeService.addEmployee(employee1);

		        
		        //contract emp
		        Employee employee2 = new Employee();
		        employee2.setName("sumit parise");
		        employee2.setMobileNo("0987654321");
		        employee2.setEmailId("sumit@xyz.com");
		        employee2.setDepartment("Finance");
		        employee2.setDesignation("Contract Employee");employee2.setDateOfJoining("2022-02-01");
		        employee2.setHrsWorked(100);
		        employee2.setRatePerHour(500);
		        employeeService.addEmployee(employee2);

		        
		        //vender
		        Employee employee3 = new Employee();
		        employee3.setName("ankit kurde");
		        employee3.setMobileNo("4567890123");
		        employee3.setEmailId("ankit@xyz.com");
		        employee3.setDepartment("IT");
		        employee3.setDesignation("Vendor");
		        employee3.setDateOfJoining("2022-03-01");
		        employee3.setNoOfEmployees(5);
		        employee3.setAmount(100000);
		        employeeService.addEmployee(employee3);

		        employeeService.displayMenu();
		    }
	
	 EmployeeDao employeeDAO = new EmployeeDao();

     // add employees to the employeeDao

     List<Employee> employeesWithDesignation = employeeDAO.getEmployeesByDesignation("Salaried Employee");{

     for (Employee employee : employeesWithDesignation) {
         employee.CalculateNetSalary();
         System.out.println("Employee Salary Breakdown:");
         System.out.println("Basic: " + employee.getBasicSalary());
         System.out.println("HRA: " + employee.hra);
         System.out.println("DA: " + employee.da);
         System.out.println("Gross Salary: " + employee.grossSalary());
         System.out.println("Tax Deduction: " + Employee.tax);
         System.out.println("Net Salary: " + employee.netSalary);
         System.out.println("-----------------------------------");
     }
 }
}

	
	
		



