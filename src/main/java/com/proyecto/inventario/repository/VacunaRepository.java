package com.proyecto.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.inventario.model.Vacuna;

public interface VacunaRepository extends JpaRepository<Vacuna, Long>  {

}
