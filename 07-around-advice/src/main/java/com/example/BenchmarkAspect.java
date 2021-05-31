package com.example;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class BenchmarkAspect {
    private Logger logger = Logger.getLogger(getClass());

    public void MeasureExecutionTime(ProceedingJoinPoint proceedingJoinPoint) {
        long startTime = System.nanoTime();

        try {
            // to ponizej Customer customer = (Customer) proceedingJoinPoint.getArgs()[0]; pobiera zerowy argument który powinien
            // byc klientem (pobiera go poprzez aspekt zdefiniowany w context.xml czyli benchmarkAspect dla metod addCustomer
            // i jesli jego imie jest null to robi proceedingJoinPoint.proceed(args); z podmienionym argumentem na anonim
            // jesli nie jest nullem to wykonuje proceedingJoinPoint.proceed(); bez podmienionego argumentu czyli z pierwotnym imieniem
            Customer customer = (Customer) proceedingJoinPoint.getArgs()[0];
            if (customer.getName() == null) {
                Object[] args = new Object[]{new Customer("anonim")};
                proceedingJoinPoint.proceed(args);
            } else {
                proceedingJoinPoint.proceed();
            }
        } catch (Throwable throwable) {
        }

        long endTime = System.nanoTime();

        logger.info("Execution time: " + (endTime - startTime) + "ns");
    }
}
