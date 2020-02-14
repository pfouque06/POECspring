package org.eclipse.springtp07restapi.controller;

import java.util.List;

import org.eclipse.springtp07restapi.dao.AdresseRepository;
import org.eclipse.springtp07restapi.dao.PersonneRepository;
import org.eclipse.springtp07restapi.model.Adresse;
import org.eclipse.springtp07restapi.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class PersonneRestController {
	
	private static ObjectMapper mapper = new ObjectMapper();
	
	@Autowired
	private AdresseRepository adresseRepository;
	@Autowired
	private PersonneRepository personneRepository;

//	@GetMapping("/personnes")
//	public String getPersonnes(Model model) {
//		List<Personne> personnes = personneRepository.findAll();
//		model.addAttribute("personnes", personnes);
//		return "showPersonnes";
//	}

	@GetMapping("/personnes")
	@ResponseBody
	public String getPersonnes() throws JsonProcessingException {
		//return personneRepository.findAll().toString();
		List<Personne> personnes = personneRepository.findAll();
		personnes.forEach(System.out::println);
		//String jsonString = mapper.writeValueAsString(personnes);
		//return jsonString;
		return mapper.writeValueAsString(personnes);
	}

//	@GetMapping("/personnes/{id}")
//	public String getPersonne(@PathVariable("id") long id, Model model) {
//		Personne personne = personneRepository.findById(id).orElse(null);
//		model.addAttribute("personne", personne);
//		return "showPersonne";
//	}

	@GetMapping("/personnes/{id}")
	@ResponseBody
	public String getPersonne(@PathVariable("id") long id) throws JsonProcessingException {
		Personne personne = personneRepository.findById(id).orElse(null);
		System.out.println(personne);
		//return p.toString();
		//String jsonString = mapper.writeValueAsString(personne);
		//return jsonString;
		return mapper.writeValueAsString(personne);
	}

//	@PostMapping("/addPersonne")
//	public String addPersonne(Personne personne, Model model) {
//		Personne personne2 = personneRepository.save(personne);
//		model.addAttribute("personne", personne2);
//		return "showPersonne";
//	}

//	@PostMapping("/personnes")
//	@ResponseBody
//	public String addPersonne(@RequestBody Personne personne) {
//		System.out.println(personne);
//		//return personneRepository.save(personne).toString();
//		Personne p = personneRepository.save(personne);
//		System.out.println(p);
//		return p.toString();
//	}

	@PostMapping("/personnes")
	@ResponseBody
	public Personne addPersonne(@RequestBody Personne personne) {
		System.out.println(personne);
		List<Adresse> adresses = personne.getAdresses();
		//adresses.forEach(System.out::println);
		for (Adresse adresse : adresses) {
			Adresse adr = null;
			if (adresse.getNum() != null) {
				adr = adresseRepository.findById(adresse.getNum()).orElse(null);
				adresses.set(adresses.indexOf(adresse), adr);
			} else {
				adr = adresseRepository.save(adresse);
			}
		}
		System.out.println(personne);
		//adresses.forEach(System.out::println);
		return personneRepository.saveAndFlush(personne);
	}

	@PutMapping("/personnes/{id}")
	public Personne updatePersonne(@PathVariable("id") long id, @RequestBody Personne personne) {
		personne.setNum(id);
		// return personneRepository.save(personne);
		Personne p = personneRepository.save(personne);
		System.out.println(p);
		return p;
	}

	@DeleteMapping("/personnes/{id}")
	public void deletePersonne(@PathVariable("id") long id) {
		personneRepository.deleteById(id);
		return;
	}
}