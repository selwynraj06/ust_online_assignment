package com.assignment5.service;

import org.springframework.stereotype.Service;

@Service
public class GradeCalcService {
	
	public String checkGrade(int mark) {
		if(mark>=90) {
			return "A";
		}
		else if(mark>=75) {
			return "B";
		}
		else if(mark>=60) {
			return "C";
		}
		else {
			return "fail";
		}
	}
}
