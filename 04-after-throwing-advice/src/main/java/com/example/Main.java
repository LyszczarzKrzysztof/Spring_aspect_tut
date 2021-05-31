package com.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        CustomerRepository customerRepository = context.getBean("customerRepository", CustomerRepository.class);

        Customer customer1 = new Customer("Janek");
        Customer customer2 = new Customer(null);

        customerRepository.addCustomer(customer1);
        customerRepository.addCustomer(customer2);
    }
}
