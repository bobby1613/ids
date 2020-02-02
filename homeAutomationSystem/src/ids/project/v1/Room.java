package ids.project.v1;

import java.util.ArrayList;

public class Room {
	
	private String nameRoom;
	private ArrayList <Artifact> listOfArtifact;
	private int counterArtifact;
	
	public Room (String nameRoom) {
		
		this.nameRoom = nameRoom;
		listOfArtifact = new ArrayList<>();
		counterArtifact = 0;
		
	}
	
	
	
	/**
	 * @return the nameRoom
	 */
	public String getNameRoom() {
		return nameRoom;
	}



	/**
	 * @return the listOfArtifact
	 */
	public ArrayList<Artifact> getListOfArtifact() {
		return listOfArtifact;
	}



	/**
	 * @return the counterArtifact
	 */
	public int getCounterArtifact() {
		return counterArtifact;
	}



	/**
	 * @param nameRoom the nameRoom to set
	 */
	public void setNameRoom(String nameRoom) {
		this.nameRoom = nameRoom;
	}



	/**
	 * @param listOfArtifact the listOfArtifact to set
	 */
	public void setListOfArtifact(ArrayList<Artifact> listOfArtifact) {
		this.listOfArtifact = listOfArtifact;
	}



	/**
	 * @param counterArtifact the counterArtifact to set
	 */
	public void setCounterArtifact(int counterArtifact) {
		this.counterArtifact = counterArtifact;
	}

	/**
	 * aggiunge un artefatto alla stanza
	 * @param artifact
	 */

	public void addArtifact (Artifact artifact) {
		
		listOfArtifact.add(artifact);
		counterArtifact++;
		
	}
	
	
	/**
	 * rimuovi artefatto dalla stanza
	 * @param artifact
	 */
	
	public void removeArtifact(Artifact artifact) {
		
		listOfArtifact.remove(artifact);
		counterArtifact--;
	}



	@Override
	public String toString() {
		return "Room [nameRoom=" + nameRoom + ", listOfArtifact=" + listOfArtifact + ", counterArtifact="
				+ counterArtifact + "]";
	}
	
	
	

}