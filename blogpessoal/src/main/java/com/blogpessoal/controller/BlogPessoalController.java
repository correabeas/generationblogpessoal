package com.blogpessoal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/blogpessoal")
public class BlogPessoalController {

	@GetMapping
	public String blogpessoal() {
		return "Blog Pessoal";
	}
	
}
