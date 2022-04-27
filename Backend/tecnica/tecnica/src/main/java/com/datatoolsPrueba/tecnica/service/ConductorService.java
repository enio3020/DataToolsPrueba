package com.datatoolsPrueba.tecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datatoolsPrueba.tecnica.entity.Conductor;
import com.datatoolsPrueba.tecnica.exception.BadRequestException;
import com.datatoolsPrueba.tecnica.repository.ConductorRepository;

@Service
public class ConductorService {

	@Autowired
	ConductorRepository conductorRepository;
	
	public List<Conductor> getAll() {
		List<Conductor> conductor = conductorRepository.findAll();
		if(conductor != null) {
			return conductor;
		} else {
			throw new BadRequestException("No existe");
		}
	}
	
	public Conductor saveConductor(Conductor conductor) {
		Conductor condu = new Conductor();
		if(conductor != null) {
			condu = conductorRepository.save(conductor);
		} else {
			throw new BadRequestException("No existe");
		}
		return condu;
	}
}
