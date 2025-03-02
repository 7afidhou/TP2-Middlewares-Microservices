package com.msgroups.mslibrary.repositories;


import com.msgroups.mslibrary.entities.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {

}
