package com.springcloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.feign.interfaces.FeignServiceTest;


@RestController
public class FeignController {

	@Autowired
	private FeignServiceTest feignServiceTest;
	
	@RequestMapping("/feign/call/{name}")
	public String callService(@PathVariable String name){
		return feignServiceTest.callService(name);
	}
	
	
}
