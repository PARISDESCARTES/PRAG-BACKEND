package com.iman;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "typecompte")
public class Typecompte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idtypecompte")
    private long idTypeCompte;

    @Column(name="nomtypecompte")
    private String nomTypeCompte;


}
