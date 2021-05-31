package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        SomeBean someBean = context.getBean("someBean", SomeBean.class);

        someBean.method1();
//        someBean.method2();
    }
}
