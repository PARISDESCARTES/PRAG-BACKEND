package com.iman;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "typecompte")
public class TypeCompte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idenfant")
    private long idEnfant;

    @Column(name="datenaissanceenfant")
    private Date dateNaissanceEnfant;

    @Column(name="sexeenfant")
    private char sexeEnfant;

    @Column(name="diagnosticenfant")
    private String diagnosticEnfant;

    @Column(name="descriptionenfant")
    private String descriptionEnfant;

    @Column(name="idcompte")
    private long idCompte;

}