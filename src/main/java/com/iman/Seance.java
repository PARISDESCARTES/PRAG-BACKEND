package com.iman;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "seance")
public class Seance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idevent")
    private long idEvent;

    @Column(name="idexercice")
    private long idExercice;
}