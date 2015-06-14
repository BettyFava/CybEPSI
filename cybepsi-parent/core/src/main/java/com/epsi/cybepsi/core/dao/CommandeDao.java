package com.epsi.cybepsi.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.epsi.cybepsi.core.entite.Commande;

public interface CommandeDao {
	public void insertCommande(Commande commande);
	
	public List<Commande> getCommandesByClient(@Param("emailClient") String emailClient);
	
	public Commande getCommande(@Param("id") Integer id);
}
