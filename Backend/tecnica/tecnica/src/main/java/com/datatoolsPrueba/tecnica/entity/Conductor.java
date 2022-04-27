package com.datatoolsPrueba.tecnica.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DTOO_CONDUCTOR")
public class Conductor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "COND_ID")
    @GeneratedValue(generator="seqConductor") 
    @SequenceGenerator(name="seqConductor",sequenceName="SEQ_CONDUCTOR", allocationSize=1)
	private Long condId;
	
	private String condTipoDocumento;
	
	private String condDocumento;
	
	private String condNombreCompleto;
	
	private String condDireccion;
	
	private String condCiudad;
	
	private String condDepartamento;
	
	private String condPais;
	
	private String condTelefono;
	
	public Conductor() {}

	public Conductor(Long condId) {
		this.condId = condId;
	}

	public Conductor(Long condId, String condTipoDocumento, String condDocumento, String condNombreCompleto,
			String condDireccion, String condCiudad, String condDepartamento, String condPais, String condTelefono) {
		this.condId = condId;
		this.condTipoDocumento = condTipoDocumento;
		this.condDocumento = condDocumento;
		this.condNombreCompleto = condNombreCompleto;
		this.condDireccion = condDireccion;
		this.condCiudad = condCiudad;
		this.condDepartamento = condDepartamento;
		this.condPais = condPais;
		this.condTelefono = condTelefono;
	}

	public Long getCondId() {
		return condId;
	}

	public void setCondId(Long condId) {
		this.condId = condId;
	}

	public String getCondTipoDocumento() {
		return condTipoDocumento;
	}

	public void setCondTipoDocumento(String condTipoDocumento) {
		this.condTipoDocumento = condTipoDocumento;
	}

	public String getCondDocumento() {
		return condDocumento;
	}

	public void setCondDocumento(String condDocumento) {
		this.condDocumento = condDocumento;
	}

	public String getCondNombreCompleto() {
		return condNombreCompleto;
	}

	public void setCondNombreCompleto(String condNombreCompleto) {
		this.condNombreCompleto = condNombreCompleto;
	}

	public String getCondDireccion() {
		return condDireccion;
	}

	public void setCondDireccion(String condDireccion) {
		this.condDireccion = condDireccion;
	}

	public String getCondCiudad() {
		return condCiudad;
	}

	public void setCondCiudad(String condCiudad) {
		this.condCiudad = condCiudad;
	}

	public String getCondDepartamento() {
		return condDepartamento;
	}

	public void setCondDepartamento(String condDepartamento) {
		this.condDepartamento = condDepartamento;
	}

	public String getCondPais() {
		return condPais;
	}

	public void setCondPais(String condPais) {
		this.condPais = condPais;
	}

	public String getCondTelefono() {
		return condTelefono;
	}

	public void setCondTelefono(String condTelefono) {
		this.condTelefono = condTelefono;
	}

}
