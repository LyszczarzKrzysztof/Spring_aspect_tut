package com.example;


import com.example.package1.AnotherBean;
import com.example.package1.subpackage.ThirdBean;
import com.example.package2.SomeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SomeBean someBean = context.getBean("someBean", SomeBean.class);
        AnotherBean anotherBean = context.getBean("anotherBean", AnotherBean.class);
        ThirdBean thirdBean = context.getBean("thirdBean", ThirdBean.class);

        someBean.setSomething(null);
        someBean.setAnotherThing(null);
        someBean.getSomething();
        someBean.anotherMethod();
        someBean.setInteger(1);
        someBean.setTwoParameters(null, null);

        anotherBean.setSomething(null);
        anotherBean.setAnotherThing(null);
        anotherBean.getSomething();
        anotherBean.anotherMethod();
        anotherBean.setInteger(1);
        anotherBean.setTwoParameters(null, null);

        thirdBean.setSomething(null);
        thirdBean.setAnotherThing(null);
        thirdBean.getSomething();
        thirdBean.anotherMethod();
        thirdBean.setInteger(1);
        thirdBean.setTwoParameters(null, null);
        
    }
}
