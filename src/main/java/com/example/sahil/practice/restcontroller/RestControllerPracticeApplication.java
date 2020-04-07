package com.example.sahil.practice.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestControllerPracticeApplication {
    //private static final Logger LOGGER = LoggerFactory.getLogger(RestControllerPracticeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RestControllerPracticeApplication.class, args);
/*
      ApplicationContext applicationContext = SpringApplication.run(RestControllerPracticeApplication.class, args);
        int i = 1;
        for (String name : applicationContext.getBeanDefinitionNames()) {
            LOGGER.info("=======> {}:{}", i, name);
            i++;
        }
*/
    }
}
