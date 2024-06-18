package it.its.mywebapp.servletes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */

/**
 * Ci troviam0o in un regime di Inversion of Control (IoC)
 * I metodi presenti all'interno della servlet vengono invocati a seconda del method
 * presente all'interno della request line del message http
 * Ogni servlet è richiamata dall'application server (TOMCAT) guardando il path del request line 
 * 
 */
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
    /**
	 * Se il method è get viene invocato questo metodo
     *
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.execute(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 * Se il method è post viene invocato questo metodo
     *
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.execute(request, response);
	}
	
	/**
	 * 
	 * Execute è un metodo che abbiamo creato per incalanare la logica di questa servlet 
	 * in un unico blocco di codice a prescindere dal method della request
	 */
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * Posso utilizzare l'oggetto request per accedere appunto alla request message http
		 * 		 * 
		 */
		String name = request.getParameter("nome");
		System.out.println("nome:" + name);
	}
	
}
