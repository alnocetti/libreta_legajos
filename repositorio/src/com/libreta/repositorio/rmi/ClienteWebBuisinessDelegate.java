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
		
		this.clienteWebRemoteObject = (ClienteWebRemoteObjectTDA) Naming.lookup("//localhost/clienteWebRemoteObjectImpl");
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
	
	public void addPersona(PersonaDto persona) throws RemoteException {
		
		this.clienteWebRemoteObject.addPersona(persona);
	}
	
	

}
