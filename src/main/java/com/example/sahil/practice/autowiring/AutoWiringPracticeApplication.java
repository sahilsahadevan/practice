package com.example.sahil.practice.autowiring;

import com.example.sahil.practice.autowiring.service.SortServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@ComponentScan({"com.example.sahil.practice.autowiring.by_name.sort", "com.example.sahil.practice.autowiring.by_name"})
@SpringBootApplication
public class AutoWiringPracticeApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext =  SpringApplication.run(AutoWiringPracticeApplication.class, args);
		SortServiceImpl sortService = applicationContext.getBean(SortServiceImpl.class);
		sortService.sort();
	}
}
