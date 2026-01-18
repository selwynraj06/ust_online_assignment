package com.example.spring_boot_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignmentApplication.class, args);
		System.out.println("Spring Boot Started");
	}

}
