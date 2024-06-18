package it.its.webapp.servlets;

import java.io.IOException;
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
		
		String nomeParams = request.getParameter("nome");
        String cognomeParams = request.getParameter("cognome");
        String emailParams = request.getParameter("email");
        String etaParams = request.getParameter("eta");
        String sessoParams = request.getParameter("sesso");
        String dataDiNascitaParams = request.getParameter("dataNascita");
        
		Integer eta = null;
		if (etaParams != null && !etaParams.isEmpty()) {
			eta = Integer.parseInt(etaParams);
		}
		
        Utente utente = new Utente(nomeParams, cognomeParams, emailParams, eta, sessoParams, dataDiNascitaParams);
        
        System.out.println("----------------------");
        
        if(Validator.validateUser(utente)) {
        	System.out.println("Utente valido!");
        	System.out.println("Nome: " + utente.getNome());
            System.out.println("Cognome: " + utente.getCognome());
            System.out.println("Email: " + utente.getEmail());
            System.out.println("Eta: " + utente.getEta());
            System.out.println("Sesso: " + utente.getSesso());
            System.out.println("Data di nascita: " + utente.getDataDiNascita());
		} else {
			System.out.println("Utente non valido");
			System.out.println("Controlla i dati inseriti!");
		}
        
	}

}
