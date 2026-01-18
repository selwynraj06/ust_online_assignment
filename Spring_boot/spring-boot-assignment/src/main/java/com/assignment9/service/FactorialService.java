package com.assignment9.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {
	
	public int findFactoiral(int n) {
		int m=1;
		for(int i=1;i<=n;i++) {
			m*=i;
		}
		return m;
	}
}
