package com.springcloud.demon.zipkinclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ZipKinClientApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ZipKinClientApp.class, args);
        System.out.println( "Hello World!" );
    }
}
