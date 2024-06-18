package it.its.webapp.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.its.webapp.models.Utente;
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
        
        System.out.println("----------------------");
        ArrayList<String> errors = Validator.validateUser(utente);
        if(errors.size() > 0) {
        	System.out.println("Utente non valido!");
			for (String error : errors) {
				System.out.println(error);
			}
		} else {
			System.out.println("Utente valido!");
        	System.out.println("Nome: " + utente.getNome());
            System.out.println("Cognome: " + utente.getCognome());
            System.out.println("Email: " + utente.getEmail());
            System.out.println("Eta: " + utente.getEta());
            System.out.println("Sesso: " + utente.getSesso());
            System.out.println("Data di nascita: " + utente.getDataDiNascita());
		}
        
	}

}
