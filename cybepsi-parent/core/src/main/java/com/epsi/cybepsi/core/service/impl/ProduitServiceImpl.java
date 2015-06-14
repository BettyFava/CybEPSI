package com.epsi.cybepsi.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsi.cybepsi.core.dao.ProduitDao;
import com.epsi.cybepsi.core.entite.Produit;
import com.epsi.cybepsi.core.service.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	ProduitDao produitDao;


	@Override
	public Produit getProduitById(Integer idProduit) {
		return produitDao.getProduitById(idProduit);
	}

	@Override
	public List<Produit> getAllProduits() {
		return produitDao.getAllProduits();
	}

	@Override
	public void insertProduit(Produit produit) {
		produitDao.insertProduit(produit);
		
	}

}