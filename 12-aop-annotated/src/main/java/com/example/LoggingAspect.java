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

    @After(value = "execution(* *(..))")
    // @After("execution(* *(..))") to samo co  @After(value = "execution(* *(..))")
    public void logAfter(JoinPoint joinPoint) {
        logger.info("After method: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "allMethods()", returning = "returnedValue")
    public void logAfterReturning(Object returnedValue) {
        logger.info("Returned value: " + returnedValue);
    }

    @AfterThrowing(pointcut = "allMethods()", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {
        logger.info("Method: " + joinPoint.getSignature().getName() + "has thrown: " + exception);
    }

    @Around("allMethods()")
    public Object executionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        logger.info("Execution time: "+ (end - start) + "ms");
        return proceed;
    }

}
