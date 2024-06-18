package it.its.webapp.servlets;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/*
 * Esegue una validazione dei dati
 * Tutti i campi devono essere compilati
 * Email deve avere un formato corretto
 * Eta > 18
 * Data di nascita < data odierna 
 */
public class Utente {
	// Costanti
	private static final Pattern EMAIL_REGEX = 
	        Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
	// Proprietà
	private String nome;
	private String cognome;
	private String email;
	private Integer eta;
	private String sesso;
	private String dataDiNascita;
	
	// Costruttore
	public Utente(String nome, String cognome, String email, Integer eta, String sesso, String dataDiNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.eta = eta;
		this.sesso = sesso;
		this.dataDiNascita = dataDiNascita;
	}
	
	//Metodi Getter
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Integer getEta() {
		return eta;
	}
	
	public String getSesso() {
		return sesso;
	}
	
	public String getDataDiNascita() {
		return dataDiNascita;
	}
	
	//Metodi Setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setEta(Integer eta) {
		this.eta = eta;
	}
	
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	
	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	
	//Validatori
	
	public Boolean validaNome() {
		if (this.nome == null || this.nome.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public Boolean emptyNome() {
		if (this.cognome == null || this.cognome.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public Boolean validaCognome() {
		if (this.cognome == null || this.cognome.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public Boolean emptyCognome() {
		if (this.cognome == null || this.cognome.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public Boolean validaEmail() {
		//not null, not empty, valid mail format
		if (this.email == null || this.email.isEmpty()) {
			return false;
		}
		if (!EMAIL_REGEX.matcher(this.email).matches()) {
			return false;
		}
		return true;
	}
	
	public Boolean emptyEmail() {
		if (this.email == null || this.email.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public Boolean validaEta() {
		//not null, not empty, > 18
		if (this.eta == null) {
			return false;
		}
		if (this.eta < 18) {
			return false;
		}
		return true;
	}
	
	public Boolean emptyEta() {
		if (this.eta == null) {
			return true;
		}
		return false;
	}
	
	public Boolean validaSesso() {
		if (this.sesso == null || this.sesso.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public Boolean emptySesso() {
		if (this.sesso == null || this.sesso.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public Boolean validaDataDiNascita() {
        if (this.dataDiNascita == null || this.dataDiNascita.isEmpty() ) {
            return false;
        }
        try {
        	Date date = new SimpleDateFormat("yyyy-MM-dd").parse(this.dataDiNascita);
            Date today = new Date();
			if (date.after(today)) {
				return false;
			}
        }
		catch (Exception e) {
			return false;
		}
        
        
        return true;
	}
	
	public Boolean emptyDataDiNascita() {
		if (this.dataDiNascita == null || this.dataDiNascita.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public Boolean validaUtente() {
		if (!this.validaNome()) {
			return false;
		}
		if (!this.validaCognome()) {
			return false;
		}
		if (!this.validaEmail()) {
			return false;
		}
		if (!this.validaEta()) {
			return false;
		}
		if (!this.validaDataDiNascita()) {
			return false;
		}
		return true;
	}
}
