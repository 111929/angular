package com.ejemplo.angular.service;

import java.util.List;

import com.ejemplo.angular.model.Persona;

 public interface PersonaService {
 List<Persona>listar();
  Persona listarId(Long id);
  Persona agregar(Persona p);
 Persona actualizar(Persona p);
  Persona delete (Long id);
}
