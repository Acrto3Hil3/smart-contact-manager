package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class PageController {

	// home page redirection
	@RequestMapping(value = {"/","/home"})
	public String homePage() {
		return "home";
	}
	// about page redirection
	@RequestMapping("/about")
	public String aboutPage(Model model) {
		model.addAttribute("isLogin", true);
		return "about";
	}
	// services page redirection
	@RequestMapping("/services")
	public String servicesPage() {
		return "services";
	}
	
	// about page redirection
	@GetMapping("/contact")
	public String contactPage(){
		return "contact";
	}
	// login page redirection
	@GetMapping("/login")
	public String loginPage(){
		return "login";
	}
	// about page redirection
	@GetMapping("/signUp")
	public String signUpPage(){
		return "register";
	}
}
