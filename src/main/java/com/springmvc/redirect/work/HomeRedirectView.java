package com.springmvc.redirect.work;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeRedirectView {
	
	
	@RequestMapping("/one")
	public String one() {
		System.out.println("first home page wiht redirect method calling ");
		return "redirect:/page";
	}
   
	@RequestMapping("/page")
	public String two() {
		System.out.println("scoend  page wiht redirect method calling ");
		return "login_page";
	}
	
	@RequestMapping(path = "fire")
	public RedirectView open () {
		 RedirectView obj = new RedirectView();
		 obj.setUrl("https://www.google.com");
		 System.out.println(obj.getUrl());
		 return obj;
	}
}
