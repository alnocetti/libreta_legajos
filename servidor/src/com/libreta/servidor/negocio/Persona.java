package com.libreta.servidor.negocio;

import com.libreta.repositorio.dto.PersonaDto;

public class Persona {
	
	private int id;
	private String nombre;
	private String apellido;
	private int dni;
	private Direccion direccion;
	
	public Persona(int id, String nombre, String apellido, int dni, Direccion direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public PersonaDto toDto() {
		PersonaDto personaDto = new PersonaDto();
		
		personaDto.setApellido(this.apellido);
		personaDto.setCalle(this.getDireccion().getCalle());
		personaDto.setCodigo_postal(this.getDireccion().getCodigo_postal());
		personaDto.setDni(this.getDni());
		personaDto.setDpto(this.getDireccion().getDpto());
		personaDto.setEntreCalle1(this.getDireccion().getEntreCalle1());
		personaDto.setEntreCalle2(this.getDireccion().getEntreCalle2());
		personaDto.setId(this.getId());
		personaDto.setLocalidad(this.getDireccion().getLocalidad());
		personaDto.setNombre(this.getNombre());
		personaDto.setNumero(this.getDireccion().getNumero());
		personaDto.setPais(this.getDireccion().getPais());
		personaDto.setPiso(this.getDireccion().getPiso());
		personaDto.setProvincia(this.getDireccion().getProvincia());
		
		return personaDto;
	}
	
}
