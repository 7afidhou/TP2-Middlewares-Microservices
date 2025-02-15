package com.msgroups.msscolarite.repositories;

import com.msgroups.msscolarite.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface EtablissementRep extends JpaRepository<Etablissement, Long> {

}
