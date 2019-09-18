package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVesionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the parameter from the HTML form
		String name = request.getParameter("studentName");
		
		//convert the data to all caps
		name = name.toUpperCase();
		
		//create the message
		String message = "Yo! " + name;
		
		//add message to the model
		model.addAttribute("message", message);
		
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVesionThree")
	public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {
		
		//read the parameter from the HTML form
//		String name = request.getParameter("studentName");
		
		//convert the data to all caps
		name = name.toUpperCase();
		
		//create the message
		String message = "He My Friend from v3! " + name;
		
		//add message to the model
		model.addAttribute("message", message);
		
		
		return "helloworld";
	}
}
