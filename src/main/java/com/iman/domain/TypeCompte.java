package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@Table(name = "typecompte")
public class TypeCompte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idtypecompte")
    private long idTypeCompte;

    @Column(name="nomtypecompte")
    private String nomTypeCompte;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idTypeCompte")
    private Set<Compte> comptes = new HashSet<Compte>();



}