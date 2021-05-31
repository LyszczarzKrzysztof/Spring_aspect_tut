package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(getClass().getName());

    @Pointcut("execution(* *(..))")
    public void allMethods() {
    }

    @Before("allMethods()")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("Execution method: " + joinPoint.getSignature().getName());
    }
}
