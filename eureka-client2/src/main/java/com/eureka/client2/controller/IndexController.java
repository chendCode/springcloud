package com.eureka.client2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class IndexController {
	 @Value("${server.port}")
	    String port;
	 
	 
	 @RequestMapping("/hi")
	 @ResponseBody
	 public String home(@RequestParam String name) {
	        return "hi "+name+",i am from port:" +port;
	 }

}
