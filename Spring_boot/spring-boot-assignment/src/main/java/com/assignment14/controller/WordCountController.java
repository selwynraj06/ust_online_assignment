package com.assignment14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment14.dto.WordCountDTO;
import com.assignment14.service.WordCountService;

@RestController
public class WordCountController {
	
	@Autowired
	private WordCountService countNoWords;
	
	// http://localhost:8080/wordcount
	@PostMapping("/wordcount")
	public int CountOfWords(@RequestBody WordCountDTO requstWord) {
		return countNoWords.countWords(requstWord.getWord());
	}
	
}
