package com.libreta.repositorio.dto;

import java.io.Serializable;

public class PersonaDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String nombre;
	private String apellido;
	private int dni;
	private String calle;
	private String entreCalle1;
	private String entreCalle2;
	private int numero;
	private int piso;
	private String dpto;
	private String localidad;
	private String provincia;
	private String pais;
	private String codigo_postal;
	
	public PersonaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonaDto(int id, String nombre, String apellido, int dni, String calle, String entreCalle1,
			String entreCalle2, int numero, int piso, String dpto, String localidad, String provincia, String pais,
			String codigo_postal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.calle = calle;
		this.entreCalle1 = entreCalle1;
		this.entreCalle2 = entreCalle2;
		this.numero = numero;
		this.piso = piso;
		this.dpto = dpto;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
		this.codigo_postal = codigo_postal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getDni() {
		return dni;
	}

	public String getCalle() {
		return calle;
	}

	public String getEntreCalle1() {
		return entreCalle1;
	}

	public String getEntreCalle2() {
		return entreCalle2;
	}

	public int getNumero() {
		return numero;
	}

	public int getPiso() {
		return piso;
	}

	public String getDpto() {
		return dpto;
	}

	public String getLocalidad() {
		return localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public String getPais() {
		return pais;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public void setEntreCalle1(String entreCalle1) {
		this.entreCalle1 = entreCalle1;
	}

	public void setEntreCalle2(String entreCalle2) {
		this.entreCalle2 = entreCalle2;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public void setDpto(String dpto) {
		this.dpto = dpto;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
	
	
	
	
}
