package com.epsi.cybepsi.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.epsi.cybepsi.core.dao.CommandeDao;
import com.epsi.cybepsi.core.entite.Commande;
import com.epsi.cybepsi.core.service.CommandeService;
import org.springframework.stereotype.Service;
@Service
public class CommandeServiceImp implements CommandeService {

	@Autowired
	CommandeDao commandeDao;
	
	@Override
	public void insertCommande(Commande commande) {
		commandeDao.insertCommande(commande);
	}

	@Override
	public List<Commande> getCommandesByClient(String emailClient) {
		return commandeDao.getCommandesByClient(emailClient);
	}


}
