package com.springcloud.demo.ribbon.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
public class RibbonTestService {

	private Logger logger = LoggerFactory.getLogger(RibbonTestService.class);
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@HystrixCommand(fallbackMethod="ErrorCallBack") //熔断方法，熔断方法直接返回了一个字符串
	public String callHiService(String name){
		logger.info("请求参数 name= {}", name);
		String res = restTemplate.getForObject("http://SERVICE-HI/hi?name="+name, String.class);
		logger.info("相应结果res = {}",res );
		return  res;
	}
	
	
	public String ErrorCallBack(String name){
		logger.info("请求服务失败 进入hystrix熔断器...");
		 return "hi,"+name+",sorry,error!";
	}
}
