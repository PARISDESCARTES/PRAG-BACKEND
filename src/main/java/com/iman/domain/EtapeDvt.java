package com.iman.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "etapedvt")
public class EtapeDvt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="iddvt")
	private long idDvt;
	
	@Column(name="nomdvt")
	private String nomDvt;
	
	@Column(name="valeurliste")
	private String valeurListe;
	
	@Column(name="descriptiondvt")
	private String descriptionDvt;
}
