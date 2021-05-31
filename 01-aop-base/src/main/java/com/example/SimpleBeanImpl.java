package com.example;


import java.util.logging.Logger;

public class SimpleBeanImpl implements SimpleBean{
    @Override
    public void doSomething() {
       Logger.getLogger(this.getClass().getName()).info("I'm doing something!");
        org.apache.log4j.Logger.getLogger(this.getClass().getName()).info("I'm doing something!");
    }
}
