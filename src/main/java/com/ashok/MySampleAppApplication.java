package com.ashok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySampleAppApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to jenkins CI and CD......");
		SpringApplication.run(MySampleAppApplication.class, args);
	}

}
