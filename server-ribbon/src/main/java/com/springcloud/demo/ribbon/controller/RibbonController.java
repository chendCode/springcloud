package com.springcloud.demo.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springcloud.demo.ribbon.service.RibbonTestService;



@Controller
public class RibbonController {
	@Autowired
	private RibbonTestService testService;
	
	/**
	 * 负载均衡统一对外接口
	 * @param name
	 * @return
	 */
	@RequestMapping("/ribbonTest/{name}")
	@ResponseBody
	public String ribbonTest(@PathVariable String name){
		return  testService.callHiService(name);
	}
}
