package com.epsi.cybepsi.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsi.cybepsi.core.dao.ProduitDao;
import com.epsi.cybepsi.core.entite.Produit;


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

}