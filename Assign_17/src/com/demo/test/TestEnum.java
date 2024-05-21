package com.demo.test;

import java.util.*;

import com.demo.enums.Grade;

public class TestEnum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade: ");
        String gradeStr = scanner.nextLine();

        try {
            Grade grade = Grade.valueOf(gradeStr);
            System.out.println("Minimum Marks: " + grade.getMinMarks());
            System.out.println("Maximum Marks: " + grade.getMaxMarks());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid grade!");
        }

	}

}
