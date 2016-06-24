package com.iman;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "specialitetherapeute")
public class SpecialiteTherapeute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idspecialite")
    private long idSpecialite;

    @Column(name="nomspecialite")
    private String nomSpecialite;

    @Column(name="descriptionspecialite")
    private String descriptionSpecialite;

}

