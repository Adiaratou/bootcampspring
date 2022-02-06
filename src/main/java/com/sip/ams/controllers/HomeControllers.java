package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {

	@RequestMapping("/info")// ce que je tape dans l'url
	public String info() {
		
		System.out.println("Méthode info");
		return "Home/info";// nom de la vue sous le template (chemin)
	}
	
	@RequestMapping("/affichage")
	public String afficher() {
		
		return "Home/affichage";
	}
}
