package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "troubleenfant")
public class TroubleEnfant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idenfant")
    private long idEnfant;

    @Column(name="idtroubleMoteur")
    private long idTroubleMoteur;


}