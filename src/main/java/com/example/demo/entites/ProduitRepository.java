package com.example.demo.entites;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit,Long> {

    /*

   http://localhost:8080/produits/search/selectedProduct
    */

    @RestResource(path = "/selectedProduct")
    public List<Produit> findBySelectedTrue();

    /*
  http://localhost:8080/produits/search/listProductPromotion
   */

    @RestResource(path = "/listProductPromotionTrue")
    public List<Produit> findByPromotionTrue();


    @RestResource(path = "/listProductValableFalse")
    public  List<Produit> findByPromotionFalse();


    /*
         http://localhost:8080/produits/search/listProductValable
     */

    @RestResource(path = "/listProductValable")
    public List<Produit> findByValableTrue();


    /*
    localhost:8080/produits/search/listProductByKeyWors?mc= [nom du mot chercher ]
     */

    @RestResource(path = "/listProductByKeyWors")
    public  List<Produit> findByNomContains(@Param("mc") String mc);


	


}
