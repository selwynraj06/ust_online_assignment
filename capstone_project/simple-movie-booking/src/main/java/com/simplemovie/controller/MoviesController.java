package com.simplemovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplemovie.entity.Movies;
import com.simplemovie.service.MoviesService;

@RestController
public class MoviesController {

	@Autowired
	MoviesService movieServ;
	
	// http://localhost:8080/api/movies
	@GetMapping("/api/movies")
	public List<Movies> showDetails(){
		return movieServ.showAllMovies();
	}
	
	// http://localhost:8080/api/addmovies
	@PostMapping("/api/addmovies")
	public String addMovieDetails(@RequestBody Movies moive) {
		return movieServ.addMovies(moive);
	}
}
