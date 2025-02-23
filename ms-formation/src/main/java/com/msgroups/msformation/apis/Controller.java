package com.msgroups.msformation.apis;

import com.msgroups.msformation.models.Etudiant;
import com.msgroups.msformation.proxy.EtudiantProxy;
import com.msgroups.msformation.repositories.FormationRep;
import com.msgroups.msformation.entities.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class Controller {

    @Autowired
    private FormationRep formationRep;
    @Autowired
    private EtudiantProxy etudiantProxy;

    @GetMapping("/formation/all")
    public List<Formation> getAllFormations() {
        return formationRep.findAll();
    }


//    @GetMapping("/formation/{id}")
//    public Formation getFormationById(@PathVariable("id") Long id) {
//        return formationRep.findById(id).get();
//    }

    @GetMapping("/formation/{id}")
    private Formation getFormationWithEtudiant(@PathVariable("id") Long id) {
       Formation f = formationRep.findById(id).get();
        f.setEtudiants(new ArrayList<>(
                etudiantProxy.getEtudiants(id,"projectiontoformation").getContent()
        ));

        return f;



        //        formation.setEtudiants(etudiantProxy.getEtudiants(id,"pr"));
        //        return formation;
    }

}
