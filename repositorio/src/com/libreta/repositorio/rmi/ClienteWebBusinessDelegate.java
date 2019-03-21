package com.libreta.repositorio.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.HashSet;
import java.util.Set;

import com.libreta.repositorio.dto.PersonaDto;

public class ClienteWebBusinessDelegate {
	
	static ClienteWebBusinessDelegate instance;
	
	ClienteWebRemoteObjectTDA clienteWebRemoteObject;

	public ClienteWebBusinessDelegate() throws MalformedURLException, RemoteException, NotBoundException {
		super();
		
		this.clienteWebRemoteObject = (ClienteWebRemoteObjectTDA) Naming.lookup("//localhost/clienteWebRemoteObjectImpl");
		// TODO Auto-generated constructor stub
	}
	
	public static ClienteWebBusinessDelegate getInstance() {
		
		if (instance == null) {
			try {
				instance = new ClienteWebBusinessDelegate();
			} catch (RemoteException | MalformedURLException | NotBoundException e) {
				e.printStackTrace();
			}
		}
		return instance;
		
	}
	
	public void addPersona(PersonaDto persona) throws RemoteException {
		
		this.clienteWebRemoteObject.addPersona(persona);
	}
	
	public Set<PersonaDto> getPersonas() throws RemoteException{
		Set<PersonaDto> personas = new HashSet<PersonaDto>();
		personas = this.clienteWebRemoteObject.getPersonas();
		return personas;	
	}
	
	

}
