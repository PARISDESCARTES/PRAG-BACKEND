package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "reflexearchaique")
public class ReflexeArchaique {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idreflexe")
    private long idReflexe;


    @Column(name="nomreflexe")
    private String nomReflexe;

}