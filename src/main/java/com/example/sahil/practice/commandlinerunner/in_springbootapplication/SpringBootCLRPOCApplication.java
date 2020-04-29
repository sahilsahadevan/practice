package com.example.sahil.practice.commandlinerunner.in_springbootapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCLRPOCApplication implements CommandLineRunner {
    protected final Logger logger = LoggerFactory.getLogger(SpringBootCLRPOCApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootCLRPOCApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("CommandLineRunner run method Started from SpringBootCLRPOCApplication !!");
    }
}