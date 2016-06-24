package com.iman;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "troublemoteur")
public class TroubleMoteur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idtroublemoteur")
    private long idTroubleMoteur;

    @Column(name="nomtroublemoteur")
    private String nomTroubleMoteur;

    @Column(name="descriptiontroublemoteur")
    private char descriptionTroubleMoteur;

}