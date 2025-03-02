package com.msgroups.mslibrary.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivre;
    private String title;
    private String author;
    private String disponible;

    @ToString.Exclude
    @OneToMany(mappedBy = "livre")
    private List<Emprunt> empruntList;
}
