package com.learning.testprojectlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan
public class TestProjectLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectLearningApplication.class, args);
	}

	@Bean
	@ConfigurationProperties(prefix = "droid")
	Droid createDroid() {
		return new Droid();
	}
}