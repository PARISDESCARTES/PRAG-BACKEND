package com.iman;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "therapie")
public class Therapie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idtherapie")
    private long idTherapie;

    @Column(name="nomtherapie")
    private String nomTherapie;

    @Column(name="descriptiontherapie")
    private String descriptionTherapie;

    @Column(name="typologietherapie")
    private String typologieTherapie;

    @Column(name="fondateurtherapie")
    private String fondateurTherapie;

    @Column(name="objectiftherapie")
    private String objectifTherapie;

    @Column(name="methodetherapie")
    private String methodeTherapie;

    @Column(name="pathologieviseetherapie")
    private String pathologieViseeTherapie;

    @Column(name="infostherapie")
    private String infosTherapie;

}