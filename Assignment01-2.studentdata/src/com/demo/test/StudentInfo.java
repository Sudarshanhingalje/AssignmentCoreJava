package com.demo.test;

import com.demo.beans.Student;

		 class StudentInfo {
			    public static void main(String[] args) {
			        //Scanner scanner = new Scanner(System.in);

			        // Create Student objects and accept information for 2 students
			        Student student1 = new Student(1, "Divya", 78, 86, 89);
			        Student student2 = new Student(2, "Rahul", 85, 90, 80);

			        // Display student details
			        student1.displayStudentDetails();
			        student2.displayStudentDetails();
			    }
			}
		



