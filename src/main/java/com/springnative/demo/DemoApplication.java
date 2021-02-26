package com.springnative.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(proxyBeanMethods = false)
@ComponentScan("com.springnative")
//@EntityScan("com.springnative.model")
//@EnableJpaRepositories("com.springnative.repository")
//@EnableAsync
public class DemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
}
