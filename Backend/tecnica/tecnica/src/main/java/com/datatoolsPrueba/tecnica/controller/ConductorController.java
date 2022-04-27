package com.datatoolsPrueba.tecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datatoolsPrueba.tecnica.entity.Conductor;
import com.datatoolsPrueba.tecnica.service.ConductorService;

@RestController
@RequestMapping("/conductor")
public class ConductorController {
	
	@Autowired
	ConductorService conductorService;
	
	@GetMapping(value = "/getAll")
	public List<Conductor> getAll() {
		return conductorService.getAll();
	}
	
	@PostMapping(value = "/insert")
	public Conductor saveConductor(@RequestBody Conductor var) {
		return conductorService.saveConductor(var);
	}

}
