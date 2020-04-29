package com.example.sahil.practice.commandlinerunner.as_component.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class ApplicationStartupRunnerComponentOne implements CommandLineRunner {
    protected final Logger logger = LoggerFactory.getLogger(ApplicationStartupRunnerComponentOne.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("ApplicationStartupRunnerComponentOne run method Started !!");
    }
}