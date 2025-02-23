package com.msgroups.msscolarite.entities;

import com.msgroups.msscolarite.models.Formation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;


    private String nom;

    @Column(nullable = false)
    private String promo;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @Temporal(TemporalType.DATE)
    private Date dateInscription;


    @ManyToOne
    @JoinColumn(name = "idEtablissement")
    @JsonIgnore
    private Etablissement etablissement;

    private Long idFormation;


    @Transient
    private Formation formation;

}