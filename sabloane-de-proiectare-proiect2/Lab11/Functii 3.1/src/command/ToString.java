package command;

import javax.swing.*;
import Arbori.*;
import visitor.*;

/**
 * Clasa care raspunde de afisarea functiei
 * @author Ordog Dorottya
 *
 */
public class ToString implements Command {

	/**
	 * arborele functional a functiei care va afisata
	 */
	private ArboreFunctional arbore;
	/**
	 * Stringul in care se va salva rezultatul parcurgerii
	 */
	private String functie;
	
	public ToString(ArboreFunctional arbore){
		this.arbore=arbore;
	}
	
	/**
	 * functia care creeaza un visitor care parcurge arborele si salveaza intr-un string rezultatul
	 */
	public void execute() {
		Visitor visitor=new ToStringVisitor();
		arbore.acceptVisitor(visitor);
		functie=((ToStringVisitor)visitor).getS();
	}
	
	/**
	 * 
	 * @return functia sub forma unui sir de caractere
	 */
	public String getFunctie(){
		execute();
		return functie;
	}

}
