package com.epsi.cybepsi.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.epsi.cybepsi.core.entite.Panier;
import com.epsi.cybepsi.core.entite.Produit;

public interface ProduitDao {
	public void insertProduit(@Param("produit") Produit produit);

	public Produit getProduitById(@Param("id") Integer id);
	
	public Produit getInformationsSuppProduit(@Param("id")Integer id);

	public List<Produit> getAllProduits();
	
	public List<Produit> getProduitsParSousCategories(@Param("idSousCat") Integer idSousCat);

	public List<Produit> getAllProduitsDansPanier(@Param("panier") Panier panier);
	}
