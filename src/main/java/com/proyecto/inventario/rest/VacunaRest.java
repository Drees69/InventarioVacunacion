package com.proyecto.inventario.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.inventario.model.Vacuna;
import com.proyecto.inventario.service.VacunaService;

@RestController
@RequestMapping ("/vacuna/")
public class VacunaRest {
	
	@Autowired
	private VacunaService vacunaService;
	
	@GetMapping
	private ResponseEntity<List<Vacuna>> getAllEmpleados (){
		return ResponseEntity.ok(vacunaService.findAll());

}
}