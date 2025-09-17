package com.springmvc.formclass;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FormClass {
	 
	
	
	@RequestMapping("/form")
	public String form() {
		return "login_page";
	}
	
	@PostMapping("/login")
	public String handlerform(@ModelAttribute UserClass user, Model model) {
		 
		System.out.println(user);
		model.addAttribute("user",user);
		return "help";
	}

	      // First Method using form data print with Request param
//	@PostMapping("/login")
//	public String handlerform(@RequestParam() String email, 
//			@RequestParam String username,
//			@RequestParam String password,
//			 Model model
//			) 
//	{
//	      System.out.println("emial: "+ email);
//	      System.out.println("username: "+ username);
//	      System.out.println("password: "+ password);
//		    model.addAttribute("email", email);
//		    model.addAttribute("user", username);
//		    model.addAttribute("pass", password);
//
//		    
//		
//		return "help";
//	}
}
