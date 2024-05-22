package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Member;
import com.demo.dao.MemberDAO;

public class MemberService {
	private MemberDAO memberDAO;

    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Display all members");
            System.out.println("2. Search by id");
            System.out.println("3. Search by name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                displayAllMembers();
            } else if (choice == 2) {
                System.out.print("Enter member id: ");
                int id = scanner.nextInt();
                Member member = memberDAO.searchById(id);
                if (member != null) {
                    System.out.println(member);
                } else {
                    System.out.println("No member found with id " + id);
                }
            } else if (choice == 3) {
                System.out.print("Enter member name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                List<Member> members = memberDAO.searchByName(name);
                for (Member member : members) {
                    System.out.println(member);
                }
            } else if (choice == 4) {
            	System.out.println("Thank you for intertesting here");
                break;
                
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public void addMember(Member member) {
        memberDAO.addMember(member);
    }

    private void displayAllMembers() {
        List<Member> members = memberDAO.getAllMembers();
        for (Member member : members) {
            System.out.println(member);
        }
    }

}
