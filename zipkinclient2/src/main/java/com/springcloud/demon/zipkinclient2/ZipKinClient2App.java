package com.springcloud.demon.zipkinclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ZipKinClient2App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ZipKinClient2App.class, args);
        System.out.println( "Hello World!" );
    }
}
