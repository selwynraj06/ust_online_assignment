package com.assignment13.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleInterestService {
	
	public double claculateSI(int p,int r,int t) {
		return (p*r*t)/100.0;
	}
	
}
