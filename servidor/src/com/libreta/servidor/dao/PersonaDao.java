package com.libreta.servidor.dao;

import org.hibernate.Session;

import com.libreta.repositorio.dto.PersonaDto;
import com.libreta.servidor.entities.DireccionEntity;
import com.libreta.servidor.entities.PersonaEntity;
import com.libreta.servidor.hibernate.HibernateUtil;

public class PersonaDao {
	
	public static void save(PersonaDto persona) {
		
		Session session = null;
		
		session = HibernateUtil.getSessionFactory().openSession();
		
		PersonaEntity personaEntity = new PersonaEntity();
		
		DireccionEntity direccionEntity = new DireccionEntity();
		
		personaEntity.setApellido(persona.getApellido());
		
		personaEntity.setDni(persona.getDni());
		
		personaEntity.setNombre(persona.getNombre());
		
		
		direccionEntity.setCalle(persona.getCalle());
		direccionEntity.setCodigo_postal(persona.getCodigo_postal());
		direccionEntity.setDpto(persona.getDpto());
		direccionEntity.setEntreCalle1(persona.getEntreCalle1());
		direccionEntity.setEntreCalle2(persona.getEntreCalle2());
		direccionEntity.setLocalidad(persona.getLocalidad());
		direccionEntity.setNumero(persona.getNumero());
		direccionEntity.setPais(persona.getPais());
		direccionEntity.setPiso(persona.getPiso());
		direccionEntity.setProvincia(persona.getProvincia());
		
		personaEntity.setDireccion(direccionEntity);
		
		session.save(personaEntity);
		session.close();		
	}


}
