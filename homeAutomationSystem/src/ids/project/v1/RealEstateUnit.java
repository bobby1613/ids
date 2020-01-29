package ids.project.v1;

import java.util.ArrayList;

public class RealEstateUnit {
	
	private String nameRealEstateUnit;
	private String type;
	private ArrayList <Room> room;
	private ArrayList <Artifact> artifact;
	
	public RealEstateUnit(String nameRealEstateUnit, String type) {
		
		this.nameRealEstateUnit = nameRealEstateUnit;
		this.type = type;
		room = new ArrayList<>();
		artifact = new ArrayList<>();
	}
}