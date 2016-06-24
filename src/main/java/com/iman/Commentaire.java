package com.iman;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "commentaire")
public class Commentaire {

	@Column(name="idcompte")
	private long idCompte;
	
	@Column(name="idevent")
	private long idEvent;
	
	@Column(name="commentaire")
	private String commentaire;
	
}
