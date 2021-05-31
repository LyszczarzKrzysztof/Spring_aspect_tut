package com.example;

import jdk.nashorn.internal.runtime.regexp.joni.exception.JOniException;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

//to jest aspect
public class LoggingAspect {
    public void logExecution(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
    }

}
