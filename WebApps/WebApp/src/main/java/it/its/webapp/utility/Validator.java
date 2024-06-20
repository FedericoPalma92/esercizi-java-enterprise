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
		
		//validate Email
		if (user.getEmail() == null || 
			user.getEmail().isEmpty()) {
			errors.add("Campo Email vuota.");
		}
		else if (!EMAIL_REGEX.matcher(user.getEmail()).matches()) {
            errors.add("Campo Email non valida.");
        }
		
		//validate Eta
		if (user.getEta() == null) {
			errors.add("Campo Eta vuoto.");
		}
		else if (user.getEta() < 18) {
            errors.add("Eta minore di 18.");
        }
		
		//validate Sesso
		if (user.getSesso() == null || 
			user.getSesso().isEmpty()) {
			errors.add("Campo Sesso vuoto.");
		}
		
		//validate Data di Nascita
		if (user.getDataDiNascita() == null || 
			user.getDataDiNascita().isEmpty()) {
			errors.add("Campo Data di Nascita vuoto.");
		}
		else {
			try {
				Date date = new SimpleDateFormat("yyyy-MM-dd").parse(user.getDataDiNascita());
				if (date.after(new Date())) {
					errors.add("Data di nascita futura.");
				}
			} catch (Exception e) {
				errors.add("Data di nascita non valida.");
			}
		}
		
		return errors;
	}
}
