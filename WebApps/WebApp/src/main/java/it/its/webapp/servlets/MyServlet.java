package it.its.webapp.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.its.webapp.domain.Utente;
import it.its.webapp.utility.Validator;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.execute(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.execute(request, response);
	}
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
        String cognome = request.getParameter("cognome");
        String email = request.getParameter("email");
        String eta = request.getParameter("eta");
        String sesso = request.getParameter("sesso");
        String dataDiNascita = request.getParameter("dataNascita");
        
		
        Utente utente = new Utente(nome, cognome, email, eta, sesso, dataDiNascita);
        ArrayList<String> errors = Validator.validateUser(utente);

		RequestDispatcher requestDispatcher;
		if (errors.size() == 0) {

	        request.setAttribute("utente", utente);
			requestDispatcher = request.getRequestDispatcher("result.jsp");
	        requestDispatcher.forward(request, response);
		}
		else {

	        request.setAttribute("errori", errors);
	        request.setAttribute("utente", utente);
			
			requestDispatcher = request.getRequestDispatcher("index.jsp");
	        requestDispatcher.forward(request, response);
		}
		
	}

}
