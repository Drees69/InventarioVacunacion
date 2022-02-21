package com.proyecto.inventario.rest;

import java.net.URI;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.inventario.model.Empleado;
import com.proyecto.inventario.service.EmpleadoService;

@RestController
@RequestMapping("/empleado/")
public class EmpleadoRest {

	@Autowired
	private EmpleadoService empleadoService;

	@GetMapping
	private ResponseEntity<List<Empleado>> getAllEmpleados() {
		return ResponseEntity.ok(empleadoService.findAll());

	}
	
	@PostMapping
	private ResponseEntity<Empleado> saveEmpleado (@RequestBody Empleado empleado){
		try {
			Empleado empleadoGuardado = empleadoService.save(empleado);
			return ResponseEntity.created(new URI("empleado"+empleadoGuardado.getEmp_id())).body(empleadoGuardado);
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			// TODO: handle exception
		}
		
	}

}
