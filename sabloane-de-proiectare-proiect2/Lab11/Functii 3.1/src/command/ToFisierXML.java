package command;

import java.io.IOException;

import visitorXML.*;
import xml.*;

/**
 * Clasa care raspunde de transformarea unui arbore xml in document xml
 * @author Ordog Dorottya
 *
 */

public class ToFisierXML implements Command {

	/**
	 * arborele xml care va fi transformat
	 */
	private ArboreXML arboreXML;
	/**
	 * variabila statica care se foloseste la generarea numelor documentelor xml
	 */
	private static int numar=0;
	
	ToFisierXML(ArboreXML arbore){
		this.arboreXML=arbore;
	}
	
	/**
	 * functia care creeaza un visitor care parcurge arborele xml si creeaza documentul xml
	 */
	public void execute() {		
		try {
			ToFisierXML.numar++;
			VisitorXML fv=new ToFisierXMLVisitorXML("Functia"+ToFisierXML.numar+".xml");
			arboreXML.acceptVisitor(fv); 
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}