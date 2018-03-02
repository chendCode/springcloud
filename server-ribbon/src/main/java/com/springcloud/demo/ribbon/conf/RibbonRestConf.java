package com.springcloud.demo.ribbon.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * springboot 自定义配置信息
 * 负载均衡配置
 * @author chendi
 *
 */
@Configuration
public class RibbonRestConf{
	
	/**
	 * @LoadBalanced注解表明这个restRemplate开启负载均衡的功能
	 * @return
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	
}