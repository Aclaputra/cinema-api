package com.movies.cinema.entity;

import java.sql.Timestamp;

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
@Table(name = "CAST")
public class Cast {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private Timestamp birthday;
    private Timestamp deadday;
    private int rating;
}