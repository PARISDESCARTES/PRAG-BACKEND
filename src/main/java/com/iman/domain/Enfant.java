package com.iman.domain;

import java.util.Date;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "enfant")
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

	public long getIdEnfant() {
		return idEnfant;
	}

	public void setIdEnfant(long idEnfant) {
		this.idEnfant = idEnfant;
	}

	public Date getDateNaissanceEnfant() {
		return dateNaissanceEnfant;
	}

	public void setDateNaissanceEnfant(Date dateNaissanceEnfant) {
		this.dateNaissanceEnfant = dateNaissanceEnfant;
	}

	public char getSexeEnfant() {
		return sexeEnfant;
	}

	public void setSexeEnfant(char sexeEnfant) {
		this.sexeEnfant = sexeEnfant;
	}

	public String getDiagnosticEnfant() {
		return diagnosticEnfant;
	}

	public void setDiagnosticEnfant(String diagnosticEnfant) {
		this.diagnosticEnfant = diagnosticEnfant;
	}

	public String getDescriptionEnfant() {
		return descriptionEnfant;
	}

	public void setDescriptionEnfant(String descriptionEnfant) {
		this.descriptionEnfant = descriptionEnfant;
	}

	public String getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(String idCompte) {
		this.idCompte = idCompte;
	}
}

