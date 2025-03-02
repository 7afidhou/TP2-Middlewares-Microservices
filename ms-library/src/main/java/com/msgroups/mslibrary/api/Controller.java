package com.msgroups.mslibrary.api;


import com.msgroups.mslibrary.entities.Emprunt;
import com.msgroups.mslibrary.repositories.EmpruntRepository;
import com.msgroups.mslibrary.repositories.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private EmpruntRepository empruntRepository;
    @Autowired
    private LivreRepository livreRepository;

    @GetMapping("/emprunt/entre/{date1}/{date2}")
    public int nombreLivresEntreDeuxDates(@PathVariable String date1, @PathVariable String date2) {

    }

}
