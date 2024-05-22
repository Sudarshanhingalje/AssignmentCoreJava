package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Member;

public class MemberDAO {
	
	 private List<Member> members;

	    public MemberDAO() {
	        this.members = new ArrayList<>();
	    }

	    public void addMember(Member member) {
	        member.setId(members.size() + 1);
	        members.add(member);
	    }

	    public Member searchById(int id) {
	        for (Member member : members) {
	            if (member.getId() == id) {
	                return member;
	            }
	        }
	        return null;
	    }

	    public List<Member> searchByName(String name) {
	        List<Member> result = new ArrayList<>();
	        for (Member member : members) {
	            if (member.getName().equalsIgnoreCase(name)) {
	                result.add(member);
	            }
	        }
	        return result;
	    }

	    public List<Member> getAllMembers() {
	        return members;
	    }
	}
	


