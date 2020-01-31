package ids.project.myclass;


/**
 * Costruisce un oggetto Menu composto da un titolo e un numero variabile di
 * opzioni
 * 
 * @author bobby
 *
 */
public class MyMenu {

	private String titolo;
	private String[] opzioni;

	private final static String SCEGLI_OPZIONE = "Inserisci il numero del opzione scelta";
	private final static String ESCI = "0\tEsci";
	private final static String BORDI = "*************************************";
	private final static String ERRORE_OPZ = "Opzione inesistente!";
	private final static String NUOVA_SCELTA = "Inserire nuovamente";
	private final static String MESS_USCITA = "Vuoi veramente uscire ?s\\n";

	/**
	 * Costruisce un oggetto menu composto da un titolo e un array di opzioni
	 * 
	 * @param titolo titolo del menu
	 * @param opzioni array di stringhe
	 */
	public MyMenu(String titolo, String ...opzioni) {
		this.titolo = titolo;
		this.opzioni = opzioni;
	}

	/**
	 * Stampa il menu con le rispettive opzioni numerate
	 */
	public void stampaMenu() {
		System.out.println(BORDI);
		System.out.println("\t" + titolo);
		for (int i = 0; i < opzioni.length; i++) {
			System.out.println((i + 1) + "\t" + opzioni[i]);
			if (i == opzioni.length - 1) {
				System.out.println(ESCI);
				System.out.println(BORDI);
			}
		}
		System.out.println();
	}

	/**
	 * Verifica la validità dell'opzione scelta per ogni menu; chiede conferma
	 * in caso di uscita
	 * 
	 * @return opzione scelta
	 */
	public int scegliOpzione() {
		boolean valida = false;
		int scelta;
		boolean esci = false;
		stampaMenu();
		System.out.println(SCEGLI_OPZIONE);
		do {
			scelta = InputOutput.leggiIntero();
			if (sceltaValida(scelta))
				valida = true;
			else if (scelta == 0) {
				esci = InputOutput.siONo(MESS_USCITA);
				if (esci)
					valida = true;
				else {
					stampaMenu();
				}
			} else {
				System.out.println(ERRORE_OPZ);
				System.out.println(NUOVA_SCELTA);
			}
		} while (!valida);
		return scelta;
	}

	/**
	 * Verifica se l'opzione scelta rientra fra quelle disponbili, ovvero
	 * compresa fra 0 e opzioni.lenght
	 * 
	 * @param scelta opzione del menu
	 * @return true o false
	 */
	public boolean sceltaValida(int scelta) {
		boolean verifica = false;
		for (int i = 1; i <= opzioni.length; i++) {
			if (scelta == i)
				verifica = true;
		}
		return verifica;
	}

}