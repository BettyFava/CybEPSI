package com.epsi.cybepsi.core.dao;

import java.util.List;

import com.epsi.cybepsi.core.entite.Produit;

public interface ProduitDao {

		public Produit getProduitById(Integer id);
		
		public Produit getInformationsSuppProduit(Integer id);

		public List<Produit> getAllProduits();
		
		public List<Produit> getProduitsParCategories();

	}
