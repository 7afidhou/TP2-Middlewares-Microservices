package com.msgroups.msbourse.repositories;

import com.msgroups.msbourse.entities.Virement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource

public interface VirementRep extends JpaRepository<Virement, Long> {
}
