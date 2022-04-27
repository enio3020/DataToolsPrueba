package com.datatoolsPrueba.tecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datatoolsPrueba.tecnica.exception.BadRequestException;
import com.datatoolsPrueba.tecnica.repository.VehiculoRepository;

@Service
public class ConsultaSqlService {

	@Autowired
	VehiculoRepository vehiculoRepository;
	
	public List<Object> getSql() {
		List<Object> sqlResponse = vehiculoRepository.findBySql();
		
		if(sqlResponse != null) {
			return sqlResponse;
		} else {
			throw new BadRequestException("No existe");
		}
	}
}
