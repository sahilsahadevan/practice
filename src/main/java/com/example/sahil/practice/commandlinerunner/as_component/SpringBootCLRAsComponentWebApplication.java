package com.example.sahil.practice.commandlinerunner.as_component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootCLRAsComponentWebApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootCLRAsComponentWebApplication.class);
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootCLRAsComponentWebApplication.class, args);
    }

}