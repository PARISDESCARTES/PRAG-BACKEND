package com.iman.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "formejuridique")
public class FormeJuridique {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idformejuridique")
	private long idFormeJuridique;
	
	@Column(name="nomformejuridique")
	private String nomFormeJuridique;
}
