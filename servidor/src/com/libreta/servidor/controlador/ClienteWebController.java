package com.libreta.servidor.controlador;

import java.util.HashSet;
import java.util.Set;

import com.libreta.repositorio.dto.PersonaDto;
import com.libreta.servidor.dao.PersonaDao;
import com.libreta.servidor.negocio.Persona;

public class ClienteWebController {

	public ClienteWebController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addPersona(PersonaDto persona) {
		// TODO Auto-generated method stub
		PersonaDao.save(persona);
	}
	
	public Set<PersonaDto> getPersonas(){
		
		Set<PersonaDto> personasDto = new HashSet<PersonaDto>();
		
		Set<Persona> personas = PersonaDao.getAll();
		
		for (Persona persona : personas) {
			personasDto.add(persona.toDto());
		}
		
		return personasDto;
	}
	
	

}
