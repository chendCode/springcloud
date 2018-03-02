package com.springcloud.demon.zipkinclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	private Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/call2")
	public String callClient2(String str){
		logger.info("请求参数 params = {}", str);
		String res = restTemplate.getForObject("http://ZIPKINCLIENT2/say2/zipKinclient1", String.class);
		return  res;
	}
	
	@RequestMapping("/say")
	public String say(){
		logger.info("zipkinclient2请求成功!");
		return new String("zipkinclient2请求成功!");
	}
	
}
