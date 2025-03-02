package com.msgroups.mslibrary.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    private Long idEtudiant;
    private String nom;
    private String promo;
}
