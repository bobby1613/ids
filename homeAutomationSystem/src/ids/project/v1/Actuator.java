package ids.project.v1;
/**
 * La classe Actuator implementa l'interfaccia Device con i suoi metodi. Ogni sensore ha un attributo booleano "state"
 * che nella prima versione vale sempre true per default.
 * @author bobby
 *
 */


public class Actuator implements Device {
	
	private CategoryActuator category;
	private String name;
	private boolean state = true; // nella prima versione gli attuatori devono essere sempre attivi
	private String[] infoConstructor; //LUNGHEZZA MASSIMA
	private int id;
	
	public Actuator (String name, int id, CategoryActuator category) {
		
		this.name = name + "_" + category.getNameCategory();
		infoConstructor = new String[180];
		this.id = id;
		this.category = category;
		 
	}
	
	public Actuator (String name, int id) {
		
		this.name = name;
		infoConstructor = new String[180];
		this.id = id;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Imposta l'attributo category solo se non è già impostato e aggiorna name come da requisiti
	 * @param category
	 */
	public void setCategory(CategoryActuator category) {
		
		if (this.category == null) {
			this.category = category;
			this.name = this.name + "_" + this.category.getNameCategory();		
			}
		else
			System.out.println("la categoria gia impostaaaaata");//ECCEZIONE
	}
	
	/**
	 * @return category object
	 */
	public CategoryActuator getCategory() {
		return category;
	}
	
	/**
	 * 
	 * @return infoConstructor
	 */
	public String[] getInfoConstructor() {
		return this.infoConstructor;
	}
	
//	@Override VERSIONE 1 NN SERVONO
//	public void setOn() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void setOff() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public boolean status() {
		return this.state;
	}
	
	@Override
	public String toString() {
		return "";//DA FAREEEEEEEEEEEEEEEEEEEEEE
	}
	 
}
