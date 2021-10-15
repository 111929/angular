package com.ejemplo.angular.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.angular.model.Persona;
import com.ejemplo.angular.repository.PersonaRepository;
import com.ejemplo.angular.service.PersonaService;


@RestController
@CrossOrigin(origins="http://localhost:4200",maxAge = 3600)
@RequestMapping({"/personas"})
public class PersonaController {

	@Autowired
	PersonaService personaService;
	@Autowired
	PersonaRepository personaRepository;
	
	@GetMapping()
	public List<Persona> listarPersona(){
		
		return personaService.listar();
	}
	@PostMapping	
	public ResponseEntity<Persona> altaPersona(@RequestBody Persona persona){	
		personaRepository.save(persona);
		return ResponseEntity.ok(persona);
	}
	 @GetMapping(path = {"/{id}"})
	    public Persona listarId(@PathVariable("id")Long id){
	        return personaService.listarId(id);
	    }
	 @PutMapping(path = {"/{id}"})
	    public Persona editar(@RequestBody Persona p,@PathVariable("id") Long id){
	        p.setId(id);
	        return personaService.actualizar(p);
	    }
	 @DeleteMapping(path = {"/{id}"})
		 public Persona delete(@PathVariable("id") Long  id){
		        return personaService.delete(id);
	 }
	 
}
