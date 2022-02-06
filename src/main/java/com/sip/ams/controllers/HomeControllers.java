package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllers {

	@RequestMapping("/info")// ce que je tape dans l'url
	
	public String info(Model model) {
		
		ArrayList <String> list = new ArrayList<String>();
		list.add("OCA");
		list.add("OCP");
		list.add("Spring");
		list.add("Angular");

		String formation="Fullstack";
		System.out.println("Méthode info");
		model.addAttribute("workshop",formation);
		model.addAttribute("work",list);
		
		return "Home/info";// nom de la vue sous le template (chemin)
	}
	
	@RequestMapping("/affichage")
	public String afficher() {
		System.out.println("Méthode affichage");
		return "Home/affichage";
	}
}
