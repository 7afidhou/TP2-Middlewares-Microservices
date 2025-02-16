package com.msgroups.msscolarite.apis;


import com.msgroups.msscolarite.entities.Etudiant;
import com.msgroups.msscolarite.proxy.FormationProxy;
import com.msgroups.msscolarite.repositories.EtablissementRep;
import com.msgroups.msscolarite.repositories.EtudiantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestResource
@RequestMapping("/api")
public class Controller {
 @Autowired
    EtudiantRep etudiantRep;
 @Autowired
    EtablissementRep etablissementRep;
 @Autowired
    FormationProxy formationProxy;


    @GetMapping("/etudiant/{id}")
    public Etudiant getFormationById(@PathVariable("id") Long id) {
        return etudiantRep.findById(id).get();
    }



}
