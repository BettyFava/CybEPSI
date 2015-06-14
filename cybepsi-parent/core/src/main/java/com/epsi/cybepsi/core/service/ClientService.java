package com.epsi.cybepsi.core.service;

import com.epsi.cybepsi.core.entite.Client;

public interface ClientService {
	
	public void insertClient(Client client);
	
	public Client getClientByEmail(String emailClient);
	
}
