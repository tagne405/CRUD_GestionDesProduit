package com.example.gestion_des_produits.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.*;
@Data
@Entity
@AllArgsConstructor @NoArgsConstructor
@Builder
@ToString
public class Produit {

    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String description;
    private int prix;
    private int quantite;


}
