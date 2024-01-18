package br.com.alura.screenmatch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.repository.SerieRepository;

@RestController
public class SerieController {
	
	@Autowired
	private SerieRepository repositorio;

	@GetMapping("/series")
	public List<Serie> obterSeries() {
		return repositorio.findAll();
	}
}
