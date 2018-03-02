package org.conf.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfClientApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ConfClientApp.class, args);
        System.out.println( "Hello World!" );
    }
}
