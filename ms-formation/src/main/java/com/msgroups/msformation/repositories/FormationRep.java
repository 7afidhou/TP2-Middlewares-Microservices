package com.msgroups.msformation.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.msgroups.msformation.entities.Formation;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface FormationRep extends JpaRepository<Formation,Long> {


}
