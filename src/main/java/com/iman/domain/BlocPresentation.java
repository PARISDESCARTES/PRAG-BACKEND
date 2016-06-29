package com.iman.domain;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "blocpresentation")

public class BlocPresentation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idbloc")
	private long idBloc;
	
	@Column(name="descriptionbloc")
	private String descriptionBloc;
	
	@Column(name="photobloc")
	private String photoBloc;

	@Column(name="isactif")
	private boolean isActif;
	
	@Column(name="titrebloc")
	private String titreBloc;
	
	@Column(name="typebloc")
	private String typeBloc;
	
	
}
