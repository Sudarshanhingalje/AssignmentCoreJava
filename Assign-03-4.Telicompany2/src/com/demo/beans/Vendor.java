package com.demo.beans;

import java.util.List;

public class Vendor extends Person {
    private int vendorId;
    private String phoneNumber;
    private List<String> productsSupplied;

    public Vendor(int vendorId, String name, String email, String phoneNumber, List<String> productsSupplied) {
        super(name, email);
        this.vendorId = vendorId;
        this.phoneNumber = phoneNumber;
        this.productsSupplied = productsSupplied;
    }
}
