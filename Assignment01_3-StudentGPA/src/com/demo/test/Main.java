package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService(10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Display All Students");
            System.out.println("2. Search by ID");
            System.out.println("3. Search by Name");
            System.out.println("4. Calculate GPA of a Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAllStudents(studentService);
                    break;
                case 2:
                    searchStudentById(studentService, scanner);
                    break;
                case 3:
                    searchStudentByName(studentService, scanner);
                    break;
                case 4:
                    calculateGPA(studentService, scanner);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayAllStudents(StudentService studentService) {
        Student[] students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void searchStudentById(StudentService studentService, Scanner scanner) {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        Student student = studentService.searchStudentById(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void searchStudentByName(StudentService studentService, Scanner scanner) {
        System.out.print("Enter Name: ");
        String name = scanner.next();
        Student student = studentService.searchStudentByName(name);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void calculateGPA(StudentService studentService, Scanner scanner) {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        Student student = studentService.searchStudentById(id);
        if (student != null) {
            double gpa = studentService.calculateGPA(student);
            System.out.println("GPA: " + gpa);
        } else {
            System.out.println("Student not found.");
        }
    }
}    