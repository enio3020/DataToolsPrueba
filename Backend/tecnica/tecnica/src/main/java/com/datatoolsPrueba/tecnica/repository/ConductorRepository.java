package com.datatoolsPrueba.tecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.datatoolsPrueba.tecnica.entity.Conductor;

public interface ConductorRepository extends JpaRepository<Conductor, Long> {

	public Conductor findByCondId(Long var);
	
	@Query(value = "SELECT c.* "
			+ "    FROM dtoo_vehi_condu vc "
			+ "    INNER JOIN dtoo_conductor c ON vc.conductor_id = c.cond_id "
			+ "    WHERE vc.vehiculo_id = :var ", nativeQuery = true)
	public List<Conductor> findByVehiculo(@Param("var") Long var);
}
