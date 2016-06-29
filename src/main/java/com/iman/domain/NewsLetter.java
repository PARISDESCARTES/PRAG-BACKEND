package com.iman.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "newsletter")
public class NewsLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idnewsletter")
    private long idNewsletter;


    @Column(name="emailnewsletter")
    private String emailNewsletter;



}