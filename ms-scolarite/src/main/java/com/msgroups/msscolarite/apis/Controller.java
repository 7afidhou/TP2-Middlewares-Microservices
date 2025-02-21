package com.msgroups.msscolarite.apis;


import com.msgroups.msscolarite.entities.Etudiant;
import com.msgroups.msscolarite.models.Formation;
import com.msgroups.msscolarite.proxy.FormationProxy;
import com.msgroups.msscolarite.repositories.EtablissementRep;
import com.msgroups.msscolarite.repositories.EtudiantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    EtudiantRep etudiantRep;
    @Autowired
    EtablissementRep etablissementRep;

    @Autowired
    FormationProxy formationProxy;


    @GetMapping("/etudiant/{ide}")
    public Etudiant getEtudiantWithFormation(@PathVariable("ide") Long ide) {
        Etudiant e = etudiantRep.findById(ide).get();
        Formation f1 = formationProxy.getFormation(e.getIdFormation());
        e.setFormation(f1);
        return e;
    }



}
