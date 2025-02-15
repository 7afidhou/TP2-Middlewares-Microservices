package com.msgroups.msbourse.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor


public class Virement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVirement;

    private  Float montant;

    @Temporal(TemporalType.DATE)
    private Date dateVirement;

    @ToString.Exclude
    @OneToMany(mappedBy = "virement")
    private List<Etudiant> etudiantList;




}
