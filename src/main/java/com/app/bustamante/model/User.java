package com.app.bustamante.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotBlank(message = "Name is mandatory")
	private String name;
	@NotBlank(message = "Email is mandatory")
	private String email;

	@JoinColumn(name="rol", referencedColumnName="ID_TIUS", foreignKey=@ForeignKey(name="FK_USER_TIPOUSER"))
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoUser rol;
	
	public User() {
	}
	
	public User(long id) {
		super();
		this.id = id;
	}

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoUser getRol() {
		return rol;
	}

	public void setRol(TipoUser rol) {
		this.rol = rol;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
