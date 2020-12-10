package com.example.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entites.Categorie;
import com.example.demo.entites.CategorieRepository2;
import com.example.demo.entites.Produit;
import com.example.demo.entites.ProduitRepository;

import net.bytebuddy.utility.RandomString;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {
	@Autowired
	CategorieRepository2 categorieRepository ; 
	@Autowired
	ProduitRepository produitRepository;

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Random rnd = new Random();
		// TODO Auto-generated method stub
		categorieRepository.save(new Categorie(null,"ordinateur",null,null));
		categorieRepository.save(new Categorie(null,"smart phone",null,null));
		categorieRepository.save(new Categorie(null,"Television",null,null));
		categorieRepository.findAll().forEach(c->{
			for(int i=0;i<10;i++){
				Produit p = new Produit();
				p.setNom(RandomString.make(6));
				p.setDescription(RandomString.make(10));
				p.setPrix(100+rnd.nextInt(100000));
				p.setValable(rnd.nextBoolean());
				p.setSelected(rnd.nextBoolean());
				p.setPromotion(rnd.nextBoolean());
				p.setCategorie(c);
				produitRepository.save(p);
			}

			
		});
		
	}

}
