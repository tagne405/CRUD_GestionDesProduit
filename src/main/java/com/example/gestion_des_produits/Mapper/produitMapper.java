package com.example.gestion_des_produits;

import com.example.gestion_des_produits.dto.produitDTO;
import com.example.gestion_des_produits.entite.Produit;

public class produitMapper {
    public static Produit toEntity(produitDTO dto){
        return Produit.builder()
                .nom(dto.getNom())
                .prix(dto.getPrix())
                .description(dto.getDescription())
                .quantite(dto.getQuantite())
                .build();
    }

    public static produitDTO toDTO(Produit produit){
        produitDTO dto = new produitDTO();
        dto.setDescription(produit.getDescription());
        dto.setNom(produit.getNom());
        dto.setPrix(produit.getPrix());
        dto.setQuantite(produit.getQuantite());
        return dto;
    }
}
