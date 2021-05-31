package com.example;

public class CustomerRepositoryImpl implements CustomerRepository{
    @Override
    public Customer getCustomer(long customerId) {
        return null;
    }

    @Override
    public String getCustomerName(long customerId) {
        return "Janek";
    }
}
