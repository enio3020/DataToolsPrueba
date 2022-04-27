package com.datatoolsPrueba.tecnica.response;

public class ConsultaSqlResponse {

	private String placaVehiculo;
	
	private String tipoIdentificaonEmpresa;
	
	private String numeroIdentificacionEmpresa;
	
	private String nombreEmpresa;
	
	private Integer cantidadConduVincu;

	public ConsultaSqlResponse(String placaVehiculo, String tipoIdentificaonEmpresa, String numeroIdentificacionEmpresa,
			String nombreEmpresa, Integer cantidadConduVincu) {
		this.placaVehiculo = placaVehiculo;
		this.tipoIdentificaonEmpresa = tipoIdentificaonEmpresa;
		this.numeroIdentificacionEmpresa = numeroIdentificacionEmpresa;
		this.nombreEmpresa = nombreEmpresa;
		this.cantidadConduVincu = cantidadConduVincu;
	}

	public ConsultaSqlResponse() {
	}

	public String getPlacaVehiculo() {
		return placaVehiculo;
	}

	public void setPlacaVehiculo(String placaVehiculo) {
		this.placaVehiculo = placaVehiculo;
	}

	public String getTipoIdentificaonEmpresa() {
		return tipoIdentificaonEmpresa;
	}

	public void setTipoIdentificaonEmpresa(String tipoIdentificaonEmpresa) {
		this.tipoIdentificaonEmpresa = tipoIdentificaonEmpresa;
	}

	public String getNumeroIdentificacionEmpresa() {
		return numeroIdentificacionEmpresa;
	}

	public void setNumeroIdentificacionEmpresa(String numeroIdentificacionEmpresa) {
		this.numeroIdentificacionEmpresa = numeroIdentificacionEmpresa;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public Integer getCantidadConduVincu() {
		return cantidadConduVincu;
	}

	public void setCantidadConduVincu(Integer cantidadConduVincu) {
		this.cantidadConduVincu = cantidadConduVincu;
	}
}
