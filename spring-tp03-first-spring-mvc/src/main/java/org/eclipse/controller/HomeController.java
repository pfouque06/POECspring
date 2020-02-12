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
import org.springframework.web.servlet.ModelAndView;

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
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contact(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "contact";
	}
	
//	@RequestMapping(value = "/hello", method = RequestMethod.GET)
//	@GetMapping(value = "/hello")
//	public void sayHello(@RequestParam(value = "nom", required = false, defaultValue = "World") String s) {
//		System.out.println("Hello " + s + "!");
//	}

//	@GetMapping(value = "/hello/{nom}")
//	public void sayHello(@PathVariable String nom) {
//		System.out.println("Hello " + nom + "!");
//	}
	
	@GetMapping(value = "/hello")
	public String sayHello(Model model) {
		
		model.addAttribute("nom", "Wick" );
		model.addAttribute("prenom", "John" );
		return "hello";
	}

	@GetMapping(value = "/hello")
	public ModelAndView sayHello(ModelAndView mv) {
		
		mv.setViewName("hello");
		mv.addObject("nom", "Wick" );
		mv.addObject("prenom", "John" );
		return mv;
	}
	
}
