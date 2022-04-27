package com.datatoolsPrueba.tecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datatoolsPrueba.tecnica.entity.Empresa;
import com.datatoolsPrueba.tecnica.exception.BadRequestException;
import com.datatoolsPrueba.tecnica.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	EmpresaRepository empresaRepository;
	
	public List<Empresa> getAll() {
		List<Empresa> empresa = empresaRepository.findAll();
		if(empresa != null) {
			return empresa;
		} else {
			throw new BadRequestException("No existe");
		}
	}
	
	public Empresa saveEmpresa(Empresa empresa) {
		Empresa empr = new Empresa();
		if(empresa != null) {
			empr = empresaRepository.save(empresa);
		} else {
			throw new BadRequestException("No existe");
		}
		return empr;
	}
}
