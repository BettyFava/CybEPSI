package com.epsi.cybepsi.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.epsi.cybepsi.core.entite.SousCategorie;

public interface SousCategorieDao {

	
	public SousCategorie getSousCategorie(@Param("id") Integer id);
	
	public List<SousCategorie> getAllSousCategoriesByCategorie(@Param("idCat") Integer idCat);
	

}
