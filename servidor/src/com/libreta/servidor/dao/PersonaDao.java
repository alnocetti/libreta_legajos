package com.libreta.servidor.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.libreta.repositorio.dto.PersonaDto;
import com.libreta.servidor.entities.DireccionEntity;
import com.libreta.servidor.entities.PersonaEntity;
import com.libreta.servidor.hibernate.HibernateUtil;
import com.libreta.servidor.negocio.Direccion;
import com.libreta.servidor.negocio.Persona;

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
	
	public static Set<Persona> getAll(){
		
		Set<Persona> personas = new HashSet<Persona>();
		
		Session session = null;
		
		try {
					
			session = HibernateUtil.getSessionFactory().openSession();
			
			Query query = session.createQuery("from PersonaEntity");
			
			Set<PersonaEntity> personasEntity = new HashSet<PersonaEntity>(query.list());
			
			for(PersonaEntity personaEntity : personasEntity) {
				
				Persona persona = new Persona();
				Direccion direccion = new Direccion();
				
				direccion.setCalle(personaEntity.getDireccion().getCalle());
				direccion.setCodigo_postal(personaEntity.getDireccion().getCodigo_postal());
				direccion.setDpto(personaEntity.getDireccion().getDpto());
				direccion.setEntreCalle1(personaEntity.getDireccion().getEntreCalle1());
				direccion.setEntreCalle2(personaEntity.getDireccion().getEntreCalle2());
				direccion.setLocalidad(personaEntity.getDireccion().getLocalidad());
				direccion.setNumero(personaEntity.getDireccion().getNumero());
				direccion.setPais(personaEntity.getDireccion().getPais());
				direccion.setPiso(personaEntity.getDireccion().getPiso());
				direccion.setProvincia(personaEntity.getDireccion().getProvincia());
				
				persona.setDireccion(direccion);
				persona.setApellido(personaEntity.getApellido());
				persona.setNombre(personaEntity.getNombre());
				persona.setDni(personaEntity.getDni());
				persona.setId(personaEntity.getId());
				
				personas.add(persona);
				
			}
		
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			if(session != null && session.isOpen()) {
				session.close();
			}
		}
		
		return personas;
		
		
	}


}
