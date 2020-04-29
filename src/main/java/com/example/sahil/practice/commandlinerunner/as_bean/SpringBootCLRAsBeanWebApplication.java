package com.example.sahil.practice.commandlinerunner.as_bean;

import com.example.sahil.practice.commandlinerunner.as_bean.runner.ApplicationStartupRunnerOne;
import com.example.sahil.practice.commandlinerunner.as_bean.runner.ApplicationStartupRunnerTwo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class SpringBootCLRAsBeanWebApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootCLRAsBeanWebApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootCLRAsBeanWebApplication.class, args);
    }

    @Bean
    @Order(2)
    public ApplicationStartupRunnerOne schedulerRunnerOne() {
        return new ApplicationStartupRunnerOne();
    }

    @Bean
    @Order(1)
    public ApplicationStartupRunnerTwo schedulerRunnerTwo() {
        return new ApplicationStartupRunnerTwo();
    }
}