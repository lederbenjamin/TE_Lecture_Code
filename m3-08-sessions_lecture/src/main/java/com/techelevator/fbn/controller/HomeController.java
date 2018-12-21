package com.techelevator.fbn.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class HomeController {

	@RequestMapping("/")
	public String displayHomePage() {
		return "homePage";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String displayLogin() {
		return "login";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String displayLogin(ModelMap map, @RequestParam String username, @RequestParam String password) {
		map.addAttribute("username", username);
		return "redirect:/";
	}
	
	@RequestMapping(path="/logout", method=RequestMethod.GET)
	public String logout(ModelMap map, HttpSession session) {
		map.clear();
		session.invalidate();
		return "redirect:/";
	}
	
}

