package com.example;

import org.aspectj.lang.JoinPoint;

//to jest aspect
public class LoggingAspect {
    public void logExecution(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
    }
}
