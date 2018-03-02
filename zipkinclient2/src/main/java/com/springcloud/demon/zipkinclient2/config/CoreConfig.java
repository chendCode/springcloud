package com.springcloud.demon.zipkinclient2.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Configuration
public class CoreConfig {

	@Bean
	@LoadBalanced
	RestTemplate createRestTemplate(){
		return new RestTemplate();
	} 
	 
	
}
