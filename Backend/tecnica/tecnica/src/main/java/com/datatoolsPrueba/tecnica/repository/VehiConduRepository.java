package com.datatoolsPrueba.tecnica.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.datatoolsPrueba.tecnica.entity.Conductor;
import com.datatoolsPrueba.tecnica.entity.VehiCondu;
import com.datatoolsPrueba.tecnica.entity.Vehiculo;

public interface VehiConduRepository extends JpaRepository<VehiCondu, Long> {
	
	public VehiCondu findByVehiculoIdAndConductorId(Vehiculo var, Conductor var2);
	
}
