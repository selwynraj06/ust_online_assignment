package com.assignment6.service;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {
	
	public double convertCelsiustoFahrenheit(double celsius) {
		return (celsius*(9.0/5))+32;
	}
}
