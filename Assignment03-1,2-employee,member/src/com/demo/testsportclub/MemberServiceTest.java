package com.demo.testsportclub;

import com.demo.beans.Member;
import com.demo.dao.MemberDAO;
import com.demo.service.MemberService;


//import beans.Member;
//import service.MemberService;
//import dao.MemberDAO;

public class MemberServiceTest {

	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberService memberService = new MemberService(memberDAO);

		Member member1 = new Member();
		member1.setName("John Doe");
		member1.setMobileNo("1234567890");
		member1.setEmailId("john.doe@xyz.com");
		member1.setTypeOfMembership("Gold");
		member1.setAmountPaid(5000);
		memberService.addMember(member1);

		Member member2 = new Member();
		member2.setName("Jane Doe");
		member2.setMobileNo("0987654321");
		member2.setEmailId("jane.doe@xyz.com");
		member2.setTypeOfMembership("Silver");
		member2.setAmountPaid(3000);
		memberService.addMember(member2);

		memberService.displayMenu();
	}
}


