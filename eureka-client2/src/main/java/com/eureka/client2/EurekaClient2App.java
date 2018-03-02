package com.eureka.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */

@EnableEurekaClient
@SpringBootApplication
public class EurekaClient2App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EurekaClient2App.class, args);
        System.out.println( "Hello World!" );
    }
}
