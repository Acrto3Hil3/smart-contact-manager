package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class PageController {

	// home page redirection
	@RequestMapping("/")
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
}
