package com.epsi.cybepsi.core.service;

import java.util.List;

import com.epsi.cybepsi.core.entite.Commande;

public interface CommandeService {
	
public void insertCommande(Commande commande);
	
	
	public List<Commande> getCommandesByClient(String emailClient);
}
