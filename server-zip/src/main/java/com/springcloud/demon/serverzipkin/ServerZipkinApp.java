package com.springcloud.demon.serverzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.EnableZipkinServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class ServerZipkinApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ServerZipkinApp.class, args);
        System.out.println( "Hello World!" );
    }
}
