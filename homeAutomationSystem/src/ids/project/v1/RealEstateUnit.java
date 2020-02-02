package ids.project.v1;

import java.util.ArrayList;

public class RealEstateUnit {
	
	private String nameRealEstateUnit;
	private ArrayList <Room> listOfRoom;
	private ArrayList <Artifact> listOfArtifact;
	private int counterRoom;
	private int counterArtifactUnit;
	
	public RealEstateUnit(String nameRealEstateUnit) {
		
		this.nameRealEstateUnit = nameRealEstateUnit;
		listOfRoom = new ArrayList<>();
		listOfArtifact = new ArrayList<>();
		counterRoom = 0;
		counterArtifactUnit = 0;
	}

	/**
	 * @return the nameRealEstateUnit
	 */
	public String getNameRealEstateUnit() {
		return nameRealEstateUnit;
	}

	/**
	 * @return the room
	 */
	public ArrayList<Room> getRoom() {
		return listOfRoom;
	}

	/**
	 * @return the artifact
	 */
	public ArrayList<Artifact> getArtifact() {
		return listOfArtifact;
	}

	/**
	 * @return the counterRoom
	 */
	public int getCounterRoom() {
		return counterRoom;
	}

	/**
	 * @return the counterArtifact
	 */
	public int getCounterArtifact() {
		return counterArtifactUnit;
	}

	/**
	 * @param nameRealEstateUnit the nameRealEstateUnit to set
	 */
	public void setNameRealEstateUnit(String nameRealEstateUnit) {
		this.nameRealEstateUnit = nameRealEstateUnit;
	}

	/**
	 * aggiunge una stanza all'unità immobliare
	 * @param room
	 */
	
	public void addRoom(Room room) {
		listOfRoom.add(room);
		counterRoom++;
	}
	
	/**
	 * rimuove una stanza daal'unità immobiliare
	 * @param room
	 */
	
	public void removeRoom(Room room) {
		listOfRoom.remove(room);
		counterRoom--;
	}
	
	/**
	 * aggiunge un artefatto all'unità immobliare
	 * @param artifact
	 */
	
	public void addArtifact(Artifact artifact) {
		listOfArtifact.add(artifact);
		counterArtifactUnit++;
	}
	
	/**
	 * rimuove un artefatto dalla stanza
	 * @param artifact
	 */
	
	public void removeArtifact(Artifact artifact) {
		listOfArtifact.remove(artifact);
		counterArtifactUnit--;
	}
	
	
	
	
	
}