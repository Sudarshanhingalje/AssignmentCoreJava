package com.demo.service;


import com.demo.beans.Student;

public class StudentService {
	private Student[] students;

    public StudentService(int size) {
        students = new Student[size];
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return;
            }
        }
    }

    public void displayAllStudents() {
        for (Student student : students) {
            if (student != null) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", GPA: " + student.getGPA());
            }
        }
    }

    public Student searchById(int id) {
        for (Student student : students) {
            if (student != null && student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public Student searchByName(String name) {
        for (Student student : students) {
            if (student != null && student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public double calculateGPA(Student student) {
        return student.getGPA();
    }

	public Student[] getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public Student searchStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student searchStudentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}