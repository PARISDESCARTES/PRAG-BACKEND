package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "compte")
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idcompte")
	private long idCompte;

	@Column(name="prenomcompte")
	private String prenomCompte;

	@Column(name="nomcompte")
	private String nomCompte;

	@Column(name="telephonecompte")
	private String telephoneCompte;

	@Column(name="logincompte")
	private String loginCompte;

	@Column(name="passwordcompte")
	private String passwordCompte;

	@Column(name="dernierecocompte")
	private Date derniereCoCompte;

	@Column(name="emailcompte")
	private String emailCompet;

	@Column(name="isadmin")
		private boolean isAdmin;

	@Column(name="adressecompte")
	private String adresseCompte;

	@Column(name="codepostalcompte")
	private String codePostalCompte;

	@Column(name="villecompte")
	private String villeCompte;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idtypecompte")
	private TypeCompte idTypeCompte;

	public String getPrenomCompte() {
		return prenomCompte;
	}

	public void setPrenomCompte(String prenomCompte) {
		this.prenomCompte = prenomCompte;
	}

	public long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(long idCompte) {
		this.idCompte = idCompte;
	}

	public String getNomCompte() {
		return nomCompte;
	}

	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}

	public String getTelephoneCompte() {
		return telephoneCompte;
	}

	public void setTelephoneCompte(String telephoneCompte) {
		this.telephoneCompte = telephoneCompte;
	}

	public String getPasswordCompte() {
		return passwordCompte;
	}

	public void setPasswordCompte(String passwordCompte) {
		this.passwordCompte = passwordCompte;
	}

	public String getLoginCompte() {
		return loginCompte;
	}

	public void setLoginCompte(String loginCompte) {
		this.loginCompte = loginCompte;
	}

	public String getEmailCompet() {
		return emailCompet;
	}

	public void setEmailCompet(String emailCompet) {
		this.emailCompet = emailCompet;
	}

	public Date getDerniereCoCompte() {
		return derniereCoCompte;
	}

	public void setDerniereCoCompte(Date derniereCoCompte) {
		this.derniereCoCompte = derniereCoCompte;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean admin) {
		isAdmin = admin;
	}

	public String getAdresseCompte() {
		return adresseCompte;
	}

	public void setAdresseCompte(String adresseCompte) {
		this.adresseCompte = adresseCompte;
	}

	public String getCodePostalCompte() {
		return codePostalCompte;
	}

	public void setCodePostalCompte(String codePostalCompte) {
		this.codePostalCompte = codePostalCompte;
	}

	public String getVilleCompte() {
		return villeCompte;
	}

	public void setVilleCompte(String villeCompte) {
		this.villeCompte = villeCompte;
	}


}
