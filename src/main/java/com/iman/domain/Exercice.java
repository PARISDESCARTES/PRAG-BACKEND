package com.iman.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "exercice")
public class Exercice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idexercice")
	private long idExercice;
	
	@Column(name="nomexercice")
	private String nomExercice;
}
