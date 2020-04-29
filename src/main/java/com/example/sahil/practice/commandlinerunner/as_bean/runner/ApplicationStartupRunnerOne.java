package com.example.sahil.practice.commandlinerunner.as_bean.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

public class ApplicationStartupRunnerOne implements CommandLineRunner {
    protected final Logger logger = LoggerFactory.getLogger(ApplicationStartupRunnerOne.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("ApplicationStartupRunnerOne run method Started !!");
    }
}