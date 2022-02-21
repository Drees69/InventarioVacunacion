package com.proyecto.inventario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "vacuna")

public class Vacuna{
	
	
	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vac_id;
	private String tipo_vacuna;
	
	//nuevo contructor api 
	public Vacuna() {
		
	}
	
	
	
	public int getVac_id() {
		return vac_id;
	}



	public void setVac_id(int vac_id) {
		this.vac_id = vac_id;
	}



	public Vacuna(String tipo_vacuna) {
		super();
		this.tipo_vacuna = tipo_vacuna;
	}
	public String getTipo_vacuna() {
		return tipo_vacuna;
	}
	public void setTipo_vacuna(String tipo_vacuna) {
		this.tipo_vacuna = tipo_vacuna;
	}
	
	
	
	
	
	
	

}
