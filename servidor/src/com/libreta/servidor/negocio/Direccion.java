package com.libreta.servidor.negocio;

public class Direccion {
	
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
	
	public Direccion(String calle, String entreCalle1, String entreCalle2, int numero, String localidad,
			String provincia, String pais) {
		super();
		this.calle = calle;
		this.entreCalle1 = entreCalle1;
		this.entreCalle2 = entreCalle2;
		this.numero = numero;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
	}
	
	
	public Direccion() {
		// TODO Auto-generated constructor stub
	}


	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getEntreCalle1() {
		return entreCalle1;
	}
	public void setEntreCalle1(String entreCalle1) {
		this.entreCalle1 = entreCalle1;
	}
	public String getEntreCalle2() {
		return entreCalle2;
	}
	public void setEntreCalle2(String entreCalle2) {
		this.entreCalle2 = entreCalle2;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public String getDpto() {
		return dpto;
	}
	public void setDpto(String dpto) {
		this.dpto = dpto;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCodigo_postal() {
		return codigo_postal;
	}
	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	
	
}
