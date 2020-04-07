package com.example.sahil.practice.scope;

import com.example.sahil.practice.scope.dao.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopePracticeApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ScopePracticeApplication.class);

	public static void main(String[] args) {
	ApplicationContext applicationContext =  SpringApplication.run(ScopePracticeApplication.class, args);
		PersonDao personDao1 = applicationContext.getBean(PersonDao.class);
		LOGGER.info("==========> PersonDao1 instance = {}", personDao1);
		LOGGER.info("==========> PersonDao1.getJdbcConnection() instance = {}", personDao1.getJdbcConnection());

		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);
		LOGGER.info("==========> PersonDao2 instance = {}", personDao2);
		LOGGER.info("==========> PersonDao2.getJdbcConnection() instance = {}", personDao2.getJdbcConnection());

		PersonDao personDao3 = applicationContext.getBean(PersonDao.class);
		LOGGER.info("==========> PersonDao3 instance = {}", personDao3);
		LOGGER.info("==========> PersonDao3.getJdbcConnection() instance = {}", personDao3.getJdbcConnection());

	}
}
