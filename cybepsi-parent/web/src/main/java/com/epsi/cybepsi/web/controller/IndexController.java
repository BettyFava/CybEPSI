package com.epsi.cybepsi.web.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.epsi.cybepsi.core.dao.ProduitDao;
import com.epsi.cybepsi.core.entite.Produit;
import com.epsi.cybepsi.core.service.ProduitService;

@Controller
public class IndexController {

	
	@Autowired
	ProduitDao produitDao;
	
	
	 @RequestMapping("/")
	    public String index() {
		 	List<Produit> produits = produitDao.getAllProduits();
		 	Produit test=produitDao.getProduitById(1);
		 	
	        return "index";


	}
}


