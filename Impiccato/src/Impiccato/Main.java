package Impiccato;

import java.util.Scanner;

import Impiccato.Gioco.Gioco;

public class Main {

	public static void main(String[] args) {
		String[] parole = {"automobile", "mela", "cane", "gatto", "tavolo", "sedia", "telefono", "computer", "casa", "giardino"};
		
		String parola = parole[(int)(Math.random() * parole.length)];
		int vite = 5;
		
		Gioco gioco = new Gioco(parola, vite);
		
		
		
		System.out.println("Benvenuto al gioco dell'impiccato!");
		System.out.println("Hai a disposizione "+ vite + " vite.");
		System.out.println("La parola da indovinare è la seguente:");

		stampaParola(gioco.getLettere());
		
		gioca(gioco);
	}
	
	public static void stampaParola(char[] lettere) {
        for (int i = 0; i < lettere.length; i++) {
            System.out.print(lettere[i]);
        }
        System.out.println();
    }
	
	public static void gioca(Gioco gioco) {
		Scanner scanner = new Scanner(System.in);

		while (gioco.getVite() > 0) {
			System.out.println("Inserisci una lettera:");
			char lettera = scanner.next().charAt(0);

			boolean trovata = gioco.gioca(lettera);

			if (!trovata) {
				System.out.println("La lettera non è presente. Vite rimaste: " + gioco.getVite());
			}


			if (gioco.finito()) {
				System.out.println("Hai indovinato la parola! La parola era: " + gioco.getParola());
				break;
			}

			stampaParola(gioco.getLettere());
		}

		if (gioco.getVite() == 0) {
			System.out.println("Hai perso! La parola era: " + gioco.getParola());
		}
	}

}
