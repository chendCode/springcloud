package com.springcloud.feign.hystricservice;

import org.springframework.stereotype.Component;

import com.springcloud.feign.interfaces.FeignServiceTest;

@Component 
public class FeignHystricService implements FeignServiceTest {

	
	@Override
	public String callService(String name) {
		// TODO Auto-generated method stub
		return "service error"+name ;
	}
}
