package com.inferyx.crud_sql_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class UserController {
	
	@GetMapping
	public String showHomePage(Model model) {
		return "home";
	}
}
