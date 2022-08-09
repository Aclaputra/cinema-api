package com.movies.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MOVIES")
public class Movies {
    @Id 
    @GeneratedValue
    private int id;
    private String name;
    private String language;
    private String status;
    
}