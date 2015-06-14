package com.epsi.cybepsi.core.dao;

import org.apache.ibatis.annotations.Param;

import com.epsi.cybepsi.core.entite.Panier;

public interface PanierDao {
	
	public void creerPanier(@Param("emailClient") String emailClient);
	
	public Panier getPanier(@Param("panier") Panier panier);
	
	public void insertProduit(@Param("idProduit") Integer idproduit,@Param("idCommande") Integer idCommande, @Param("quantite")Integer quantite);
	
	public void removeProduit(@Param("idCommande") Integer idCommande,@Param("idProduit") Integer idProduit ); //ok

	public float calculerPrix(@Param("panier") Panier panier);
}
