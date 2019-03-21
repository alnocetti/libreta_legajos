package com.libreta.cliente_web.servlets;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.libreta.repositorio.dto.PersonaDto;
import com.libreta.repositorio.rmi.ClienteWebBusinessDelegate;

/**
 * Servlet implementation class ConsultaPersonaServlet
 */
@WebServlet("/ConsultaPersonaServlet")
public class ConsultaPersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaPersonaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Set<PersonaDto> personasDto;
		
		try {
			personasDto = ClienteWebBusinessDelegate.getInstance().getPersonas();
		} catch(RemoteException e) {
			e.printStackTrace();
		}
		
		response.sendRedirect(request.getContextPath() + "/secure/jsp/ConsultaPersona.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
