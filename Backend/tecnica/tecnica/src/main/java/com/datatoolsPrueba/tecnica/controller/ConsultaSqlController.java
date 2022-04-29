package com.datatoolsPrueba.tecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datatoolsPrueba.tecnica.response.ConsultaSqlResponse;
import com.datatoolsPrueba.tecnica.service.ConsultaSqlService;

@RestController
@RequestMapping("/consultaSql")
public class ConsultaSqlController {

	@Autowired
	ConsultaSqlService consultaSqlService;
	
	@GetMapping(value = "/getSql")
	public List<?> getSql(){
		return consultaSqlService.getSql();
	}
}
