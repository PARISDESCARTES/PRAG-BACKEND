package com.iman.domain;

import java.util.Date;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "dateprogrammation")
public class DateProgrammation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="iddateprogrammation")
	private long idDateProgrammation;
	
	@Column(name="datedebut")
	private Date dateDebut;
	
	@Column(name="datefin")
	private Date dateFin;
	
	
}
