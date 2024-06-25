package com.flipkart.client;

import com.flipkart.business.CustomerBusiness;

public class CustomerClientApp {
    public static void main(String[] args) {
        // Client --> business -- bean
        //create business instance
        CustomerBusiness service = new CustomerBusiness();
        service.createCustomer();
        System.out.println("Update Customer:> " + service.updateCustomer(101));
        System.out.println("Delete Customer:> " + service.deleteCustomer(101));
        service.listCustomers();
    }
}
