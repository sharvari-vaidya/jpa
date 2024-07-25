package com.demo.Jpaa.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {
	
	
	@Bean("Mybean")
	public void getConfig() {
		System.out.println("In configuration class");
	}

}
