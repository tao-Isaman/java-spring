package com.cpe.backend.repository;



import com.cpe.backend.entity.TypeMenu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;  
  
@RepositoryRestResource
public interface TypeMenuRepository extends JpaRepository<TypeMenu, Long> {

    TypeMenu findById(long id);
}