package com.demo.beans;

import java.time.LocalDate;

class Student {
	int sid;
	String name;
	LocalDate bdate;
	String degree;
	double marks;

	public Student(int sid, String name, LocalDate bdate, String degree, double marks) {
		this.sid = sid;
		this.name = name;
		this.bdate = bdate;
		this.degree = degree;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", bdate=" + bdate + ", degree=" + degree + ", marks=" + marks
				+ "]";
	}
}