package com.epsi.cybepsi.core.service;

import java.util.List;

import com.epsi.cybepsi.core.entite.Panier;
import com.epsi.cybepsi.core.entite.Produit;

public interface PanierService {
	public void creerPanier(String emailClient, String login);
	
	public Panier getPanierById(Integer id);
	
	public List<Produit> getAllProduits(Panier panier);
	
	public void insertProduit(Produit produit,int quantite);
	
	public void removeProduit(Produit produit);
	
	public void removeProduit(int produitId);

	public float calculatePrice(Panier idPanier);
}
