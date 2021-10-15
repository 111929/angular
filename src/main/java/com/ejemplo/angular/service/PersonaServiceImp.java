package com.ejemplo.angular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.angular.model.Persona;
import com.ejemplo.angular.repository.PersonaRepository;
@Service
public class PersonaServiceImp implements PersonaService{

	@Autowired
	PersonaRepository personaRepository;
	
	
	@Override
	public List<Persona>listar() {
		
		return  (List<Persona>) personaRepository.findAll();
	}

	@Override
	public Persona listarId(Long id) {
		
		return personaRepository.findById(id).get();
	}

	@Override
	public Persona agregar(Persona p) {
		
		return personaRepository.save(p);
	}

	@Override
	public Persona actualizar(Persona p) {
		
		return personaRepository.save(p);
	}

	@Override
	public Persona delete(Long id) {
	
		 Persona p=personaRepository.findById(id).get();
	        if(p!=null){
	            personaRepository.delete(p);
	        }
	       return p;
	}

}
