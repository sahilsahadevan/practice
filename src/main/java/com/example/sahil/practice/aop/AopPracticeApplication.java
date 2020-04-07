package com.example.sahil.practice.aop;

import com.example.sahil.practice.aop.business.BusinessServiceImpl1;
import com.example.sahil.practice.aop.business.BusinessServiceImpl2;
import com.example.sahil.practice.scope.dao.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopPracticeApplication implements CommandLineRunner {

	/*
	  * Since Application implements CommandLineRunner, The class is no longer a static class and hence
	  * can be autowired instead of having to getBeans from application context like in traditional static
	  * main application classes
	*/

    @Autowired
    public BusinessServiceImpl1 businessServiceImpl1;

    @Autowired
    public BusinessServiceImpl2 businessServiceImpl2;

    private static final Logger LOGGER = LoggerFactory.getLogger(AopPracticeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AopPracticeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("==========> {}", businessServiceImpl1.calculateSomething());
		LOGGER.info("==========> {}", businessServiceImpl2.calculateSomething());
    }

}
