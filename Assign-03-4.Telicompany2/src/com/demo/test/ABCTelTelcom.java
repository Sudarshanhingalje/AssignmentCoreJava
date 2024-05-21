package com.demo.test;

import java.util.List;

import com.demo.beans.CompanyCustomer;
import com.demo.beans.IndividualCustomer;
import com.demo.beans.Vendor;

public class ABCTelTelcom {

	public static void main(String[] args) {
		
	      // Example usage
        Vendor ven = new Vendor(1, "NKIHIL", "vendor@example.com", "1234567890", List.of("Product1", "Product2"));
        System.out.println(ven);
        IndividualCustomer individualCustomer = new IndividualCustomer(1, "Rushab", "customer@example.com", "1234567890", "Good", 0.1);
        System.out.println( individualCustomer);
        CompanyCustomer companyCustomer = new CompanyCustomer(1, "pexworldtechnology", "companycustomer@example.com", "Sagar patil", "100000", List.of("Extension1", "Extension2"), List.of("Number1", "Number2"));
        System.out.println(companyCustomer);
        
        individualCustomer.assignPlan("Plan1");
        companyCustomer.assignPlan("Plan2");
    }
	}


