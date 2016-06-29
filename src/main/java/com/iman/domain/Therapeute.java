package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "therapie")
public class Therapeute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idtherapeute")
    private long idTherapeute;

    @Column(name="adressetherapeute")
    private String adresseTherapeute;

    @Column(name="telephonetherapeute")
    private String telephoneTherapeute;

    @Column(name="idspecialite")
    private long idSpecialite;

    @Column(name="idcompte")
    private long idCompte;

}

