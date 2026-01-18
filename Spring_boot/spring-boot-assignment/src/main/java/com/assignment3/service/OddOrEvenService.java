package com.assignment3.service;

import org.springframework.stereotype.Service;

@Service
public class OddOrEvenService {
	
	public String oddOrEven(int num) {
		if(num % 2== 0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	}
}
