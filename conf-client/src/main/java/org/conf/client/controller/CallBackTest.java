package org.conf.client.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller("/callback")
public class CallBackTest {

	@RequestMapping("/test")
	public void callBack(@RequestParam Map params){
		System.out.println(params);
	}
	
	@RequestMapping("/test2")
	public void callback2(@RequestBody Map params){
		System.out.println(params);
	}
	
}
