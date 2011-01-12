package command;

import javax.swing.*;
import memento.*;
import Arbori.*;

/**
 * Clasa care implementeaza comportamentul butonului Undo
 * @author Ordog Dorottya
 *
 */
public class Undo extends JButton implements Command {

	/**
	 * campul de editare unde va fi afisata functia anterioara
	 */
	private JTextField tf;
	
	public Undo(JTextField tf){
		this.tf=tf;
	}
	
	/**
	 * Metoda care afiseaza functia anterioara
	 */
	public void execute() {
		if(MemoryMemento.pozitieCurenta>0){			
			//extragere arbore functional din lista de memento-uri
			ArboreFunctional a=MemoryMemento.m.getMementoUndo().getMemento();
			//parcurgere cu ToString care foloseste ToStringVisitor
			tf.setText(new ToString(a).getFunctie());
        }
		else {
			MemoryMemento.pozitieCurenta=0;//setam pe primul element
			JOptionPane.showMessageDialog(new JFrame(),"Nu se poate aplica UNDO");
		}
	}

}
