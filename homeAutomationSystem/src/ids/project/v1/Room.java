package ids.project.v1;

import java.util.ArrayList;

public class Room {
	
	private String nameRoom;
	private ArrayList <Artifact> listOfArtifact;
	
	public Room (String nameRoom) {
		
		this.nameRoom = nameRoom;
		listOfArtifact = new ArrayList<>();
		
	}
	
	public void addArtifact (Artifact artifact) {
		
		listOfArtifact.add(artifact);
		
	}
	

}