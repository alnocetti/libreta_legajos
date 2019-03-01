package com.libreta.servidor.app;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import com.libreta.repositorio.dto.PersonaDto;
import com.libreta.repositorio.rmi.ClienteWebBuisinessDelegate;
import com.libreta.servidor.rmi.ClienteWebRemoteObjectImpl;

public class Servidor {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		// TODO Auto-generated method stub
		
//		Session sf = HibernateUtil.getSessionFactory().openSession();
//		sf.close();		
		
		LocateRegistry.createRegistry(1099);
		System.out.println("Server levantado en puerto 1099");
		Naming.rebind("//localhost/clienteWebRemoteObjectImpl", new ClienteWebRemoteObjectImpl());

	}

}
