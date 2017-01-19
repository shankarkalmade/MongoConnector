package com.shankar.mongo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.shankar.mongo.controller")
public class MongoConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoConnectorApplication.class, args);
	}
}
