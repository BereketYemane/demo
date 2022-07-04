package com.Jenkins;


import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@SpringBootApplication
public class DemoApplication {

	public static Logger logger =  (Logger) LoggerFactory.getLogger(DemoApplication.class);

	@PostConstruct
	public void starter() {
		logger.info("Application started");
	}

	public static void main(String[] args) {
		logger.info("Application executed");
		SpringApplication.run(DemoApplication.class, args);
	}

}
