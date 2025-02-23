package com.msgroups.msformation.entities;

import com.msgroups.msformation.models.Etudiant;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormation;

    private String nom;
    private int duree;

    @Transient
    private Collection<Etudiant> etudiants;



}

