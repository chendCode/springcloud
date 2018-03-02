package com.springcloud.demo.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfClient2App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ConfClient2App.class, args);
        System.out.println( "Hello World!" );
    }
}
