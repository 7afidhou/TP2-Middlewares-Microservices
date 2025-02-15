package com.msgroups.msbourse.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;


    @Column(unique = true, nullable = false)
    private Long ncompteccp;

    private Float salaireParent;

    private Boolean situationImpot;

    @ManyToOne
    @JoinColumn(name = "idVirement")
    @JsonIgnore
    private Virement virement;

}
