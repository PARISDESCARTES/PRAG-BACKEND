package com.iman;

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
	
	
	
	
}
