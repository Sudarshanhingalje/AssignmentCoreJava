package com.demo.beans;

public class Student {
	
	
    private int sId;
   private  String name;
    private  int m1, m2, m3;

    public Student(int studId, String name, int m1, int m2, int m3) {
        this.sId = studId;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void displayStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("____________");
        System.out.println("Student Id");
        System.out.println("Name: " + name);
        System.out.println("M1 : " + m1);
        System.out.println("M2: " + m2);
        System.out.println("M3: " + m3);
    }
}

//output of code--->

//*************************
//Student Details:
//____________
//Student Id
//Name: Divya
//M1 : 78
//M2: 86
//M3: 89
//Student Details:
//____________
//Student Id
//Name: Rahul
//M1 : 85
//M2: 90
//M3: 80

