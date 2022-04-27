package com.datatoolsPrueba.tecnica.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DTOO_VEHICULO")
public class Vehiculo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "VEHI_ID")
    @GeneratedValue(generator="seqVehiculo") 
    @SequenceGenerator(name="seqVehiculo",sequenceName="SEQ_VEHICULO", allocationSize=1)
	private Long vehiId;
	
	private String vehiPlaca;
	
	private String vehiMotor;
	
	private String vehiChasis;
	
	private String vehiModelo;
	
	private Date vehiFechaMatricula;
	
	private Integer vehiPasajeroSentados;
	
	private Integer vehiPasajeroPie;
	
	private Long vehiPesoSeco;
	
	private Long vehiPesoBruto;
	
	private Integer vehiCantidadPuertas;
	
	private String vehiMarca;
	
	private String vehiLinea;
	
	@JoinColumn(name = "EMPRESA_ID", referencedColumnName = "EMPR_ID")
    @ManyToOne(fetch = FetchType.LAZY)
	private Empresa empresaId;

	public Vehiculo() {
	}

	public Vehiculo(Long vehiId) {
		this.vehiId = vehiId;
	}

	public Vehiculo(Long vehiId, String vehiPlaca, String vehiMotor, String vehiChasis, String vehiModelo,
			Date vehiFechaMatricula, Integer vehiPasajeroSentados, Integer vehiPasajeroPie, Long vehiPesoSeco,
			Long vehiPesoBruto, Integer vehiCantidadPuertas, String vehiMarca, String vehiLinea, Empresa empresaId) {
		this.vehiId = vehiId;
		this.vehiPlaca = vehiPlaca;
		this.vehiMotor = vehiMotor;
		this.vehiChasis = vehiChasis;
		this.vehiModelo = vehiModelo;
		this.vehiFechaMatricula = vehiFechaMatricula;
		this.vehiPasajeroSentados = vehiPasajeroSentados;
		this.vehiPasajeroPie = vehiPasajeroPie;
		this.vehiPesoSeco = vehiPesoSeco;
		this.vehiPesoBruto = vehiPesoBruto;
		this.vehiCantidadPuertas = vehiCantidadPuertas;
		this.vehiMarca = vehiMarca;
		this.vehiLinea = vehiLinea;
		this.empresaId = empresaId;
	}

	public Empresa getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Empresa empresaId) {
		this.empresaId = empresaId;
	}

	public Long getVehiId() {
		return vehiId;
	}

	public void setVehiId(Long vehiId) {
		this.vehiId = vehiId;
	}

	public String getVehiPlaca() {
		return vehiPlaca;
	}

	public void setVehiPlaca(String vehiPlaca) {
		this.vehiPlaca = vehiPlaca;
	}

	public String getVehiMotor() {
		return vehiMotor;
	}

	public void setVehiMotor(String vehiMotor) {
		this.vehiMotor = vehiMotor;
	}

	public String getVehiChasis() {
		return vehiChasis;
	}

	public void setVehiChasis(String vehiChasis) {
		this.vehiChasis = vehiChasis;
	}

	public String getVehiModelo() {
		return vehiModelo;
	}

	public void setVehiModelo(String vehiModelo) {
		this.vehiModelo = vehiModelo;
	}

	public Date getVehiFechaMatricula() {
		return vehiFechaMatricula;
	}

	public void setVehiFechaMatricula(Date vehiFechaMatricula) {
		this.vehiFechaMatricula = vehiFechaMatricula;
	}

	public Integer getVehiPasajeroSentados() {
		return vehiPasajeroSentados;
	}

	public void setVehiPasajeroSentados(Integer vehiPasajeroSentados) {
		this.vehiPasajeroSentados = vehiPasajeroSentados;
	}

	public Integer getVehiPasajeroPie() {
		return vehiPasajeroPie;
	}

	public void setVehiPasajeroPie(Integer vehiPasajeroPie) {
		this.vehiPasajeroPie = vehiPasajeroPie;
	}

	public Long getVehiPesoSeco() {
		return vehiPesoSeco;
	}

	public void setVehiPesoSeco(Long vehiPesoSeco) {
		this.vehiPesoSeco = vehiPesoSeco;
	}

	public Long getVehiPesoBruto() {
		return vehiPesoBruto;
	}

	public void setVehiPesoBruto(Long vehiPesoBruto) {
		this.vehiPesoBruto = vehiPesoBruto;
	}

	public Integer getVehiCantidadPuertas() {
		return vehiCantidadPuertas;
	}

	public void setVehiCantidadPuertas(Integer vehiCantidadPuertas) {
		this.vehiCantidadPuertas = vehiCantidadPuertas;
	}

	public String getVehiMarca() {
		return vehiMarca;
	}

	public void setVehiMarca(String vehiMarca) {
		this.vehiMarca = vehiMarca;
	}

	public String getVehiLinea() {
		return vehiLinea;
	}

	public void setVehiLinea(String vehiLinea) {
		this.vehiLinea = vehiLinea;
	}
}
