package com.proyecto.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.inventario.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{

}
