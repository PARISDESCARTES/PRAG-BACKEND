package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "modepaiement")
public class ModePaiement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idmodepaiement")
    private long idModePaiement;


    @Column(name="nommodepaiement")
    private String nomModePaiement;



}