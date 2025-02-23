package com.msgroups.msformation.proxy;


import com.msgroups.msformation.models.Etudiant;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@EnableFeignClients
@FeignClient(name = "ms-scolarite", url = "localhost:8080")
public interface EtudiantProxy {
    @GetMapping("/etudiants/search/findEtudiantsByIdFormation")
    //public List<Etudiant> getEtudiants(@RequestParam Long idf,@RequestParam String projection);
     CollectionModel<Etudiant> getEtudiants(@RequestParam("idFormation") Long idf, @RequestParam("projection") String projection);

}
