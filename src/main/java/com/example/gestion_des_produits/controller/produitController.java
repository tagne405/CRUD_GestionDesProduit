package com.example.gestion_des_produits.controller;

import com.example.gestion_des_produits.entite.Produit;
import com.example.gestion_des_produits.service.ProduitServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class produitController  {

    private ProduitServiceImpl produitService;

    public produitController(ProduitServiceImpl produitService) {
        this.produitService = produitService;
    }

    @GetMapping("/listeProduit")
    public List<Produit> listeProduit(){
        return produitService.listeProduit();
    }

    @PostMapping
    public Produit creationProduit(@RequestBody Produit produit){
        return produitService.creationProduit(produit);
    }

    @DeleteMapping("/suppression/{id}")
    public ResponseEntity<String> supprimerProduit(@PathVariable Long id) {
        boolean isDeleted = produitService.supprimerProduit(id);
        if (isDeleted) {
            return ResponseEntity.ok("Produit supprimé avec succès.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produit non trouvé.");
        }
    }


    @GetMapping("/{id}")
    public Produit rechercheProduitParId(@PathVariable Long id){
        return produitService.rechercheProduit(id);
    }
}
