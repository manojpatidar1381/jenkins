package com.spring.security;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	private static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	
	
	@PostConstruct
	public void init() {
		logger.info("Application initiated...............");
	}
	
	
	public static void main(String[] args) {
		logger.info("Application executed................");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
