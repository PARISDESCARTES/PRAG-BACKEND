package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "typepartenaire")
public class TypePartenaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idtypepartenaire")
    private long idTypePartenaire;

    @Column(name="typePartenaire")
    private String idEvent;


}