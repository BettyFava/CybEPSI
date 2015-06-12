package com.epsi.cybepsi.core.service;

import java.util.List;

import com.epsi.cybepsi.core.entite.Produit;


public interface ProduitService {
	

		public Produit getProduitById(Integer idProduit);

		public List<Produit> getAllProduits();

	}

