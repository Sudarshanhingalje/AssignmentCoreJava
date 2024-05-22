package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDao {

	private List<Employee> employees;

    public EmployeeDao() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employee.setId(employees.size() + 1);
        employees.add(employee);
    }

    public Employee searchById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> searchByName(String name) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<Employee> searchByDesignation(String designation) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDesignation().equalsIgnoreCase(designation)) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<Employee> searchByDepartment(String department) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment().equalsIgnoreCase(department)) {
                result.add(employee);
            }
        }
        
        
        return result;
    }

    List<Employee> employees1 = new ArrayList<>();

    void addEmployee1(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployeesByDesignation(String designation) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDesignation().equalsIgnoreCase(designation)) {
                result.add(employee);
            }
        }
        return result;
    }
    
    public List<Employee> getAllEmployees() {
        return employees;
    }
}

