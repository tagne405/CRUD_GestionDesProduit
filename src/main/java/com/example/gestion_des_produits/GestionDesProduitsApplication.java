package com.example.gestion_des_produits;

import com.example.gestion_des_produits.entite.Produit;
import com.example.gestion_des_produits.repository.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionDesProduitsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionDesProduitsApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProduitRepository produitRepository){
        return args -> {
            Produit produit = Produit.builder().nom("computer").prix(56).quantite(56)
                    .build();
            produitRepository.save(produit);
            produitRepository.save(
                    Produit.builder()
                            .nom("maison")
                            .description("la description d'une maison")
                            .prix(100)
                            .quantite(1)
                            .build()
            );
            produitRepository.save(
                    Produit.builder()
                            .nom("Chambre")
                            .description("Je suis la description d'une chambre")
                            .quantite(2)
                            .prix(5641)
                            .build()
            );
            produitRepository.findAll().forEach(produit1 -> {
                System.out.println(produit1.toString());
            });
        };
    }
}
