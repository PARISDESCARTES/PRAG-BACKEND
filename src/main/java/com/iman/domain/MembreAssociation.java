package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "membreassociation")
public class MembreAssociation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idmembreassociation")
    private long idMembreAssociation;


    @Column(name="rolemembreassociation")
    private String roleMembreAssociation;

    @Column(name="photomembreassociation")
    private String photoMembreAssociation;

    @Column(name="descriptionmembreassociation")
    private String descriptionMembreAssociation;

    @Column(name="idcompte")
    private long idCompte;

	public long getIdMembreAssociation() {
		return idMembreAssociation;
	}

	public void setIdMembreAssociation(long idMembreAssociation) {
		this.idMembreAssociation = idMembreAssociation;
	}

	public String getRoleMembreAssociation() {
		return roleMembreAssociation;
	}

	public void setRoleMembreAssociation(String roleMembreAssociation) {
		this.roleMembreAssociation = roleMembreAssociation;
	}

	public String getPhotoMembreAssociation() {
		return photoMembreAssociation;
	}

	public void setPhotoMembreAssociation(String photoMembreAssociation) {
		this.photoMembreAssociation = photoMembreAssociation;
	}

	public String getDescriptionMembreAssociation() {
		return descriptionMembreAssociation;
	}

	public void setDescriptionMembreAssociation(String descriptionMembreAssociation) {
		this.descriptionMembreAssociation = descriptionMembreAssociation;
	}

	public long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(long idCompte) {
		this.idCompte = idCompte;
	}
    
    
}