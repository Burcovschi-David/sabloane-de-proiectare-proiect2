package command;

import javax.swing.*;
import Arbori.*;
import visitor.*;

/**
 * Clasa care raspunde de calculul valorii functiei
 * @author Ordog Dorottya
 *
 */
public class CalculFunctie implements Command {

	/**
	 * arborele functional a functiei a carei valoare va fi calculata in punctul dat
	 */
	private ArboreFunctional arbore;
	/**
	 * campul de editare in care va fi afisata valoarea functiei
	 */
	private JTextField ta;
	/** 
	 * valoarea necunoscutei
	 */
	private double x;
	
	CalculFunctie(JTextField ta, ArboreFunctional arbore, double x){
		this.ta=ta;
		this.arbore=arbore;
		this.x=x;
	}
	
	/**
	 * functia care creeaza un visitor care parcurge arborele functional si calculeaza valoarea functiei
	 */
	public void execute() {
		Visitor visitor=new CalculVisitor(x);
		arbore.acceptVisitor(visitor);
		ta.setText(String.valueOf(((CalculVisitor)visitor).getRezultat()));
	}

}