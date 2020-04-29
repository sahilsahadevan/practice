package com.example.sahil.practice.commandlinerunner.as_component.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class ApplicationStartupRunnerComponentTwo implements CommandLineRunner {
    protected final Logger logger = LoggerFactory.getLogger(ApplicationStartupRunnerComponentTwo.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("ApplicationStartupRunnerComponentTwo run method Started !!");
    }
}