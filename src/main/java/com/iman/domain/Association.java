package com.iman.domain;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "association")

public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idassociation")
    private long idAssociation;

    @Column(name="nomassociation")
    private String nomAssociation;

    @Column(name="descriptionassociation")
    private String descriptionAssociation;

}
