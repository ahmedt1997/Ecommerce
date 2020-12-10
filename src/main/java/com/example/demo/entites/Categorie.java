package com.example.demo.entites;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Categorie implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ; 
	private String nom ; 
	private String description ;
	@OneToMany(mappedBy = "categorie")
	private Collection<Produit> produits ;
	

}
