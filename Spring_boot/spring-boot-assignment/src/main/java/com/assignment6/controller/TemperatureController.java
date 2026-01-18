package com.assignment6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment6.service.TemperatureService;

@RestController
public class TemperatureController {
	
	@Autowired
	private TemperatureService convertCtoF;
	
	// http://localhost:8080/celsius-to-fahrenheit/16
	@GetMapping("/celsius-to-fahrenheit/{celsius}")
	public double convOfCelToFer(@PathVariable("celsius") double celsius) {
		return convertCtoF.convertCelsiustoFahrenheit(celsius);
	}
}
