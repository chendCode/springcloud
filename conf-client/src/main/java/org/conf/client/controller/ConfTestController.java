package org.conf.client.controller;


import org.conf.client.config.MyTestBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ConfTestController {

	private Logger logger =LoggerFactory.getLogger(ConfTestController.class);
	
	
	//@Value("${ip}")
	private String ip;
	
	//@Value("${port}")
	private String port; 
	
	@RequestMapping("show")
	public void showConfCenterParams(){
		logger.info("自定义配置信息如下 : ip = {},email = {}",ip,port);
	}
	
}
