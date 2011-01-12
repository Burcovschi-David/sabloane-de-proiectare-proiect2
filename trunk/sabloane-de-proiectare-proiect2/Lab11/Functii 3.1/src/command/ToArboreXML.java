package command;

import visitor.*;
import Arbori.*;
import xml.*;

 /**
 * Clasa care raspunde de transformarea unui arbore functional in arbore xml
 * @author Ordog Dorottya
 *
 */

public class ToArboreXML implements Command {

	/**
	 * arborele functional care va fi transformat
	 */
	private ArboreFunctional arbore;
	/**
	 * arborele XML care rezulta din urma transformarii
	 */
	private ArboreXML arboreXML;
	
	ToArboreXML(ArboreFunctional arbore){
		this.arbore=arbore;
	}
	
	/**
	 * functia care creeaza un visitor care parcurge arborele functional si salveaza arborele xml in variabila arboreXML
	 */
	public void execute() {
		Visitor visitor=new ToArboreXMLVisitor();
		arbore.acceptVisitor(visitor);
		arboreXML=new ArboreXML(((ToArboreXMLVisitor)visitor).getTagXML());
	}
	
	/**
	 * 
	 * @return arborele XML rezultat
	*/	
	public ArboreXML getArboreXML() {
		return arboreXML;
	}

}
