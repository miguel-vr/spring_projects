package com.generation.exercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/exercicio1")
public class exercicio1Controller {
			
	
		@GetMapping
		public String helloworld () {
			return "Olá mundo!";
		}
		
		@GetMapping ("/bsm")
		public String bsm () {
			return "\n- Orientação ao futuro Responsabilidade Pessoal" + 
				   "\n- Mentalidade de Crescimento " + 
				   "\n- Persistência " + 
				   "\n- Trabalho em equipe " +
				   "\n- Atenção aos detalhes " + 
				   "\n- Proatividade " +
				   "\n- Comunicação";
		}
		
	
	
		@GetMapping("/objetivos")
		public String objetivodassemana(){
			return "Meu objetivo é focar no trabalho em equipe e na comunicação com meu grupo";
					
		}
		
		
	
	
	
	
	
}
