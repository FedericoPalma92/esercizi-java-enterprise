package it.its.webapp.models;

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
}
