package com.example.gestion_des_produits.service;

import com.example.gestion_des_produits.entite.Produit;
import com.example.gestion_des_produits.repository.ProduitRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitServiceImpl implements ProduitService {

    private ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    public List<Produit> listeProduit() {
        return produitRepository.findAll();
    }

    @Override
    public Produit creationProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public boolean supprimerProduit(Long id) {
        Optional<Produit> produit = produitRepository.findById(id);
        if (produit.isPresent()) {
            produitRepository.delete(produit.get());
            return true; // Produit supprimé avec succès
        } else {
            return false; // Produit non trouvé
        }
    }


    @Override
    public Produit rechercheProduit(Long id) {
        return produitRepository.findById(id).get();
    }
}
