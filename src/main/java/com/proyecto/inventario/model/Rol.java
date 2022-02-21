package com.proyecto.inventario.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "rol")

public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rol_id;
	private String tiporol;
	
	//constructor api
	public Rol() {
		
	}
	

	public int getRol_id() {
		return rol_id;
	}





	public void setRol_id(int rol_id) {
		this.rol_id = rol_id;
	}





	public Rol(String tiporol) {
		super();
		this.tiporol = tiporol;
	}
	public String getTiporol() {
		return tiporol;
	}
	public void setTiporol(String tiporol) {
		this.tiporol = tiporol;
	}
	
	
	
	

}
