package it.its.webapp.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import it.its.webapp.models.Utente;

public class Validator {
	private static final Pattern EMAIL_REGEX = 
	        Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
	
	public static Boolean validateUser(Utente user) {
		//Validate Nome
		if (user.getNome() == null || 
			user.getNome().isEmpty()) {
			return false;
		}
		
		//Validate Cognome
		if (user.getCognome() == null || 
			user.getCognome().isEmpty()) {
			return false;
		}
		
		//validate Email
		if (user.getEmail() == null || 
			user.getEmail().isEmpty() ||
			!EMAIL_REGEX.matcher(user.getEmail()).matches()) {
			return false;
		}
		
		//validate Eta
		if (user.getEta() == null || 
			user.getEta() < 18) {
			return false;
		}
		
		//validate Sesso
		if (user.getSesso() == null || 
			user.getSesso().isEmpty()) {
			return false;
		}
		
		//validate Data di Nascita
		if (user.getDataDiNascita() == null || 
			user.getDataDiNascita().isEmpty()) {
			return false;
		}
		else {
			try {
				Date date = new SimpleDateFormat("yyyy-MM-dd").parse(user.getDataDiNascita());
				if (date.after(new Date())) {
					return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		
		return true;
	}
}
