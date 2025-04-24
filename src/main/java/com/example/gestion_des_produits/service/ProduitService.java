package com.example.gestion_des_produits.service;

import com.example.gestion_des_produits.entite.Produit;

import java.util.List;

public interface ProduitService {
    List<Produit> listeProduit();
    Produit creationProduit(Produit produit);
    boolean supprimerProduit(Long id);
    Produit rechercheProduit(Long id);
}
