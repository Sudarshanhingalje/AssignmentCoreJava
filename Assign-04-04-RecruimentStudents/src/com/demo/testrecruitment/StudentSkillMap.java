package com.demo.testrecruitment;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class StudentSkillMap {

    public static <Student> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Student, String> studentSkillMap = new HashMap<>();

        while (true) {
            System.out.println("\n1. Add new student");
            System.out.println("2. Add new skill for a student");
            System.out.println("3. Delete student");
            System.out.println("4. Delete skill for a student");
            System.out.println("5. Display all students with given skill");
            System.out.println("6. Display all students with given degree");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter student ID: ");
                        int sid = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter student birthdate (yyyy-mm-dd): ");
                        String bdateInput = scanner.nextLine();
                        LocalDate bdate = LocalDate.parse(bdateInput);
                        System.out.print("Enter student degree: ");
                        String degree = scanner.nextLine();
                        System.out.print("Enter student marks: ");
                        double marks = scanner.nextDouble();
                        scanner.nextLine(); // consume newline

                        Student newStudent = new Student(sid, name, bdate, degree, marks);
                        studentSkillMap.put(newStudent, "");

                        System.out.println("New student added:");
                        System.out.println(newStudent);
                        break;

                    case 2:
                        System.out.print("Enter student ID: ");
                        int studentSid = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        System.out.print("Enter new skill: ");
                        String newSkill = scanner.nextLine();

                        for (Student student : studentSkillMap.keySet()) {
                            if (student.sid == studentSid) {
                                String currentSkills = studentSkillMap.get(student);
                                if (currentSkills.isEmpty()) {
                                    studentSkillMap.put(student, newSkill);
                                } else {
                                    studentSkillMap.put(student, currentSkills + ", " + newSkill);
                                }
                                System.out.println("Skill added for student: " + student);
                                break;
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Enter student ID: ");
                        int delSid = scanner.nextInt();

                        for (Student student : studentSkillMap.keySet()) {
                            if (student.sid == delSid) {
                                studentSkillMap.remove(student);
                                System.out.println("Student deleted: " + student);
                                break;
                            }
                        }
                        break;

                    case 4:
                        System.out.print("Enter student ID: ");
                        int delSkillSid = scanner.nextInt();
                        System.out.print("Enter skill to delete: ");
                        String delSkill = scanner.nextLine();

                        for (Student student : studentSkillMap.keySet()) {
                            if (student.sid == delSkillSid) {
                                String currentSkills = studentSkillMap.get(student);
                                String[] skills = currentSkills.split(", ");
                                StringBuilder newSkills = new StringBuilder();
                                boolean found = false;

                                for (String skill : skills) {
                                    if (!skill.equals(delSkill)) {
                                        newSkills.append(skill).append(", ");
                                    } else {
                                        found = true;
                                    }
                                }

                                if (found) {
                                    studentSkillMap.put(student, newSkills.toString());
                                    System.out.println("Skill deleted for student: " + student);
                                } else {
                                    System.out.println("Skill not found");
                                }
                                break;
                            }
                        }
                        break;

                    case 5:
                        System.out.print("Enter skill to search: ");
                        String searchSkill = scanner.nextLine();

                        for (Student student : studentSkillMap.keySet()) {
                            String skills = studentSkillMap.get(student);
                            if (skills.contains(searchSkill)) {
                                System.out.println(student);
                            }
                        }
                        break;

                    case 6:
//                        System.out.print("Enter degree to search: ");
//                        String searchDegree = scanner.nextLine();
//
//                        for (Student student : studentSkillMap.keySet()) {
//                            if (student.degree.equals(searchDegree)) {
//                                System.out.println(student);
//                            }
//                        }
                        break;

                    case 7:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine(); // consume input
            }
        }
    }
}