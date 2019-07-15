package com.cisco.gg.GGAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class GgAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(GgAuthApplication.class, args);
	}

}
