package com.springcloud.demo.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


/**
 * springcloud负载均衡器
 * @author chendi
 *
 */

@EnableEurekaClient
@SpringBootApplication
@EnableHystrix //开启断路器功能
public class ServerRibbonApp {

	public static void main(String[] args) {
		
		SpringApplication.run(ServerRibbonApp.class, args);
		System.out.println("hello world");
		
	}
	
}
