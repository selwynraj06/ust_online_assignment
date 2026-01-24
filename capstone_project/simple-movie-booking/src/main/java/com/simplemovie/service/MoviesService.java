package com.simplemovie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplemovie.entity.Movies;
import com.simplemovie.repository.MoviesRepository;

@Service
public class MoviesService {
	
	@Autowired
	MoviesRepository movieRepo;
	
	public List<Movies> showAllMovies(){
		return movieRepo.findAll();
	}
	
	public String addMovies(Movies movie) {
		movieRepo.save(movie);
		return "Movie added successfully";
	}
	
}
