package br.com.fiap.checkpoint1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint1.model.Empregado;
import br.com.fiap.checkpoint1.services.EmpregadoService;

@RestController
@RequestMapping("/empregados")
public class EmpregadoController {

	@Autowired
	EmpregadoService empregadoService;
	
	@GetMapping
	public List<Empregado> get(){
		return empregadoService.get();
	}
	
	@PutMapping
	public Empregado put(Empregado empregado) {
		return empregadoService.put(empregado);
	}

	@PostMapping
	public Empregado post(Empregado empregado) {
		return empregadoService.post(empregado);
	}



}

