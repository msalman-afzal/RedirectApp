package com.springmvc.pathvariable.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePathVariableClass {
	 
	String book = "";
	int id ;
	int num;
   @RequestMapping("/book/{name}/{book}/{num}")
	public String book
	(@PathVariable String book,
			@PathVariable(value ="name") int id,
			@PathVariable int num
			) {
	   this.id = id;
	   this.book = book;
	   this.num = num;
		System.out.println("Book Name ::  " + book);
		System.out.println("Boot Id :: " + id);
		System.out.println("Book Number:: " + num);
		return book + id + num;
	}

}
