package com.example.gestion_des_produits.repository;

import com.example.gestion_des_produits.entite.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
