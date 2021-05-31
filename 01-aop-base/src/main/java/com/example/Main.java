package com.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SimpleBean simpleBean = context.getBean("simpleBean", SimpleBean.class);
        simpleBean.doSomething();
    }
}
