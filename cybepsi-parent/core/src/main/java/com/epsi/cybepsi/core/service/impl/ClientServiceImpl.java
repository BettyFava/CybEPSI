package com.epsi.cybepsi.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsi.cybepsi.core.dao.ClientDao;
import com.epsi.cybepsi.core.entite.Client;
import com.epsi.cybepsi.core.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientDao clientDao;
	
	@Override
	public void insertClient(Client client) {
		clientDao.insertClient(client);
	}
	
	@Override
	public Client getClientByEmail(String emailClient) {
		return clientDao.getClientByEmail(emailClient);
	}

}
