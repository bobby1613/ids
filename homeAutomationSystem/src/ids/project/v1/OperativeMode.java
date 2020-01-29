package ids.project.v1;
/**
 * La classe modalità operativa fornisce informazioni sulle azioni che gli attuatori possono svolgere. 
 * Ci sono due tipi di modalità: parametriche e non parametriche. Nella versione 1 ogni modalità è per default 
 * non parametrica.
 * @author bobby
 *
 */
public class OperativeMode {
		
	private String name;
	private boolean parametric=false;
	private float maxParam;
	private float minParam;
	private float parameter;
	
	public OperativeMode(String name) {
		this.name=name;
		this.parametric=false;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return parametric
	 */
	public boolean isParametric() {
		return this.parametric;
	}
	


}
