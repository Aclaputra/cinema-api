package com.movies.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.cinema.entity.Movies;

public interface MovieRepository extends JpaRepository<Movies, Integer>{
    
}