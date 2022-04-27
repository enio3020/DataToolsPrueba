package com.datatoolsPrueba.tecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datatoolsPrueba.tecnica.entity.Empresa;
import com.datatoolsPrueba.tecnica.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
	
	@Autowired
	EmpresaService empresaService;
	
	@GetMapping(value = "/getAll")
	public List<Empresa> getAll() {
		return empresaService.getAll();
	}
	
	@PostMapping(value = "/insert")
	public Empresa saveEmpresa(@RequestBody Empresa var) {
		return empresaService.saveEmpresa(var);
	}

}
