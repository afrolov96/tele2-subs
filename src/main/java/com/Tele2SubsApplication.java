package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Tele2SubsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tele2SubsApplication.class, args);
	}
}
