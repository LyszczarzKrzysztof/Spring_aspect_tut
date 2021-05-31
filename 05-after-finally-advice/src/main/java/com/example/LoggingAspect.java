package com.example;

import org.apache.log4j.Logger;

//to jest aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    //    to jest advice
    public void logExecution(){
        logger.info("Method executing");
    }

    public void warnIfNull(Object returnedValue){
        if (returnedValue==null){
            logger.warn("Returned value is null!!");
        }
    }

    public void serveException(RuntimeException e){
        logger.error("Exception: "+e.getMessage());
    }

    public void methodExecuted(){
        logger.info("Method has already been executed");
    }

}
