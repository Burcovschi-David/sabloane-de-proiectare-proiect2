package command;

import javax.swing.*;
import Arbori.*;
import visitor.*;

/**
 * Clasa care raspunde de derivarea simbolica a unei functii
 * @author Ordog Dorottya
 *
 */
public class DerivareSimbolica implements Command {

	/**
	 * arborele functional a functiei care va fi derivata
	 */
	private ArboreFunctional arbore;
	/**
	 * campul de editare in care va fi afisata derivata simbolica a functiei
	 */
	private JTextField ta;
	
	DerivareSimbolica(JTextField ta, ArboreFunctional arbore){
		this.ta=ta;
		this.arbore=arbore;
	}
	
	/**
	 * functia care creeaza un visitor care parcurge arborele si salveaza intr-un string derivata acestuia
	 */
	public void execute() {
		Visitor visitor=new DerivareVisitor();
		arbore.acceptVisitor(visitor);
		ta.setText(((DerivareVisitor)visitor).getS());
	}

}
