package ids.project.v1;

/**
 * La classe Sensor implementa l'interfaccia Device con i suoi metodi. Ogni sensore ha un attributo booleano "state"
 * che nella versione 1 vale sempre true per default.
 * @author andrian
 *
 */

import java.util.Random;

public class Sensor implements Device {

	private CategorySensor category;
	private String name;
	private boolean state = true;
	private String infoConstructor; //LUNGHEZZA MASSIMA
	private int id;
	private static final Random rand = new Random();
	
	public Sensor(String name, String infoConstructor, int id, CategorySensor category) {
		
		this.name = name + "_" + category.getNameCategory();
		this.infoConstructor = infoConstructor;
		this.id = id;
		this.category = category;
	}
	
	public Sensor(String name, String genericInfo, int id) {
		
		this.name = name;
		this.infoConstructor = genericInfo;
		this.id = id;
	}
	
	/**
	 * Imposta l'attributo category solo se non è già impostato e aggiorna name come da requisiti
	 * @param category
	 */
	public void setCategory(CategorySensor category) {
		
		if (this.category == null) {
			this.category = category;
			this.name = this.name+"_" + this.category.getNameCategory();		
			}
		else
			System.out.println("Categoria gia impostata");//ECCEZIONE
	}
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return this.name;//precondidions?nome gia impostato?
	}
	
	/**
	 * 
	 * @return id
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * @return category object
	 */
	public CategorySensor getCategory() {
		return category;
	}
	
	/**
	 * 
	 * @return infoConstructor
	 */
	public String getInfoConstructor() {
		return this.infoConstructor;
	}
	
//	@Override VERSIONE 1 NON SERVONO
//	public void setOn() {
//		this.state=true;
//	}
//
//	@Override
//	public void setOff() {
//		this.state=false;		
//	}

	@Override
	public boolean status() {
		return this.state;
	}
	
	/**
	 * Metodo usabile da un sensore di una categoria che rileva informazioni di tipo onOff, 
	 * Ritorna un valore boolean casuale
	 * @return
	 */
	public boolean checkObstacle() { //precondizione categoria:on off
		if(this.category.getType()) {
			return this.rand.nextBoolean();
		}
		else return false;//CONTROLLA		
	}
	/**
	 * Ritorna 
	 * @return
	 */
	public double instaMeasure() { //precondizione categoria:grandezza fisica
		return 1.0  ; //ASSEGNA CASUALMENTE
	}
	
	
	@Override
	public String toString() {
		return "";//DA FAREEEEEEEEEEEEEEEEEEEEEE
	}
	
}
