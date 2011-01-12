package command;

import javax.swing.*;
import Arbori.*;
import visitor.*;

/**
 * Clasa care raspunde de calculul valorii functiei
 * @author Ordog Dorottya
 *
 */
public class CalculDerivata implements Command {

	/**
	 * arborele functional pentru care se va calcula valoarea derivatei 
	 */
	private ArboreFunctional arbore;
	/**
	 * campul de editare in care va fi afisata valoarea derivatei
	 */
	private JTextField ta;
	/** 
	 * valoarea necunoscutei
	 */
	private double x;
	
	CalculDerivata(JTextField ta, ArboreFunctional arbore, double x){
		this.ta=ta;
		this.arbore=arbore;
		this.x=x;
	}
	
	/**
	 * functia care creeaza un visitor care parcurge arborele functional si calculeaza valoarea derivatei
	 */
	public void execute() {
		Visitor visitor=new DerivataCalculVisitor(x);
		arbore.acceptVisitor(visitor);
		ta.setText(String.valueOf(((DerivataCalculVisitor)visitor).getRezultat()));
	}

}
