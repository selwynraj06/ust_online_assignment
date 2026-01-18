package com.assignment14.service;

import org.springframework.stereotype.Service;

@Service
public class WordCountService {

	public int countWords(String str) {
		String[] s = str.split(" ");
		return s.length;
	}
}
