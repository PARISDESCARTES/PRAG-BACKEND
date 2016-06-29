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
	
	@Column(name="stylebloc")
	private String styleBloc;

	public long getIdBloc() {
		return idBloc;
	}

	public void setIdBloc(long idBloc) {
		this.idBloc = idBloc;
	}

	public String getDescriptionBloc() {
		return descriptionBloc;
	}

	public void setDescriptionBloc(String descriptionBloc) {
		this.descriptionBloc = descriptionBloc;
	}

	public String getPhotoBloc() {
		return photoBloc;
	}

	public void setPhotoBloc(String photoBloc) {
		this.photoBloc = photoBloc;
	}

	public boolean isActif() {
		return isActif;
	}

	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}

	public String getTitreBloc() {
		return titreBloc;
	}

	public void setTitreBloc(String titreBloc) {
		this.titreBloc = titreBloc;
	}

	public String getTypeBloc() {
		return typeBloc;
	}

	public void setTypeBloc(String typeBloc) {
		this.typeBloc = typeBloc;
	}

	public String getStyleBloc() {
		return styleBloc;
	}

	public void setStyleBloc(String styleBloc) {
		this.styleBloc = styleBloc;
	}
	
	
	
	
}
