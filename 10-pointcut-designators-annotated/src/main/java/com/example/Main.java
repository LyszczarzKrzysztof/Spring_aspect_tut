package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SomeBean someBean = context.getBean("someBean", SomeBean.class);

        someBean.businessMethod();
        someBean.nonBusinessMethod();
    }
}
