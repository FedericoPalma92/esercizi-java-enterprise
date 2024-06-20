package it.its.webapp.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

import it.its.webapp.domain.Utente;

public class Validator {
	private static final Pattern EMAIL_REGEX = 
	        Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
	
	public static ArrayList<String> validateUser(Utente user) {
		ArrayList<String> errors = new ArrayList<String>();
		//Validate Nome
		if (user.getNome() == null || 
			user.getNome().isEmpty()) {
			errors.add("Campo Nome vuoto.");
		}
		
		//Validate Cognome
		if (user.getCognome() == null || 
			user.getCognome().isEmpty()) {
			errors.add("Campo Cognome vuoto.");
		}
		
		return errors;
	}
}
