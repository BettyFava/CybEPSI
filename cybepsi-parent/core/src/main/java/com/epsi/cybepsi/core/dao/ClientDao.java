package com.epsi.cybepsi.core.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.epsi.cybepsi.core.entite.Client;
@Service
public interface ClientDao {
	public Client getClient( @Param( "email" ) final String email );

    public Integer getIdClient( @Param( "email" ) final String email );
}
