package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "troubleenfant")
public class Traitement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idenfant")
    private long idEnfant;

    @Column(name="idmedicament")
    private long idMedicament;

    @Column(name="datedebuttraitement")
    private Date dateDebutTraitement;

    @Column(name="datefintraitement")
    private Date dateFinTraitement;


}