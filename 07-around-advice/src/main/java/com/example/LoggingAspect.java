package com.example;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

//to jest aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    //    to jest advice
    public void logExecution() {
        logger.info("Method executing");
    }

    public void warnIfNull(Object returnedValue) {
        if (returnedValue == null) {
            logger.warn("Returned value is null!!");
        }
    }

    public void serveException(RuntimeException e) {
        logger.error("Exception: " + e.getMessage());
    }

    public void methodExecuted(JoinPoint joinPoint) {
        joinPoint.getKind();
        joinPoint.getArgs();
        joinPoint.getSignature().toLongString();
        joinPoint.getSignature().toShortString();
        joinPoint.getSignature().getModifiers(); // java.lang.reflect.Modifier.* - mozna sie dowiedziec
                                                // jaki modyfikator dostepu ma metoda na ktorej wywolujemy getModifiers()
        joinPoint.getTarget(); //oryginalny obiekt
        joinPoint.getThis(); // proxy - obiekt ulepszony tworzony w aspekcie na podstawie obiektu podstawowego
                            // odpowiedzialny za dodanie dodatkowych funkcjonalności do obiektu podstawowego i
                            // za wywolanie metody methodExecuted() i wywolanie oryginalnego obiektu
        logger.info("Method " + joinPoint.getSignature().getName() + " has already been executed");
    }

}
