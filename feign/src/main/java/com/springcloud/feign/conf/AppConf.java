package com.springcloud.feign.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;



@Configuration
public class AppConf {

	@Bean
	@LoadBalanced
	RestTemplate ceateRestTemplate(){
		return new RestTemplate();
	}
}
