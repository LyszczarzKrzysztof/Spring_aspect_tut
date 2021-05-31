package com.example;

public interface CustomerRepository {
    Customer getCustomer(long customerId);
    String getCustomerName(long customerId);
    public void addCustomer(Customer customer);
}
