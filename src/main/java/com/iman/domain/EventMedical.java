package com.iman.domain;

import java.util.Date;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "eventmedical")
public class EventMedical {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idevent")
	private long idEvent; 
	
	@Column(name="titreevent")
	private String titreEvent;
	
	@Column(name="dateevent")
	private Date dateEvent;
	
	@Column(name="idenfant")
	private long idEnfant;
	
	@Column(name="idtherapeute")
	private long idTherapeute;
	
	@Column(name="idtypeevent")
	private long idTypeEvent;
	
	@Column(name="descriptionevent")
	private String descriptionEvent;
	
	@Column(name="idtherapie")
	private long idTherapie;
}
