package com.example.sahil.practice.aop;

import com.example.sahil.practice.aop.business.BusinessServiceImpl1;
import com.example.sahil.practice.aop.business.BusinessServiceImpl2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopPracticeApplication implements CommandLineRunner {

    /*
     * Implementing CommandLineRunner to Test AOP intercepts (once per startup) as soon as App starts running.
     * Since Application implements CommandLineRunner, The class is no longer
     * a static class and hence can be autowired instead of having to getBeans from application context like in traditional static main application classes
     */

    @Autowired
    public BusinessServiceImpl1 businessServiceImpl1;

    @Autowired
    public BusinessServiceImpl2 businessServiceImpl2;

    private static final Logger LOGGER = LoggerFactory.getLogger(AopPracticeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AopPracticeApplication.class, args);
    }

    //CommanLineRunner Override. Insert RunTime logic here.
    @Override
    public void run(String... args) throws Exception {
        businessServiceImpl1.calculateSomething();
        businessServiceImpl2.calculateSomething();
    }

}