package com.iman.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "dvtpsychomoteurreference")
public class DvtPsychoMoteurReference {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idpsycho")
	private long idPsycho;
	
	@Column(name="agepsycho")
	private int agePsycho;
	
	@Column(name="motricite")
	private String motricite;
	
	@Column(name="prehension")
	private String prehension;
	
	@Column(name="relation")
	private String relation;	
	
	@Column(name="langage")
	private String langage;
}
