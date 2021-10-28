package com.segundaaplicacao.aplicacao2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/aplicacao2")

public class aplicacao2Controller {
	@GetMapping
	public String aplicacao1() {
		return"Meu Objetivo de aprendizagem: Aprender spring boot ";
	}

}
