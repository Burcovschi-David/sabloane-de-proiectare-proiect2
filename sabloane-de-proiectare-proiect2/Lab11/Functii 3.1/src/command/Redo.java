package command;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Arbori.ArboreFunctional;

import memento.MemoryMemento;

/**
 * Clasa care implementeaza comportamentul butonului Redo
 * @author Ordog Dorottya
 *
 */
public class Redo extends JButton implements Command  {

	/**
	 * campul de editare unde va fi afisata functia urmatoare
	 */
	private JTextField tf;
	
	public Redo(JTextField tf){
		this.tf=tf;
	}
	
	/**
	 * Metoda care afiseaza functia urmatoare
	 */
	public void execute() {
		 if(MemoryMemento.m.getSize()-1<=MemoryMemento.pozitieCurenta){
	            MemoryMemento.pozitieCurenta=MemoryMemento.m.getSize()-1;//setam pe ultimul element
	            JOptionPane.showMessageDialog(new JFrame(),"Nu se poate aplica REDO");
	        }
	        else {
	        	//extragere arbore functional din lista de memento-uri
				ArboreFunctional a=MemoryMemento.m.getMementoRedo().getMemento();
				//parcurgere cu ToString care foloseste ToStringVisitor
				tf.setText(new ToString(a).getFunctie());
	        }
	}

}
