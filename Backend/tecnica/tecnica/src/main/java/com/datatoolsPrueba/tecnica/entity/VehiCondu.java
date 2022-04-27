package com.datatoolsPrueba.tecnica.entity;

import java.io.Serializable;

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
@Table(name = "DTOO_VEHI_CONDU")
public class VehiCondu implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "VHCDU_ID")
    @GeneratedValue(generator="seqVehiCondu") 
    @SequenceGenerator(name="seqVehiCondu",sequenceName="SEQ_VEHI_CONDU", allocationSize=1)
	private Long vhcduId;
	
	@JoinColumn(name = "VEHICULO_ID", referencedColumnName = "VEHI_ID")
    @ManyToOne(fetch = FetchType.LAZY)
	private Vehiculo vehiculoId;
	
	@JoinColumn(name = "CONDUCTOR_ID", referencedColumnName = "COND_ID")
    @ManyToOne(fetch = FetchType.LAZY)
	private Conductor conductorId;

	public VehiCondu() {
	}

	public VehiCondu(Long vhcduId) {
		this.vhcduId = vhcduId;
	}

	public VehiCondu(Long vhcduId, Vehiculo vehiculoId, Conductor conductorId) {
		this.vhcduId = vhcduId;
		this.vehiculoId = vehiculoId;
		this.conductorId = conductorId;
	}

	public Long getVhcduId() {
		return vhcduId;
	}

	public void setVhcduId(Long vhcduId) {
		this.vhcduId = vhcduId;
	}

	public Vehiculo getVehiculoId() {
		return vehiculoId;
	}

	public void setVehiculoId(Vehiculo vehiculoId) {
		this.vehiculoId = vehiculoId;
	}

	public Conductor getConductorId() {
		return conductorId;
	}

	public void setConductorId(Conductor conductorId) {
		this.conductorId = conductorId;
	}	
}
