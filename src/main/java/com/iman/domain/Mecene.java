package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "mecene")
public class Mecene {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idmecene")
    private long idMecene;

    @Column(name="adressemecene")
    private String adresseMecene;

    @Column(name="siretmecene")
    private String siretMecene;

    @Column(name="nommecene")
    private String nomMecene;

    @Column(name="codepostalmecene")
    private String codePostalMecene;

    @Column(name="villemecene")
    private String villeMecene;

    @Column(name="paysmecene")
    private String paysMecene;

    @Column(name="telephoneaccueil")
    private String telephoneAccueil;

    @Column(name="idcompte")
    private long idCompte;

    @Column(name="idformejuridique")
    private long idFormeJuridique;

    @Column(name="idtypepartenaire")
    private long idTypePartenaire;

	public long getIdMecene() {
		return idMecene;
	}

	public void setIdMecene(long idMecene) {
		this.idMecene = idMecene;
	}

	public String getAdresseMecene() {
		return adresseMecene;
	}

	public void setAdresseMecene(String adresseMecene) {
		this.adresseMecene = adresseMecene;
	}

	public String getSiretMecene() {
		return siretMecene;
	}

	public void setSiretMecene(String siretMecene) {
		this.siretMecene = siretMecene;
	}

	public String getNomMecene() {
		return nomMecene;
	}

	public void setNomMecene(String nomMecene) {
		this.nomMecene = nomMecene;
	}

	public String getCodePostalMecene() {
		return codePostalMecene;
	}

	public void setCodePostalMecene(String codePostalMecene) {
		this.codePostalMecene = codePostalMecene;
	}

	public String getVilleMecene() {
		return villeMecene;
	}

	public void setVilleMecene(String villeMecene) {
		this.villeMecene = villeMecene;
	}

	public String getPaysMecene() {
		return paysMecene;
	}

	public void setPaysMecene(String paysMecene) {
		this.paysMecene = paysMecene;
	}

	public String getTelephoneAccueil() {
		return telephoneAccueil;
	}

	public void setTelephoneAccueil(String telephoneAccueil) {
		this.telephoneAccueil = telephoneAccueil;
	}

	public long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(long idCompte) {
		this.idCompte = idCompte;
	}

	public long getIdFormeJuridique() {
		return idFormeJuridique;
	}

	public void setIdFormeJuridique(long idFormeJuridique) {
		this.idFormeJuridique = idFormeJuridique;
	}

	public long getIdTypePartenaire() {
		return idTypePartenaire;
	}

	public void setIdTypePartenaire(long idTypePartenaire) {
		this.idTypePartenaire = idTypePartenaire;
	}

    
    
}