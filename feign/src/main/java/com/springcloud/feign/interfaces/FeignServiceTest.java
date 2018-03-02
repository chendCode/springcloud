package com.springcloud.feign.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springcloud.feign.hystricservice.FeignHystricService;

@FeignClient(name = "service-hi",fallback=FeignHystricService.class)
public interface FeignServiceTest {

	@RequestMapping(value="/hi",method=RequestMethod.GET)
	public String callService(@RequestParam(value="name") String name);
	
}
