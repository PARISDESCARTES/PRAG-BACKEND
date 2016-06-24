package com.iman;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "therapieprogramme")
public class TherapieProgramme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idtherapie")
    private long idTherapie;

    @Column(name="idprogramme")
    private long idProgramme;

}