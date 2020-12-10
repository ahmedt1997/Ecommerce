package com.example.demo.entites;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategorieRepository2 extends JpaRepository<Categorie,Long> {

}
