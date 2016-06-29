package com.iman.domain;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "don")
public class Don {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="iddon")
	private long idDon;
	@Column(name="montantdon")
	private float montantDon;
	@Column(name="idenfant")
	private long idEnfant;
	@Column(name="idmecene")
	private long idMecene;
	@Column(name="idinfodon")
	private long idInfoDon;
	@Column(name="iddon", insertable=false, updatable=false)
	private long idModePaiement;
	public long getIdDon() {
		return idDon;
	}
	public void setIdDon(long idDon) {
		this.idDon = idDon;
	}
	public float getMontantDon() {
		return montantDon;
	}
	public void setMontantDon(float montantDon) {
		this.montantDon = montantDon;
	}
	public long getIdEnfant() {
		return idEnfant;
	}
	public void setIdEnfant(long idEnfant) {
		this.idEnfant = idEnfant;
	}
	public long getIdMecene() {
		return idMecene;
	}
	public void setIdMecene(long idMecene) {
		this.idMecene = idMecene;
	}
	public long getIdInfoDon() {
		return idInfoDon;
	}
	public void setIdInfoDon(long idInfoDon) {
		this.idInfoDon = idInfoDon;
	}
	public long getIdModePaiement() {
		return idModePaiement;
	}
	public void setIdModePaiement(long idModePaiement) {
		this.idModePaiement = idModePaiement;
	}
	
	
	
	
}
