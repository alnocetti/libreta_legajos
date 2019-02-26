package com.libreta.servidor.controlador;

import com.libreta.repositorio.dto.PersonaDto;
import com.libreta.servidor.dao.PersonaDao;

public class ClienteWebController {

	public ClienteWebController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addPersona(PersonaDto persona) {
		// TODO Auto-generated method stub
		PersonaDao.save(persona);
		
		
	}
	
	

}
