package com.iman;

import java.util.Date;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "enfant")
public class Enfant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idenfant")
	private long idEnfant;
	
	@Column(name="datenaissanceenfant")
	private Date dateNaissanceEnfant;
	
	@Column(name="sexeenfant")
	private char sexeEnfant;
	
	@Column(name="diagnosticenfant")
	private String diagnosticEnfant;
	
	@Column(name="descriptionenfant")
	private String descriptionEnfant; 
	
	@Column(name="idcompte")
	private String idCompte;
}

