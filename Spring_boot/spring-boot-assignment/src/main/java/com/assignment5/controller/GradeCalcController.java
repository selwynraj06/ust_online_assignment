package com.assignment5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment5.service.GradeCalcService;

@RestController
public class GradeCalcController {
	
	@Autowired
	private GradeCalcService checkTheGrade;
	
	// http://localhost:8080/grade/98
	@GetMapping("/grade/{mark}")
	public String markToGrage(@PathVariable int mark) {
		return checkTheGrade.checkGrade(mark);
	}
}
