package com.ejemplo.angular.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ejemplo.angular.model.Persona;

public interface PersonaRepository extends CrudRepository<Persona,Long> {
 
}
