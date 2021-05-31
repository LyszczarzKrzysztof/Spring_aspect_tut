package com.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        CustomerRepository customerRepository = context.getBean("customerRepository", CustomerRepository.class);
        System.out.println(customerRepository.getCustomerName(34L));
        customerRepository.getCustomer(1L);
    }
}
