package it.its.webapp.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Utente {
	
	// Proprietà
	private String nome;
	private String cognome;
	private String email;
	private Integer eta;
	private String sesso;
	private String dataDiNascita;
	
	// Costruttori
	public Utente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	public Utente(String nome, String cognome, String email, String eta, String sesso, String dataDiNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.eta = null;
		if (eta != null && !eta.isEmpty()) {
			this.eta = Integer.parseInt(eta);
		}
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
