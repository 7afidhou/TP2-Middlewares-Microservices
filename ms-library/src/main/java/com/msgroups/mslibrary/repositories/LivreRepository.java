package com.msgroups.mslibrary.repositories;


import com.msgroups.mslibrary.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface LivreRepository extends JpaRepository<Livre, Long> {
  List<Livre> findByTitleContaining(String name);

}
