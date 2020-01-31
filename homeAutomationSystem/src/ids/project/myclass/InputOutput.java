package ids.project.myclass;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public final class InputOutput {
	private static Scanner lettore = creaScanner();

	private final static String ERRORE_FORMATO = "Errore: il dato inserito non e' nel formato corretto";
	private final static String ERRORE_MINIMO = "Errore: e' richiesto un valore maggiore o uguale a ";
	private final static String ERRORE_STRINGA_VUOTA = "Attenzione: non hai inserito alcun carattere";
	private final static String MESSAGGIO_AMMISSIBILI = "Errore: i caratteri ammissibili sono: ";
	private final static String INT_FUORI_INTERVALLO = "Il numero deve essere compreso fra %d e %d inclusi";
	private final static String RISPOSTA_ERRATA = "Rispondere con s o n!";

	private final static String RISPOSTA_SI = "S";
	private final static String RISPOSTA_NO = "N";
	
	private static final Random rand = new Random();

	/**
	 * Crea e restituisce un oggetto di tipo scanner che scannerizza fino al
	 * primo "a capo"
	 * 
	 * @return oggetto scanner
	 */
	private static Scanner creaScanner() {
		Scanner creato = new Scanner(System.in);
		creato.useDelimiter(System.getProperty("line.separator"));
		return creato;
	}
	
	public static boolean randomBoolean() {
		return rand.nextBoolean();
	}
	/**
	 * Legge e restituisce una stringa inserita dall'utente
	 * 
	 * @param messaggio da mostrare
	 * @return stringa
	 */
	public static String leggiStringa(String messaggio) {
		System.out.print(messaggio);
		return lettore.next();
	}

	/**
	 * Esegue la stampa del messaggio dato come parametro
	 * 
	 * @param messaggio da mostrare
	 */
	public static void stampa(String messaggio) {
		System.out.println(messaggio);
	}

	/**
	 * Esegue la stampa del intero dato come parametro
	 * 
	 * @param numero numero da stampare
	 */
	public static void stampa(int numero) {
		System.out.println(numero);
	}

	/**
	 * Esegue la stampa del double dato come parametro
	 * 
	 * @param numero da stampare
	 */
	public static void stampa(double numero) {
		System.out.println(numero);
	}

	/**
	 * Esegue la stampa del carattere dato come parametro
	 * 
	 * @param carattere da stampare
	 */
	public static void stampa(char carattere) {
		System.out.println(carattere);
	}

	/**
	 * Legge e restituisce una stringa, fino a quando l'utente non inserisce un
	 * carattere
	 * 
	 * @param messaggio da mostrare
	 * @return stringa
	 */
	public static String leggiStringaNonVuota(String messaggio) {
		boolean finito = false;
		String lettura = null;
		do {
			lettura = leggiStringa(messaggio);
			lettura = lettura.trim(); // elimina gli spazi vuoti prima e dopo la
										// stringa
			if (lettura.length() > 0)
				finito = true;
			else
				stampa(ERRORE_STRINGA_VUOTA);
		} while (!finito);

		return lettura;
	}
	

	/**
	 * Legge e restituisce un carattere, fino a quando l'utente non inserisci un
	 * carattere
	 * 
	 * @param messaggio da mostrare
	 * @return carattere
	 */
	public static char leggiChar(String messaggio) {
		boolean finito = false;
		char valoreLetto = '\0';
		do {
			stampa(messaggio);
			String lettura = lettore.next();
			lettura = lettura.trim();
			if (lettura.length() > 0) {
				valoreLetto = lettura.charAt(0); // il carattere di indice 0
				finito = true;
			} else {
				stampa(ERRORE_STRINGA_VUOTA);
			}
		} while (!finito);
		return valoreLetto;
	}

	/**
	 * Legge un char inserito da tastiera
	 * @return char acquisito
	 */
	public static char leggiChar() {
		char valoreLetto;
		String lettura = lettore.next();
		lettura = lettura.trim();

		valoreLetto = lettura.charAt(0); // il carattere di indice 0

		return valoreLetto;
	}

	/**
	 * Legge e restituisce un carattere (non NULL) solo se è compreso fra quelli
	 * ammissibili dati come parametro sotto forma di stringa
	 * 
	 * @param messaggio da mostrare
	 * @param ammissibili stringa contenente caratteri ammissibili
	 * @return carattere
	 */
	public static char leggiUpperChar(String messaggio, String ammissibili) {
		boolean finito = false;
		char valoreLetto = '\0';
		do {
			valoreLetto = leggiChar(messaggio);
			valoreLetto = Character.toUpperCase(valoreLetto);
			if (ammissibili.indexOf(valoreLetto) != -1)
				finito = true;
			else
				stampa(MESSAGGIO_AMMISSIBILI + ammissibili);
		} while (!finito);
		return valoreLetto;
	}

	/**
	 * Legge e restituisce un intero
	 * 
	 * @param messaggio da mostrare
	 * @return intero letto
	 */
	public static int leggiIntero(String messaggio) {
		boolean finito = false;
		int valoreLetto = 0;
		do {
			try {
				System.out.println(messaggio);
				valoreLetto = lettore.nextInt();
				finito = true;
			} catch (InputMismatchException ex) {
				stampa(ERRORE_FORMATO);
				String daButtare = lettore.next();
			}
		} while (!finito);

		return valoreLetto;
	}

	/**
	 * Legge e restituisce un intero; senza stampare nessun messaggio
	 * 
	 * @return intero letto
	 */
	public static int leggiIntero() {
		System.out.println();
		boolean finito = false;
		int valoreLetto = 0;
		do {
			try {
				valoreLetto = lettore.nextInt();
				finito = true;
			} catch (InputMismatchException ex) {
				stampa(ERRORE_FORMATO);
				String daButtare = lettore.next();
			}
		} while (!finito);

		return valoreLetto;
	}

	/**
	 * Legge e restituisce un intero solo se è maggiore o uguale al minimo
	 * passato come parametro
	 * 
	 * @param messaggio da mostrare
	 * @param minimo intero minimo da poter acquisire
	 * @return intero acqusito
	 */
	public static int leggiInteroConMinimo(String messaggio, int minimo) {
		boolean finito = false;
		int valoreLetto = 0;
		do {
			valoreLetto = leggiIntero(messaggio);
			if (valoreLetto >= minimo)
				finito = true;
			else
				System.out.println(ERRORE_MINIMO + minimo);
		} while (!finito);

		return valoreLetto;
	}

	/**
	 * Legge e restituisce un numero compreso fra min e max dati come parametro
	 * 
	 * @param messaggio da mostrare
	 * @param minimo intero minimo da poter acquisire
	 * @param massimo intero massimo da poter acquisire
	 * @return intero letto
	 */
	public static int leggiIntero(String messaggio, int minimo, int massimo) {
		boolean finito = false;
		int valoreLetto = 0;
		do {
			try {
				Scanner in = new Scanner(System.in);
				stampa(messaggio);
				valoreLetto = in.nextInt();
				if (valoreLetto >= minimo && valoreLetto <= massimo)
					finito = true;
				else
					throw new IntegerOutOfRangeException();
			} catch (InputMismatchException ex) {
				stampa(ERRORE_FORMATO);
			} catch (IntegerOutOfRangeException ex) {
				stampa(String.format(INT_FUORI_INTERVALLO, minimo, massimo));
			}

		} while (!finito);

		return valoreLetto;
	}
	
	/**
	 * Legge un double inserito dal utente mostrando un messaggio passato come parametro
	 * @param messaggio da mostrare
	 * @return numero acquisito
	 */
	public static double leggiDouble(String messaggio) {
		boolean finito = false;
		double valoreLetto = 0;
		do {
			System.out.print(messaggio);
			if (lettore.hasNextDouble()) {
				valoreLetto = lettore.nextDouble();
				finito = true;
			} else {
				System.out.println(ERRORE_FORMATO);
				String daButtare = lettore.next();
			}
		} while (!finito);
		return valoreLetto;
	}
	
	/**
	 * Legge un double da tastiera dando come parametro un messaggio solo se
	 * il numero acquisito e maggiore o uguale al minimo passato come parametro
	 * @param messaggio da mostrare
	 * @param minimo double da poter acquisire
	 * @return double acqusito
	 */
	public static double leggiDoubleConMinimo(String messaggio, double minimo) {
		boolean finito = false;
		double valoreLetto = 0;
		do {
			valoreLetto = leggiDouble(messaggio);
			if (valoreLetto >= minimo)
				finito = true;
			else
				System.out.println(ERRORE_MINIMO + minimo);
		} while (!finito);

		return valoreLetto;
	}

	/**
	 * Visualizza messaggio e acquisice come risposta solo s o n
	 * 
	 * @param messaggio da mostrare
	 * @return true per si, false per no
	 */
	public static boolean siONo(String messaggio) {
		String risposta = null;
		boolean verifica = false;
		int ciclo = 0;
		do {
			risposta = leggiStringa(messaggio);
			if (risposta.equalsIgnoreCase(RISPOSTA_SI)) {
				verifica = true;
				ciclo = 1;
			} else if (risposta.equalsIgnoreCase(RISPOSTA_NO)) {
				verifica = false;
				ciclo = 1;
			}
			if (ciclo == 0)
				System.out.println(RISPOSTA_ERRATA);
		} while (ciclo == 0);
		return verifica;
	}

	/*
	 * public static boolean yesOrNo(String messaggio) { 
	 * String mioMessaggio =
	 * messaggio + "("+RISPOSTA_SI+"/"+RISPOSTA_NO+")"; char valoreLetto =
	 * leggiUpperChar(mioMessaggio,String.valueOf(RISPOSTA_SI)+String.valueOf(
	 * RISPOSTA_NO));
	 * 
	 * if (valoreLetto == RISPOSTA_SI) return true; else return false; }
	 */
}