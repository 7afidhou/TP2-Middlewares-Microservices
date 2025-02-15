package com.msgroups.msscolarite.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etablissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtablissement;

    @Column(nullable = false)
    private String nom;


    @ToString.Exclude
    @OneToMany(mappedBy = "etablissement")
    private List<Etudiant> etudiantList;
}
