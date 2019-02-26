package com.libreta.servidor.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.libreta.repositorio.dto.PersonaDto;
import com.libreta.repositorio.rmi.ClienteWebRemoteObjectTDA;
import com.libreta.servidor.controlador.ClienteWebController;

public class ClienteWebRemoteObjectImpl extends UnicastRemoteObject implements ClienteWebRemoteObjectTDA {

	private ClienteWebController controller;
	private static final long serialVersionUID = 1L;
	
	public ClienteWebRemoteObjectImpl() throws RemoteException {
		super();
		
		this.controller = new ClienteWebController();
		// TODO Auto-generated constructor stub
	}

	
	public void addPersona(PersonaDto persona) {
		System.out.println("<- addPersona()");
		this.controller.addPersona(persona);
		
	}

}
