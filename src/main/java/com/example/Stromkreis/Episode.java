package com.example.Stromkreis;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Data
public class Episode implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	long id;

	@Column(length = 64)
    @Size(min = 1, max = 64, message = "Season darf nicht leer sein")
	int season;
	int number;
	@Column(length = 20)
    @Size(min = 1, max = 20, message = "Imdb Id muss angegeben werden")
	String imdb_id;
	String name;

	@ManyToOne
	private Series seriesEntity = null;

}
