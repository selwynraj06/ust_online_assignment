package com.assignment10.service;

import org.springframework.stereotype.Service;

@Service
public class PrimeService {
	
	public String checkPrime(int num) {
		double res = Math.sqrt(num);
		for(int i=2;i<=res;i++) {
			if(num%i==0) {
				return "It is not a Prime Number";
			}
		}
		return "It is a Prime Number";
	}
}
