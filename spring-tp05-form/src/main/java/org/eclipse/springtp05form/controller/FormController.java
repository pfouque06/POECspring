package org.eclipse.springtp05form.controller;

import org.eclipse.springtp05form.dao.PersonneRepository;
import org.eclipse.springtp05form.model.Personne;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class FormController {

	private static final Logger logger = LoggerFactory.getLogger(FormController.class);

	@Autowired
	private PersonneRepository personneRepository;

	@GetMapping("/personne")
	public String personneForm(Model model) {
		model.addAttribute("personne", new Personne());
		return "personneForm";
	}

	@PostMapping("/personne")
	public String personneSubmit(@ModelAttribute("personne") Personne personne, Model model) {
		Personne p1 = personneRepository.save(personne);
		model.addAttribute("personne", p1);
		return "success";
	}
}
