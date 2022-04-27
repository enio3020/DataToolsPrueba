package com.datatoolsPrueba.tecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datatoolsPrueba.tecnica.entity.Conductor;
import com.datatoolsPrueba.tecnica.entity.VehiCondu;
import com.datatoolsPrueba.tecnica.entity.Vehiculo;
import com.datatoolsPrueba.tecnica.exception.BadRequestException;
import com.datatoolsPrueba.tecnica.repository.ConductorRepository;
import com.datatoolsPrueba.tecnica.repository.VehiConduRepository;
import com.datatoolsPrueba.tecnica.repository.VehiculoRepository;

@Service
public class VehiConduService {
	
	@Autowired
	VehiConduRepository vehiConduRepository;
	
	@Autowired
	ConductorRepository conductorRepository;
	
	@Autowired
	VehiculoRepository vehiculoRepository;
	
	public List<Vehiculo> getVehiculo(Long conductorId) {
		List<Vehiculo> vehiculo = vehiculoRepository.findByConductor(conductorId);
		if(vehiculo != null) {
			return vehiculo;
		} else {
			throw new BadRequestException("No hay registro");
		}
	}
	
	public List<Conductor> getConductor(Long vehiculoId) {
		List<Conductor> conductor = conductorRepository.findByVehiculo(vehiculoId);
		if(conductor != null) {
			return conductor;
		} else {
			throw new BadRequestException("No hay registro");
		}
	}
	
	public VehiCondu afiliar(Long conductorId, Long vehiculoId) {
		Conductor conductor = conductorRepository.findByCondId(conductorId);
		Vehiculo vehiculo = vehiculoRepository.findByVehiId(vehiculoId);
		VehiCondu vhCdu = new VehiCondu();
		if (conductor != null && vehiculo != null) {
			if(vehiConduRepository.findByVehiculoIdAndConductorId(vehiculo, conductor) == null) {
				vhCdu.setConductorId(conductor);
				vhCdu.setVehiculoId(vehiculo);
				vhCdu = vehiConduRepository.save(vhCdu);
			} else {
				throw new BadRequestException("Ya existe el registro");
			}
		} else {
			throw new BadRequestException("No exite");
		}
		return vhCdu;
	}
	
	public VehiCondu desafiliar(Long conductorId, Long vehiculoId) {
		Conductor conductor = conductorRepository.findByCondId(conductorId);
		Vehiculo vehiculo = vehiculoRepository.findByVehiId(vehiculoId);
		VehiCondu vhCdu = new VehiCondu();
		
		if (conductor != null && vehiculo != null) {
			vhCdu = vehiConduRepository.findByVehiculoIdAndConductorId(vehiculo, conductor);
			if(vhCdu != null) {
				vehiConduRepository.delete(vhCdu);
			} else {
				throw new BadRequestException("No existe el registro");
			}
		} else {
			throw new BadRequestException("No exite");
		}
		return vhCdu;
	}
}
