package it.its.webapp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        
        //manage etaParams parse as integer exception if not a number or null or empty
		Integer eta = null;
		if (etaParams != null && !etaParams.isEmpty()) {
			eta = Integer.parseInt(etaParams);
		}
		
		
        
        
        Utente utente = new Utente(nomeParams, cognomeParams, emailParams, eta, sessoParams, dataDiNascitaParams);
        
        System.out.println("----------------------");
        if(!utente.validaNome()) {
        	if(utente.emptyNome()) {
        		System.out.println("Nome non inserito");
        	} else {
        		System.out.println("Nome non valido");
        	}
        }
		if (!utente.validaCognome()) {
			if (utente.emptyCognome()) {
				System.out.println("Cognome non inserito");
			} else {
				System.out.println("Cognome non valido");
			}
		}
		if (!utente.validaEmail()) {
			if (utente.emptyEmail()) {
				System.out.println("Email non inserita");
			}
			else {
				System.out.println("Email non valida");
			}
		}
		if (!utente.validaEta()) {
			if (utente.emptyEta()) {
				System.out.println("Eta non inserita");
			} else {
				System.out.println("Eta non valida");
			}
		}
		
		if (!utente.validaSesso()) {
			if (utente.emptySesso()) {
				System.out.println("Sesso non inserito");
			} else {
				System.out.println("Sesso non valido");
			}
		}
		
		if (!utente.validaDataDiNascita()) {
			if (utente.emptyDataDiNascita()) {
				System.out.println("Data di nascita non inserita");
			} else {
				System.out.println("Data di nascita non valida");
			}
		}
		
        if(utente.validaUtente()) {
        	System.out.println("Nome: " + utente.getNome());
            System.out.println("Cognome: " + utente.getCognome());
            System.out.println("Email: " + utente.getEmail());
            System.out.println("Eta: " + utente.getEta());
            System.out.println("Sesso: " + utente.getSesso());
            System.out.println("Data di nascita: " + utente.getDataDiNascita());
        }
        
	}

}
