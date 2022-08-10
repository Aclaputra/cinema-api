package com.movies.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.cinema.entity.Cast;

public interface CastRepository extends JpaRepository<Cast, Integer> {
    
}