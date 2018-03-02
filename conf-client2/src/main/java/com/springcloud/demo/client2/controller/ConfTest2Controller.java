package com.springcloud.demo.client2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.demo.client2.conf.MyTestBean;

@RestController
public class ConfTest2Controller {
private Logger logger =LoggerFactory.getLogger(ConfTest2Controller.class);
	
	@Autowired
	private MyTestBean testBean;
	
	@RequestMapping("show2")
	public void showConfCenterParams(){
		logger.info("自定义配置信息如下 : ip = {},port = {}",testBean.getIp(),testBean.getPort());
	}
}
