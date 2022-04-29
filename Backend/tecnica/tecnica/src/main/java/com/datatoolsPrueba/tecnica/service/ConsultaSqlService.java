package com.datatoolsPrueba.tecnica.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datatoolsPrueba.tecnica.exception.BadRequestException;
import com.datatoolsPrueba.tecnica.repository.VehiculoRepository;
import com.datatoolsPrueba.tecnica.response.ConsultaSqlResponse;

@Service
public class ConsultaSqlService {

	@Autowired
	VehiculoRepository vehiculoRepository;
	
	public List<?> getSql() {
		List<?> sqlResponse = vehiculoRepository.findBySql();
		if(sqlResponse != null) {
			return sqlResponse;
		} else {
			throw new BadRequestException("No existe");
		}
	}
}
