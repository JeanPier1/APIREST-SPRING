package com.app.bustamante.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TBL_TIPOUSER")
public class TipoUser {
	
	@Id
	@Column(name="ID_TIUS", updatable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUs;
	@Column(name="CO_TIPO")
	private String codigo;
	@Column(name="NO_TIPO")
	private String nombre;
	@Column(name="FE_REG")
	@Temporal(TemporalType.TIMESTAMP)
	private Date feReg;
	@Column(name="ES_TIPO")
	private boolean estado;
	
	public TipoUser() {
		super();
	}

	public TipoUser(int idUs) {
		super();
		this.idUs = idUs;
	}

	public int getIdUs() {
		return idUs;
	}

	public void setIdUs(int idUs) {
		this.idUs = idUs;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFeReg() {
		return feReg;
	}

	public void setFeReg(Date feReg) {
		this.feReg = feReg;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "TipoUser [idUs=" + idUs + ", codigo=" + codigo + ", nombre=" + nombre + ", feReg=" + feReg + ", estado="
				+ estado + "]";
	}
	
}
