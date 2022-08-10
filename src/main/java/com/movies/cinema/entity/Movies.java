package com.movies.cinema.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.movies.cinema.entity.Cast;

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
    
    @OneToMany(targetEntity = Cast.class, cascade = CascadeType.ALL)
    @JoinColumn(name = 'mc_fk', referencedColumn = 'id')
    private List<Cast> casts;
}