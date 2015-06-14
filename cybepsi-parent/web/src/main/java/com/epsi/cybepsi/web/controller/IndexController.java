package com.epsi.cybepsi.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.epsi.cybepsi.core.entite.Produit;
import com.epsi.cybepsi.core.entite.SousCategorie;
import com.epsi.cybepsi.core.service.CategorieService;
import com.epsi.cybepsi.core.service.ClientService;
import com.epsi.cybepsi.core.service.CommandeService;
import com.epsi.cybepsi.core.service.PanierService;
import com.epsi.cybepsi.core.service.ProduitService;

@RequestMapping ("cybepsi")
@Controller
public class IndexController {

	
	@Autowired
	ProduitService produitService;
	@Autowired
	CommandeService commandeService;
	@Autowired
	PanierService panierService;
	@Autowired
	CategorieService categorieService;
	@Autowired
	ClientService clientService;
	
	
	 @RequestMapping("/")
	    public String index() {
		 	List<Produit> produits = produitService.getAllProduits();
		 	Produit test=produitService.getProduitById(1);
		 	List<SousCategorie> testCat = categorieService.getAllSousCategorie(1); 
		 	
	        return "index";


	}
}


