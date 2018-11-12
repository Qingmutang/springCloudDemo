package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class CloudRestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRestClientApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restInit() {
		return new RestTemplate();
	}
}
