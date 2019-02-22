package com.libreta.servidor.dao;

import org.hibernate.Session;

import com.libreta.servidor.entities.DireccionEntity;
import com.libreta.servidor.entities.PersonaEntity;
import com.libreta.servidor.hibernate.HibernateUtil;
import com.libreta.servidor.negocio.Persona;

public class PersonaDao {
	
	public static void save(Persona persona) {
		
		Session session = null;
		
		session = HibernateUtil.getSessionFactory().openSession();
		
		PersonaEntity personaEntity = new PersonaEntity();
		
		DireccionEntity direccionEntity = new DireccionEntity();
		
		personaEntity.setApellido(persona.getApellido());
		
		personaEntity.setDni(persona.getDni());
		
		personaEntity.setNombre(persona.getNombre());
		
		personaEntity.setDireccion(direccionEntity);
		
		
	}


}
