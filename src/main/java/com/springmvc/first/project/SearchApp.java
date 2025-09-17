package com.springmvc.first.project;

import com.springmvc.formclass.FormClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchApp {

   
	
	@RequestMapping("/api")
	public RedirectView htmlPage() {
		RedirectView obj = new RedirectView("/home");
		return obj;
		
	}
	
	@RequestMapping("/home")
	public String home() {
		return "redirect:/search.html";
	}
       
	@RequestMapping(path="/save" , method = RequestMethod.POST)
	public RedirectView show(@RequestParam String query , Model model) {
		
		 if(query != null && !query.isEmpty()) {
			 System.out.println(query.isEmpty());
			 
			 
	    String url = "https://www.google.com/search?query=" + query;
	    	  RedirectView obj = new RedirectView();
	    	  obj.setUrl(url);
	          System.out.println("Searching for: " + query);
	    	  return obj;
	    	 
	      }
	      else {
	 		 model.addAttribute("header","page not founded");

	    	  RedirectView obj1 = new RedirectView();
               obj1.setUrl("/api");
               System.out.println("Query empty, redirecting to /api");
               return obj1;
	      }
	
     	}
	
}
