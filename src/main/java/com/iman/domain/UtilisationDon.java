package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "utilisationdon")
public class UtilisationDon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="iddon")
    private long idDon;

    @Column(name="idevent")
    private long idEvent;

    @Column(name="sommedonutilisee")
    private int sommeDonUtilisee;

    @Column(name="descriptiondon")
    private String descriptionDon;

}