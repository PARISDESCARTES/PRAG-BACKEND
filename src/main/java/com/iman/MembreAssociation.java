package com.iman;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "membreassociation")
public class MembreAssociation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idmembreassociation")
    private long idMembreAssociation;


    @Column(name="rolemembreassociation")
    private String roleMembreAssociation;

    @Column(name="photomembreassociation")
    private String photoMembreAssociation;

    @Column(name="descriptionmembreassociation")
    private String descriptionMembreAssociation;

    @Column(name="idcompte")
    private long idCompte;
}