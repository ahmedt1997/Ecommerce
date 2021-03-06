package com.example.demo.entites;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Produit implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ; 
	private String nom ; 
	private String description ;
	private double prix ; 
	private boolean promotion ; 
	private boolean selected ; 
	private boolean valable ;
	private String photo;
	@ManyToOne
	private Categorie categorie ; 
	

}
