package com.example.demo.entites;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.nio.file.Files;

import java.nio.file.Paths;

@RestController
public class Controleur {
    @Autowired
    private ProduitRepository produitRepository;

  /*  @GetMapping(value = "/ProductName/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getPhoto(@PathVariable("id") Long id) throws Exception{
        Produit p = produitRepository.findById(id).get();
       return  Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/Med Chlif/img/"+p.getPhoto()));
    }*/
}
