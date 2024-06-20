package it.its.webapp.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Utente {
	
	// Proprietà
	private String nome;
	private String cognome;
	
	// Costruttori
	public Utente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	//Metodi Getter
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
}
