package com.demo.eurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */

@EnableEurekaClient
@SpringBootApplication
public class EureClientApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EureClientApp.class, args);
        System.out.println( "Hello World!" );
    }
}
