package com.libreta.cliente_web.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath() + "/nonsecure/jsp/Login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		//String password = request.getParameter("password");
		if (usuario != null ) {
			
			try {
				request.getSession().setAttribute("usuario", usuario);
				response.sendRedirect(request.getContextPath() + "/secure/servlets/HomeServlet");
			} catch (Exception e) {
				response.sendRedirect(request.getContextPath() + "/nonsecure/jsp/Login.jsp?status=failure&message=" + e.getMessage());
			}
			
		}else {
			response.sendRedirect(request.getContextPath() + "/nonsecure/jsp/Login.jsp?status=failure&message=Debe completar el formulario");
		}
	}

}
