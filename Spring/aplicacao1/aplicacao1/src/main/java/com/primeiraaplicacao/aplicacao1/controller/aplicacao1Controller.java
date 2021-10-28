package com.primeiraaplicacao.aplicacao1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/aplicacao1")

public class aplicacao1Controller {
	@GetMapping
	public String aplicacao1() {
		return "Habilidades e mentalidades: Persistência,Comprometimento,Comunicação e Mentalidade de crescimento.";
	}

}
