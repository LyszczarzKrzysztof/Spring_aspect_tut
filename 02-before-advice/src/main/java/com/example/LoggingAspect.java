package com.example;

import org.apache.log4j.Logger;
//to jest aspect
public class LoggingAspect {
//    to jest advice
    public void logExecution(){
        Logger.getLogger(getClass().getName()).info("Method executing");
    }
}
