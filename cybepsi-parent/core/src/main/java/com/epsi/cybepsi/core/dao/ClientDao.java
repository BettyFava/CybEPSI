package com.epsi.cybepsi.core.dao;

import org.apache.ibatis.annotations.Param;

import com.epsi.cybepsi.core.entite.Client;

public interface ClientDao {
	
	public void insertClient(@Param("client") Client client);
	
	public Client getClientByEmail(@Param("emailClient") String emailClient);
	
}
