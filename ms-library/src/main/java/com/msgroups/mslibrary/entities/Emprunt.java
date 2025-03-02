package com.msgroups.mslibrary.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmprunt;

    @Temporal(TemporalType.DATE)
    private Date dateEmprunt;

    @Temporal(TemporalType.DATE)
    private Date dateRetour;

    @ManyToOne
    @JoinColumn(name = "idLivre")
    @JsonIgnore
    private Livre livre;


}
