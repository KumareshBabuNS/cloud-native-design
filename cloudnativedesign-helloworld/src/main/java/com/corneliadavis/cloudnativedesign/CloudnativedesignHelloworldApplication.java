package com.corneliadavis.cloudnativedesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class CloudnativedesignHelloworldApplication {

	public static Map<String, String> validTokens = new HashMap<String, String>();

	public static void main(String[] args) {
		SpringApplication.run(CloudnativedesignHelloworldApplication.class, args);
	}
}
