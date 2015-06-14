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


@Controller
public class IndexController {

	//appelle aux services si cela est nécessaire
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
	
	//ensemble des mappings pour permettre la navigation aisée entre les pages
	@RequestMapping (value ={"cybepsi","index"})
	    public String index() {
		 	
	        return "index";
	}

	 @RequestMapping ("home")
		    public String home() {

		        return "home";
	}
	 
	 @RequestMapping ("contact")
	    public String contact() {

	        return "contact";
}
	 
	 @RequestMapping ("about")
	    public String about() {

	        return "about";
}
}


