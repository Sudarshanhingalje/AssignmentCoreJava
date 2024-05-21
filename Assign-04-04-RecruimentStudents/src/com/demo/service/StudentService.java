//package com.demo.service;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import com.demo.beans.Student;
//
//public class StudentService {
//
//	 private Map<Student, Map<String, Boolean>> students;
//
//	    public StudentService() {
//	        students = new HashMap<>();
//	    }
//
//	    public void addStudent(Student student) {
//	        students.put(student, student.getSkills());
//	    }
//
//	    public void deleteStudent(Student student) {
//	        students.remove(student);
//	    }
//
//	    public void addSkillForStudent(Student student, String skill) {
//	        student.addSkill(skill);
//	        students.put(student, student.getSkills());
//	    }
//
//	    public void deleteSkillForStudent(Student student, String skill) {
//	        student.removeSkill(skill);
//	        students.put(student, student.getSkills());
//	    }
//
//	    public void displayStudentsWithSkill(String skill) {
//	        for (Map.Entry<Student, Map<String, Boolean>> entry : students.entrySet()) {
//	            if (entry.getValue().containsKey(skill)) {
//	                System.out.println(entry.getKey().getName());
//	            }
//	        }
//	    }
//
//	    public void displayStudentsWithDegree(String degree) {
//	        for (Student student : students.keySet()) {
//	            if (student.getDegree().equalsIgnoreCase(degree)) {
//	                System.out.println(student.getName());
//	            }
//	        }
//	    }
//
//		public Object getStudents() {
//			
//			return null;
//		}
//	}
