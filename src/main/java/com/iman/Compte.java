package com.iman;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
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

	@Column(name="idtypecompte")
	private long idTypeCompte;

}
