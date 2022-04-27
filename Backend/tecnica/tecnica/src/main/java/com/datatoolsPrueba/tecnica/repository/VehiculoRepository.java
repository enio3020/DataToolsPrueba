package com.datatoolsPrueba.tecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.datatoolsPrueba.tecnica.entity.Empresa;
import com.datatoolsPrueba.tecnica.entity.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

	public Vehiculo findByVehiId(Long var);
	
	public List<Vehiculo> findByEmpresaId(Empresa var);
	
	public Vehiculo findByVehiIdAndEmpresaId(Long var, Empresa var2);
	
	@Query(value = "SELECT v.* "
			+ "    FROM dtoo_vehi_condu vc "
			+ "    INNER JOIN dtoo_vehiculo v ON vc.vehiculo_id = v.vehi_id "
			+ "    WHERE vc.conductor_id = :var ", nativeQuery = true)
	public List<Vehiculo> findByConductor(@Param("var") Long var);
	
	@Query(value = "SELECT "
			+ "    * FROM (SELECT "
			+ "    v.vehi_placa AS placaVehiculo, "
			+ "    e.empr_tipo_documento AS tipoIdentificaonEmpresa, "
			+ "    e.empr_documento AS numeroIdentificacionEmpresa, "
			+ "    e.empr_nombre_completo AS nombreEmpresa, "
			+ "    (SELECT "
			+ "        COUNT(*) FROM dtoo_vehi_condu vc "
			+ "        WHERE vc.vehiculo_id = v.vehi_id) AS cantidadConduVincu "
			+ "    FROM dtoo_vehiculo v "
			+ "    INNER JOIN dtoo_empresa e ON v.empresa_id = e.empr_id "
			+ "    ORDER BY v.vehi_placa ) "
			+ "    WHERE cantidadConduVincu > 2 ", nativeQuery = true)
	public List<Object> findBySql();
}
