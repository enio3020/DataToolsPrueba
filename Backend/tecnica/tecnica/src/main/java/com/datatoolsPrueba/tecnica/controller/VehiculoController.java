package com.datatoolsPrueba.tecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datatoolsPrueba.tecnica.entity.Empresa;
import com.datatoolsPrueba.tecnica.entity.Vehiculo;
import com.datatoolsPrueba.tecnica.service.VehiculoService;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {

	@Autowired
	VehiculoService vehiculoService;
	
	@GetMapping(value = "/getAll")
	public ResponseEntity<List<Vehiculo>> getAll() {
		return vehiculoService.getAll();
	}
	
	@GetMapping(value = "/getEmpresa/{empresaId}")
	public ResponseEntity<List<Vehiculo>> getEmpresa(@PathVariable Long empresaId) {
		return vehiculoService.getEmpresa(empresaId);
	}
	
	@PostMapping(value = "/insert")
	public ResponseEntity<Vehiculo> saveVehiculo(@RequestBody Vehiculo var) {
		return vehiculoService.saveVehiculo(var);
	}
	
	@PutMapping(value = "/afiliarEmpre/{empresaId}/{vehiculoId}")
	public ResponseEntity<Vehiculo> afiliarEmpresa(@PathVariable Long empresaId, @PathVariable Long vehiculoId) {
		return vehiculoService.afiliarEmpresa(empresaId, vehiculoId);
	}
	
	@PutMapping(value = "/desafiliarEmpre/{empresaId}/{vehiculoId}")
	public ResponseEntity<Vehiculo> desafiliarEmpresa(@PathVariable Long empresaId, @PathVariable Long vehiculoId) {
		return vehiculoService.desafiliarEmpresa(empresaId, vehiculoId);
	}
}
