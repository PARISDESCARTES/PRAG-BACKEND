package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "mecene")
public class Mecene {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idmecene")
    private long idMecene;

    @Column(name="adressemecene")
    private String adresseMecene;

    @Column(name="siretmecene")
    private String siretMecene;

    @Column(name="nommecene")
    private String nomMecene;

    @Column(name="codepostalmecene")
    private String codePostalMecene;

    @Column(name="villemecene")
    private String villeMecene;

    @Column(name="paysmecene")
    private String paysMecene;

    @Column(name="telephoneaccueil")
    private String telephoneAccueil;

    @Column(name="idcompte")
    private long idCompte;

    @Column(name="idformejuridique")
    private long idFormeJuridique;

    @Column(name="idtypepartenaire")
    private long idTypePartenaire;

}