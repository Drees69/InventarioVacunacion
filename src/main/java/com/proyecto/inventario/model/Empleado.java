package com.proyecto.inventario.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "empleado")

public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	private int cedula;
	private String nombres;
	private String apellidos;
	private String email;
	private boolean estado;
	private Date fechanacimiento;
	private String direccion;
	private int telefono;
	private String estadovacuna;
	private Date fechavacuna;
	private int ndosis;
	private String usuario;
	private String contrasena;
	
	@ManyToOne
	@JoinColumn (name="rol_id")
	private Rol rol;
	
	@ManyToOne
	@JoinColumn (name="vac_id")
	private Vacuna vacuna;
	
	public Empleado() {
		
	}

	public Empleado(int emp_id, int cedula, String nombres, String apellidos, String email, boolean estado,
			Date fechanacimiento, String direccion, int telefono, String estadovacuna, Date fechavacuna, int ndosis,
			String usuario, String contrasena, Rol rol, Vacuna vacuna) {
		super();
		this.emp_id = emp_id;
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;
		this.estado = estado;
		this.fechanacimiento = fechanacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.estadovacuna = estadovacuna;
		this.fechavacuna = fechavacuna;
		this.ndosis = ndosis;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.rol = rol;
		this.vacuna = vacuna;
	}



	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEstadovacuna() {
		return estadovacuna;
	}

	public void setEstadovacuna(String estadovacuna) {
		this.estadovacuna = estadovacuna;
	}

	public Date getFechavacuna() {
		return fechavacuna;
	}

	public void setFechavacuna(Date fechavacuna) {
		this.fechavacuna = fechavacuna;
	}

	public int getNdosis() {
		return ndosis;
	}

	public void setNdosis(int ndosis) {
		this.ndosis = ndosis;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Vacuna getVacuna() {
		return vacuna;
	}

	public void setVacuna(Vacuna vacuna) {
		this.vacuna = vacuna;
	}
	

	
	

}
