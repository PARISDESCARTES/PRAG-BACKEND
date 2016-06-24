package com.iman;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "responsablelegal")
public class responsableLegal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idresponsablelegal")
    private String idResponsableLegal;

    @Column(name="prenomresponsable")
    private String prenomResponsable;

    @Column(name="nomresponsable")
    private String nomResponsable;

    @Column(name="adresseresponsable")
    private String adresseResponsable;

    @Column(name="codepostalresponsable")
    private String codePostalResponsable;

    @Column(name="villeresponsable")
    private String villeResponsable;

    @Column(name="telephonefixeresponsable")
    private String telephoneFixeResponsable;

    @Column(name="telephoneportableresponsable")
    private String telephonePortableResponsable;

    @Column(name="emailresponsable")
    private String emailResponsable;

    @Column(name="sexeresponsable")
    private String sexeResponsable;

    @Column(name="idenfant")
    private long idEnfant;
}