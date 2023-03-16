package br.com.fiap.checkpoint1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.model.Empregado;
import br.com.fiap.checkpoint1.repository.EmpregadoRepository;

@Service
public class EmpregadoService {

	@Autowired
	EmpregadoRepository empregadoRepository;
	
	public List<Empregado> get(){
		return empregadoRepository.findAll();
	}
	
	public Empregado put(Empregado empregado) {
		return empregadoRepository.save(empregado);
	}
	
	public Empregado post(Empregado empregado) {
		return empregadoRepository.save(empregado);
 
	}
}
