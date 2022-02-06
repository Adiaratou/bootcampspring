package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {

	@RequestMapping("/info")// ce que je tape dans l'url
	
	public String info(Model model) {
		String formation="Fullstack";
		System.out.println("Méthode info");
		model.addAttribute("workshop",formation);
		
		return "Home/info";// nom de la vue sous le template (chemin)
	}
	
	@RequestMapping("/affichage")
	public String afficher() {
		System.out.println("Méthode affichage");
		return "Home/affichage";
	}
}
