package com.libreta.cliente_web.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.libreta.repositorio.dto.PersonaDto;
import com.libreta.repositorio.rmi.ClienteWebBusinessDelegate;

/**
 * Servlet implementation class AddClienteServlet
 */
@WebServlet("/AddClienteServlet")
public class AltaPersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AltaPersonaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect(request.getContextPath() + "/secure/jsp/AltaPersona.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		PersonaDto persona = new PersonaDto();
		
		persona.setNombre(request.getParameter("nombre"));
		persona.setApellido(request.getParameter("apellido"));
		persona.setDni(Integer.parseInt(request.getParameter("dni")));
		persona.setCalle(request.getParameter("calle"));
		persona.setNumero(Integer.parseInt(request.getParameter("numero")));
		persona.setEntreCalle1(request.getParameter("entreCalle1"));
		persona.setEntreCalle2(request.getParameter("entreCalle2"));
		persona.setPiso(Integer.parseInt(request.getParameter("piso")));
		persona.setDpto(request.getParameter("dpto"));
		persona.setCodigo_postal(request.getParameter("codigoPostal"));
		persona.setPais(request.getParameter("pais"));
		persona.setProvincia(request.getParameter("provincia"));
		persona.setLocalidad(request.getParameter("localidad"));
		
		try {
			
			ClienteWebBusinessDelegate.getInstance().addPersona(persona);
			
		}catch (Exception e) {
			response.sendRedirect(request.getContextPath() + "/secure/jsp/AltaPersona.jsp?status=failure&message=" + e.getMessage());
		}
		
		request.getSession().setAttribute("status", "success");
		response.sendRedirect(request.getContextPath() + "/secure/jsp/AltaPersona.jsp");

	}

}
