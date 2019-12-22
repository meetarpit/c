package com.dynamisch.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.dynamisch.demo.model","com.dynamisch.demo.repo","com.dynamisch.demo.controller"})
public class BootRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootRestApiApplication.class, args);
	}

}

