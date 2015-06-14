package com.epsi.cybepsi.core.service;

import java.util.List;

import com.epsi.cybepsi.core.entite.Categorie;
import com.epsi.cybepsi.core.entite.SousCategorie;

public interface CategorieService {

	public List <Categorie> getAllCategorie();
	
	public List <SousCategorie> getAllSousCategorie(Integer idCategorie);
}
