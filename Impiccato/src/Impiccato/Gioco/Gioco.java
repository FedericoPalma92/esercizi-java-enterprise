package Impiccato.Gioco;

public class Gioco {
	private int vite;
	private char[] lettere;
	private String parola;
	
	//Costruttori
	public Gioco(String parola) {
		this.parola = parola;
		this.vite = 5;
		this.lettere = new char[parola.length()];
		for (int i = 0; i < lettere.length; i++) {
			lettere[i] = '-';
		}
	}
	
	public Gioco(String parola, int vite) {
		this.parola = parola;
		this.vite = vite;
		this.lettere = new char[parola.length()];
		for (int i = 0; i < lettere.length; i++) {
			lettere[i] = '-';
		}
	}
	//Getter e setter
	

	
	public String getParola() {
		return parola;
	}
	
	public void setParola(String parola) {
		this.parola = parola;
	}
	
	public int getVite() {
		return vite;
	}
	
	public void setVite(int vite) {
		this.vite = vite;
	}
	
	public char[] getLettere() {
		return lettere;
	}
	
	public void setLettere(char[] lettere) {
		this.lettere = lettere;
	}
	
	//Metodi
	
	public boolean gioca(char lettera) {
		boolean trovata = false;
		for (int i = 0; i < parola.length(); i++) {
			if (parola.charAt(i) == lettera) {
				lettere[i] = lettera;
				trovata = true;
			}
		}
		if (!trovata) {
			vite--;
		}
		
		return trovata;
	}
	
	public boolean finito() {
		for (int i = 0; i < lettere.length; i++) {
			if (lettere[i] == '-') {
				return false;
			}
		}
		return true;
	}
	
	public boolean perso() {
		return vite == 0;
	}
}
