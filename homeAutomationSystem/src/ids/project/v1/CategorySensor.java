package ids.project.v1;

import java.util.ArrayList;

public class CategorySensor extends Category {
		
	private ArrayList<DetectableInformation> informations;
	
	public CategorySensor(String nameCategory, String infoConstructor) {
		
		super(nameCategory, infoConstructor);
	}
	
	//preconditions:nella prima versione ogni categoria di sensore misura al massimo una grandezza fisica
	public void addInformation(DetectableInformation information) {
		if (this.informations.isEmpty()) {
			this.informations.add(information);	
		} else
			System.out.println("array pieno"); //lancia eccezione?
	}	
	
	public boolean getType() {//preconditions array non vuoto
		return this.informations.get(0).isOnOffType();
	}
	
	
	

}
