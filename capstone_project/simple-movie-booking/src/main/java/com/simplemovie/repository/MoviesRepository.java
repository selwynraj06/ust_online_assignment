package com.simplemovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplemovie.entity.Movies;

public interface MoviesRepository extends JpaRepository<Movies, Integer>{

}
