package com.libreta.repositorio.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.libreta.repositorio.dto.PersonaDto;

public class ClienteWebBuisinessDelegate {
	
	static ClienteWebBuisinessDelegate instance;
	
	ClienteWebRemoteObjectTDA clienteWebRemoteObject;

	public ClienteWebBuisinessDelegate() throws MalformedURLException, RemoteException, NotBoundException {
		super();
		
		this.clienteWebRemoteObject = (ClienteWebRemoteObjectTDA) Naming.lookup("//localhost/clienteWebRemoteObjectImp");
		// TODO Auto-generated constructor stub
	}
	
	public static ClienteWebBuisinessDelegate getInstance() {
		
		if (instance == null) {
			try {
				instance = new ClienteWebBuisinessDelegate();
			} catch (RemoteException | MalformedURLException | NotBoundException e) {
				e.printStackTrace();
			}
		}
		return instance;
		
	}
	
	public void addPersona(	String nombre,
							String apellido,
							int dni,
							String calle,
							String entreCalle1,
							String entreCalle2,
							int numero,
							int piso,
							String dpto,
							String localidad,
							String provincia,
							String pais,
							String codigo_postal) throws RemoteException {
		PersonaDto persona = new PersonaDto();
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		persona.setDni(dni);
		persona.setCalle(calle);
		persona.setEntreCalle1(entreCalle1);
		persona.setEntreCalle2(entreCalle2);
		persona.setNumero(numero);
		persona.setPiso(piso);
		persona.setDpto(dpto);
		persona.setLocalidad(localidad);
		persona.setProvincia(provincia);
		persona.setPais(pais);
		persona.setCodigo_postal(codigo_postal);
		
		this.clienteWebRemoteObject.addPersona(persona);
	}
	
	

}
