package com.epsi.cybepsi.core.service.impl;

import java.util.List;

import com.epsi.cybepsi.core.entite.Panier;
import com.epsi.cybepsi.core.entite.Produit;
import com.epsi.cybepsi.core.service.PanierService;
import org.springframework.stereotype.Service;
@Service
public class PanierServiceImpl implements PanierService{

	@Override
	public void creerPanier(String emailClient, String login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Panier getPanierById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> getAllProduits(Panier panier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertProduit(Produit produit, int quantite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProduit(Produit produit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProduit(int produitId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculatePrice(Panier idPanier) {
		// TODO Auto-generated method stub
		return 0;
	}

}
