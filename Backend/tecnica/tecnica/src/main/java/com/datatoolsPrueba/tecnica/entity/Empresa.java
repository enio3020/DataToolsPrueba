package com.datatoolsPrueba.tecnica.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DTOO_EMPRESA")
public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "EMPR_ID")
    @GeneratedValue(generator="seqEmpresa") 
    @SequenceGenerator(name="seqEmpresa",sequenceName="SEQ_EMPRESA", allocationSize=1)
	private Long emprId;
	
	private String emprTipoDocumento;
	
	private String emprDocumento;
	
	private String emprNombreCompleto;
	
	private String emprDireccion;
	
	private String emprCiudad;
	
	private String emprDepartamento;
	
	private String emprPais;
	
	private String emprTelefono;
	
	private String emprLegalTipoDocumento;
	
	private String emprLegalDocumento;
	
	private String emprLegalNombreCompleto;
	
	private String emprLegalDireccion;
	
	private String emprLegalCiudad;
	
	private String emprLegalDepartamento;
	
	private String emprLegalPais;
	
	private String emprLegalTelefono;

	public Empresa() {
	}

	public Empresa(Long emprId) {
		this.emprId = emprId;
	}

	public Empresa(Long emprId, String emprTipoDocumento, String emprDocumento, String emprNombreCompleto,
			String emprDireccion, String emprCiudad, String emprDepartamento, String emprPais, String emprTelefono,
			String emprLegalTipoDocumento, String emprLegalDocumento, String emprLegalNombreCompleto,
			String emprLegalDireccion, String emprLegalCiudad, String emprLegalDepartamento, String emprLegalPais,
			String emprLegalTelefono) {
		this.emprId = emprId;
		this.emprTipoDocumento = emprTipoDocumento;
		this.emprDocumento = emprDocumento;
		this.emprNombreCompleto = emprNombreCompleto;
		this.emprDireccion = emprDireccion;
		this.emprCiudad = emprCiudad;
		this.emprDepartamento = emprDepartamento;
		this.emprPais = emprPais;
		this.emprTelefono = emprTelefono;
		this.emprLegalTipoDocumento = emprLegalTipoDocumento;
		this.emprLegalDocumento = emprLegalDocumento;
		this.emprLegalNombreCompleto = emprLegalNombreCompleto;
		this.emprLegalDireccion = emprLegalDireccion;
		this.emprLegalCiudad = emprLegalCiudad;
		this.emprLegalDepartamento = emprLegalDepartamento;
		this.emprLegalPais = emprLegalPais;
		this.emprLegalTelefono = emprLegalTelefono;
	}

	public Long getEmprId() {
		return emprId;
	}

	public void setEmprId(Long emprId) {
		this.emprId = emprId;
	}

	public String getEmprTipoDocumento() {
		return emprTipoDocumento;
	}

	public void setEmprTipoDocumento(String emprTipoDocumento) {
		this.emprTipoDocumento = emprTipoDocumento;
	}

	public String getEmprDocumento() {
		return emprDocumento;
	}

	public void setEmprDocumento(String emprDocumento) {
		this.emprDocumento = emprDocumento;
	}

	public String getEmprNombreCompleto() {
		return emprNombreCompleto;
	}

	public void setEmprNombreCompleto(String emprNombreCompleto) {
		this.emprNombreCompleto = emprNombreCompleto;
	}

	public String getEmprDireccion() {
		return emprDireccion;
	}

	public void setEmprDireccion(String emprDireccion) {
		this.emprDireccion = emprDireccion;
	}

	public String getEmprCiudad() {
		return emprCiudad;
	}

	public void setEmprCiudad(String emprCiudad) {
		this.emprCiudad = emprCiudad;
	}

	public String getEmprDepartamento() {
		return emprDepartamento;
	}

	public void setEmprDepartamento(String emprDepartamento) {
		this.emprDepartamento = emprDepartamento;
	}

	public String getEmprPais() {
		return emprPais;
	}

	public void setEmprPais(String emprPais) {
		this.emprPais = emprPais;
	}

	public String getEmprTelefono() {
		return emprTelefono;
	}

	public void setEmprTelefono(String emprTelefono) {
		this.emprTelefono = emprTelefono;
	}

	public String getEmprLegalTipoDocumento() {
		return emprLegalTipoDocumento;
	}

	public void setEmprLegalTipoDocumento(String emprLegalTipoDocumento) {
		this.emprLegalTipoDocumento = emprLegalTipoDocumento;
	}

	public String getEmprLegalDocumento() {
		return emprLegalDocumento;
	}

	public void setEmprLegalDocumento(String emprLegalDocumento) {
		this.emprLegalDocumento = emprLegalDocumento;
	}

	public String getEmprLegalNombreCompleto() {
		return emprLegalNombreCompleto;
	}

	public void setEmprLegalNombreCompleto(String emprLegalNombreCompleto) {
		this.emprLegalNombreCompleto = emprLegalNombreCompleto;
	}

	public String getEmprLegalDireccion() {
		return emprLegalDireccion;
	}

	public void setEmprLegalDireccion(String emprLegalDireccion) {
		this.emprLegalDireccion = emprLegalDireccion;
	}

	public String getEmprLegalCiudad() {
		return emprLegalCiudad;
	}

	public void setEmprLegalCiudad(String emprLegalCiudad) {
		this.emprLegalCiudad = emprLegalCiudad;
	}

	public String getEmprLegalDepartamento() {
		return emprLegalDepartamento;
	}

	public void setEmprLegalDepartamento(String emprLegalDepartamento) {
		this.emprLegalDepartamento = emprLegalDepartamento;
	}

	public String getEmprLegalPais() {
		return emprLegalPais;
	}

	public void setEmprLegalPais(String emprLegalPais) {
		this.emprLegalPais = emprLegalPais;
	}

	public String getEmprLegalTelefono() {
		return emprLegalTelefono;
	}

	public void setEmprLegalTelefono(String emprLegalTelefono) {
		this.emprLegalTelefono = emprLegalTelefono;
	}
}
