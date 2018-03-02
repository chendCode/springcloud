package com.springCloud.service.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */

@EnableZuulProxy //开启zuul的功能
@SpringBootApplication
public class ZuulServiceApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ZuulServiceApp.class, args);
        System.out.println( "Hello World!" );
    }
}
