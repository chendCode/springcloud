package com.springcloud.demon.zipkinclient2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class TestController {

	private Logger logger  = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/say2/{params}")
	public String say(@PathVariable String params){
		logger.info("接收到client1请求参数 params = {}", params);
		String res = restTemplate.getForObject("http://ZIPKINCLIENT/say", String.class);
		return  res;
		
	}
	
}
