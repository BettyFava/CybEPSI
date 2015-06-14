package com.epsi.cybepsi.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.epsi.cybepsi.core.entite.Categorie;

public interface CategorieDao {

	public Categorie getCategorie(@Param("id") Integer id);
	
	public List<Categorie> getAllCategories();
}
