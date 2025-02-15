package com.msgroups.msscolarite.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;


    @Column(nullable = false)
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

}
