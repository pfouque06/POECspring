package org.eclipse.springtp05form.controller;

import java.util.List;

import javax.validation.Valid;

import org.eclipse.springtp05form.dao.PersonneRepository;
import org.eclipse.springtp05form.model.Personne;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes("perso")
public class FormController {

	private static final Logger logger = LoggerFactory.getLogger(FormController.class);

	@Autowired
	private PersonneRepository personneRepository;

	@GetMapping("/connect")
	public String contactForm(Model model) {
		model.addAttribute("perso", new Personne());
		return "connectForm";
	}

	@PostMapping("/connect")
	public String checkData(
			@ModelAttribute("perso") Personne personne, BindingResult result, 
			Model model, WebRequest request) {
		List<Personne> personnes = personneRepository.findByNomAndPrenom(personne.getNom(), personne.getPrenom());
		if (personnes.size() > 0) {
			request.setAttribute("connected", true, WebRequest.SCOPE_SESSION);
			return "redirect:personne";
		}
		return "connectForm";
	}

	@GetMapping("/deconnect")
	public String leave(WebRequest request) {
		request.setAttribute("connected", false, WebRequest.SCOPE_SESSION);
		request.removeAttribute("perso", WebRequest.SCOPE_SESSION);
		return "redirect:connect";
	}

	@GetMapping("/personne")
	public String personneForm(Model model) {
		model.addAttribute("personne", new Personne());
		return "personneForm";
	}

	@PostMapping("/personne")
	public String personneSubmit(@ModelAttribute("personne") @Valid Personne personne, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return "personneForm";
		}
		Personne p1 = personneRepository.save(personne);
		model.addAttribute("personne", p1);
		return "success";
	}

}
