package com.flipkart.business;

public class CustomerBusiness {
    // add // update // delete // list
    public void createCustomer() {
        System.out.println("Customer created:> ");
    }
    public boolean updateCustomer(int customerId) {
        System.out.println("Customer updated by ID:> ");
        return true;
    }
    public boolean deleteCustomer(int customerId) {
        System.out.println("Customer deleted by ID:> ");
        return true;
    }

    public void listCustomers() {
        System.out.println("Customers listed:> ");
    }
}
