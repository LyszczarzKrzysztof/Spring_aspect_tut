package com.example;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.CustomEditorConfigurer;

public class CustomerRepositoryImpl implements CustomerRepository{
    @Override
    public Customer getCustomer(long customerId) {
        return null;
    }

    @Override
    public String getCustomerName(long customerId) {
        return "Janek";
    }

    @Override
    public void addCustomer(Customer customer){
        if(customer.getName()==null){
            throw new RuntimeException("Customer name can't be null!");
        }

        System.out.println("Customer saved!");
    }
}
