package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "programmation")
public class Programmation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idenfant")
    private long idEnfant;


    @Column(name="idprogramme")
    private long idProgramme;

    @Column(name="iddateprogrammation")
    private long idDateProgrammation;

}