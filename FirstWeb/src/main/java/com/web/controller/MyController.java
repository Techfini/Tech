package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.model.LoginData;


@Controller
public class MyController {

	@GetMapping("/form")
	public String openForm(Model m ) {
		m.addAttribute("loginData",new LoginData());
		
		return "form";
	}
	
@PostMapping("/submit")
public String processForm(@ModelAttribute ("loginData") LoginData loginData) {
	
	System.out.println(loginData);
	
return "success";	
}
	
}
