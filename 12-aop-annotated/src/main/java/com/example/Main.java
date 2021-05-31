package com.example;

import com.example.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        SomeBean someBean = context.getBean("someBean", SomeBean.class);
        someBean.someMethod();

        try {
            someBean.throwSomeException();
        } catch (Exception exception){

        }
    }
}
