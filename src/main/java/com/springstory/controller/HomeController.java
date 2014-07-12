package com.springstory.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springstory.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	@Qualifier("userServiceImpl2")
	private UserService userService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/hello2.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		String message = userService.getHelloMessage();
		
		logger.info("Welcome home! The client locale is {}.", locale);
	
		model.addAttribute("message", message );
		
		return "home";
	}
	
}
