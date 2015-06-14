package com.epsi.cybepsi.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsi.cybepsi.core.dao.CategorieDao;
import com.epsi.cybepsi.core.dao.SousCategorieDao;
import com.epsi.cybepsi.core.entite.Categorie;
import com.epsi.cybepsi.core.entite.SousCategorie;
import com.epsi.cybepsi.core.service.CategorieService;

@Service
public class CategorieServiceImpl implements CategorieService {

	@Autowired
	CategorieDao categorieDao;
	
	@Autowired
	SousCategorieDao sousCategorieDao;
	@Override
	public List<Categorie> getAllCategorie() {
		return categorieDao.getAllCategories();
	}

	@Override
	public List<SousCategorie> getAllSousCategorie(Integer idCategorie) {
		return sousCategorieDao.getAllSousCategoriesByCategorie(idCategorie);
	}


}
