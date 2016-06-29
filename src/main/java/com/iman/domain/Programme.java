package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "programme")
public class Programme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idprogramme")
    private long idProgramme;


    @Column(name="descriptionprogramme")
    private String descriptionProgramme;

}
