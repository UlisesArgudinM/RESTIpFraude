package com.ibm.academia.restapi.ip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RestIpFraudeApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(RestIpFraudeApplication.class, args);
	}

}
