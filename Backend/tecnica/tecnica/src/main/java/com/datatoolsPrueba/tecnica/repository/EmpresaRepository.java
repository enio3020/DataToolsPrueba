package com.datatoolsPrueba.tecnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datatoolsPrueba.tecnica.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	public Empresa findByEmprId(Long var);
}
