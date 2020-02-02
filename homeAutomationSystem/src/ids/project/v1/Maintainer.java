package ids.project.v1;

import ids.project.myclass.*;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Maintainer implements User { 
	
	@Override
	public void login() throws IOException {
		// TODO Auto-generated method stub
		String categorySensorInsert = InputOutput.leggiStringa("Inserisci una categoria di sensori:\n ");
		
		FileWriter file = new FileWriter("prova.txt");
		BufferedWriter buffer = new BufferedWriter(file);
		buffer.write(categorySensorInsert);
		String categoryActuatorInsert = InputOutput.leggiStringa("Inserisci una categoria di attuatori:\n ");
		buffer.write(categoryActuatorInsert);
		
		
		
		
				
		
	}
	
	
	 

}