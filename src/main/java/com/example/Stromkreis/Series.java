package com.example.Stromkreis;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data	
public class Series implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	String imdb_id;
	String name;
	int year_from;
	int year_to;
	String country;
	boolean in_production;
	int max_seasons;
	String description;
	
	@ManyToOne
	private StreamService streamingEntity = null;
	
}

