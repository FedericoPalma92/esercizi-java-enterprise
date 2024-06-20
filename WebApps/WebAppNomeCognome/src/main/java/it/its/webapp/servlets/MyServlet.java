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
        
		Boolean isValidate = validate(nome, cognome);

		RequestDispatcher requestDispatcher;
		if(isValidate) {
			
			Utente utente = new Utente(nome, cognome);
			
			List utenti = new ArrayList<Utente>();
			
			utenti.add(new Utente("Mario", "Rossi"));
			utenti.add(new Utente("Luigi", "Bianchi"));
			utenti.add(utente);
			
			request.setAttribute("utenti", utenti);
			request.setAttribute("error", null);
			
			requestDispatcher = request.getRequestDispatcher("result.jsp");
	        requestDispatcher.forward(request, response);
		}
		else {
			request.setAttribute("error", "Nome e Cognome non possono essere vuoti");
			requestDispatcher = request.getRequestDispatcher("index.jsp");
			requestDispatcher.forward(request, response);
		}
        
	}
	
	private boolean validate(String nome, String cognome) {
		if (!"".equals(nome) && !"".equals(cognome)) {
			return true;
		}
		return false;
	}

}
