package org.eclipse.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	// @GetMapping(value = "/hello")
	@RequestMapping("/hello")
	public String sayHello(@RequestParam(value = "nom", required = false, defaultValue = "World") String nom,
			Model model) {

		// String nom = "World";
		System.out.println("Hello " + nom + " !");
		model.addAttribute("nom", nom);

		return "hello";
	}

	//@RequestMapping("/hello")
	@GetMapping(value = "/yell/{nom}")
	public String yellHello(@PathVariable String nom, Model model) {

		// String nom = "World";
		System.out.println("Hello " + nom + " !");
		model.addAttribute("nom", nom);

		return "hello";
	}
}
