package com.assignment1.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	public String welcomeMessage() {
		return "Welcome to Spring Boot REST API";
	}
}
