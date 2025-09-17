package com.springmvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeClass {

    private final SpringMvcProjectApplication springMvcProjectApplication;

    HomeClass(SpringMvcProjectApplication springMvcProjectApplication) {
        this.springMvcProjectApplication = springMvcProjectApplication;
    }

    @GetMapping("/file")
    public String hello(Model model) {
    	String name = "my name is salman afzal ";

    	model.addAttribute("name",name);
        System.out.println("hellow world ");
        List<String> list = new ArrayList<>();
        
          list.add("salman");
          list.add("zubair");
          list.add("sehar");
          list.add("mutlib");
          model.addAttribute("list", list);
       
        return "index";  
        
        
    }
    
    @RequestMapping("/help")
    public ModelAndView help() {
    	 ModelAndView obj = new ModelAndView();
    	 obj.addObject("salman", ": i have testing the model view controller");
    	 obj.setViewName("help");
    	 List<String > name = new ArrayList<>();
    	 name.add("jutt");
    	 name.add("Arain");
    	 name.add("gujjar");
    	 obj.addObject("list", name);
    	 System.out.println(obj.getView());
    	return obj;
    }
}
