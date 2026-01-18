package com.assignment4.service;

import org.springframework.stereotype.Service;

@Service
public class AgeCategoryService {
	public String checkAge(int age) {
		if(age<18) {
			return "Child";
		}
		else if(age>=60) {
			return "Senior";
		}
		else {
			return "Adult";
		}
	}
}
