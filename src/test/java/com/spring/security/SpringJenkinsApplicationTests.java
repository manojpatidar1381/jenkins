package com.spring.security;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SpringJenkinsApplicationTests {

	private static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	
	@Test
	void contextLoads() {
       logger.info("test cases executing1111111...............");
		Assert.isTrue(true,"test passed");
	}

}
