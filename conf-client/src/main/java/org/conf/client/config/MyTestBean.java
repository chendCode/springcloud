package org.conf.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@RefreshScope
public class MyTestBean {

	public final static String prefix = "cd.demon";
	
	@Value("${cd.demon.name}")
	private String ip ;
	@Value("${cd.demo.email}")
	private String port;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}


}
