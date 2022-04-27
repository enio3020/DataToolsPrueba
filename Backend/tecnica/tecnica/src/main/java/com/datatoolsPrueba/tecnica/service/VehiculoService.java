package com.datatoolsPrueba.tecnica.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.datatoolsPrueba.tecnica.entity.Empresa;
import com.datatoolsPrueba.tecnica.entity.Vehiculo;
import com.datatoolsPrueba.tecnica.exception.BadRequestException;
import com.datatoolsPrueba.tecnica.repository.ConductorRepository;
import com.datatoolsPrueba.tecnica.repository.EmpresaRepository;
import com.datatoolsPrueba.tecnica.repository.VehiculoRepository;

@Service
public class VehiculoService {

	@Autowired
	VehiculoRepository vehiculoRepositoty;
	
	@Autowired
	EmpresaRepository empresaRepository;
	
	@Autowired
	ConductorRepository conductorRepository;
	
	public ResponseEntity<List<Vehiculo>> getEmpresa(Long empresaId) {
		Empresa empresa = empresaRepository.findByEmprId(empresaId);
		List<Vehiculo> vehiculo = new ArrayList<Vehiculo>();
		if (empresa != null) {
			vehiculo = vehiculoRepositoty.findByEmpresaId(empresa);
			if (vehiculo != null) {
				return ResponseEntity.ok(vehiculo);
			} else {
				throw new BadRequestException("No hay registro");
			}
		} else {
			throw new BadRequestException("No existe");
		}
	}
	
	public ResponseEntity<List<Vehiculo>> getAll() {
		List<Vehiculo> vehiculo = vehiculoRepositoty.findAll();
		if(vehiculo != null) {
			return ResponseEntity.ok(vehiculo);
		} else {
			throw new BadRequestException("No existe");
		}
	}
	
	public ResponseEntity<Vehiculo> saveVehiculo(Vehiculo vehiculo) {
		Vehiculo vehi = new Vehiculo();
		if(vehiculo != null) {
			vehi = vehiculoRepositoty.save(vehiculo);
		} else {
			throw new BadRequestException("No existe");
		}
		return ResponseEntity.ok(vehi);
	}
	
	public ResponseEntity<Vehiculo> afiliarEmpresa(Long empresaId, Long vehiculoId) {
		Empresa empr = empresaRepository.findByEmprId(empresaId);
		Vehiculo vehi = vehiculoRepositoty.findByVehiId(vehiculoId);
		
		if(empr != null && vehi != null) {
			if(vehi.getEmpresaId() == null) {
				vehi.setEmpresaId(empr);
				vehi = vehiculoRepositoty.save(vehi);
			} else {
				throw new BadRequestException("Ya esta afiliado a una Empresa");
			}
		} else {
			throw new BadRequestException("No existe");
		}
		
		return ResponseEntity.ok(vehi);
	}
	
	public ResponseEntity<Vehiculo> desafiliarEmpresa(Long empresaId, Long vehiculoId) {
		Empresa empr = empresaRepository.findByEmprId(empresaId);
		Vehiculo vehi = new Vehiculo();
		
		if(empr != null) {
			vehi = vehiculoRepositoty.findByVehiIdAndEmpresaId(vehiculoId, empr);
			
			if(vehi != null) {
				vehi.setEmpresaId(null);
				vehi = vehiculoRepositoty.save(vehi);
			} else {
				throw new BadRequestException("No existe la afiliacion");
			}
		} else {
			throw new BadRequestException("No existe la Empresa");
		}
		
		return ResponseEntity.ok(vehi);
	}
}
