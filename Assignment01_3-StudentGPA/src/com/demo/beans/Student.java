package com.demo.beans;
public class Student {
    

	 private int id;
	    private String name;
	    private int m1, m2, m3;
	    private double gpa;

	    public Student(int id, String name, int m1, int m2, int m3) {
	        this.id = id;
	        this.name = name;
	        this.m1 = m1;
	        this.m2 = m2;
	        this.m3 = m3;
	        calculateGPA();
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getGPA() {
	        return gpa;
	    }

	    private void calculateGPA() {
	        gpa = (1.0/3)*m1 + (1.0/2)*m2 + (1.0/4)*m3;
	    }
	    
}