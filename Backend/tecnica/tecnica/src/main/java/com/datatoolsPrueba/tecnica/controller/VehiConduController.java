package com.datatoolsPrueba.tecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datatoolsPrueba.tecnica.entity.Conductor;
import com.datatoolsPrueba.tecnica.entity.VehiCondu;
import com.datatoolsPrueba.tecnica.entity.Vehiculo;
import com.datatoolsPrueba.tecnica.service.VehiConduService;

@RestController
@RequestMapping("/vehiCondu")
public class VehiConduController {

	@Autowired
	VehiConduService vehiConduService;
	
	@GetMapping(value = "/getConductor/{vehiculoId}")
	public List<Conductor> getConductor(@PathVariable Long vehiculoId) {
		return vehiConduService.getConductor(vehiculoId);
	}
	
	@GetMapping(value = "/getVehiculo/{conductorId}")
	public List<Vehiculo> getVehiculo(@PathVariable Long conductorId) {
		return vehiConduService.getVehiculo(conductorId);
	}
	
	@PostMapping(value = "/afiliar/{conductorId}/{vehiculoId}")
	public VehiCondu afiliar(@PathVariable Long conductorId, @PathVariable Long vehiculoId) {
		return vehiConduService.afiliar(conductorId, vehiculoId);
	}
	
	@DeleteMapping(value = "/desafiliar/{conductorId}/{vehiculoId}")
	public VehiCondu desafiliar(@PathVariable Long conductorId, @PathVariable Long vehiculoId) {
		return vehiConduService.desafiliar(conductorId, vehiculoId);
	}
}
