package com.iman.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "medicament")
public class Medicament {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idmedicament")
	private long idMedicament;
	
	@Column(name="nommedicament")
	private String nomMedicament;
	
	@Column(name="descriptionmedicament")
	private String descriptionMedicament;
	
	@Column(name="posologiemedicament")
	private String posologieMedicament;
}
