package com.libreta.repositorio.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.libreta.repositorio.dto.PersonaDto;

public interface ClienteWebRemoteObjectTDA extends Remote{
	
	public void addPersona(PersonaDto persona) throws RemoteException;

}
