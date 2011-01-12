package command;

import javax.swing.*;
import stareCurenta.*;


/**
 * Apeleaza comenzile necesare in urma apasarii enter cand focusul este pe al treilea camp de editare in care este introdusa o valoare reala
 * @author Ordog Dorottya
 *
 */
public class ApasaEnterVal extends JTextField implements Command {

	private JTextField tf1,tf2;
	
	public ApasaEnterVal(JTextField tf1,JTextField tf2){
		this.tf1=tf1;
		this.tf2=tf2;
	}
	
	public void execute() {
		
		//validare text introdus
		try{
			double numar=Double.parseDouble(this.getText());			
			if(StareCurenta.stare.getArbore()==null)
				JOptionPane.showMessageDialog(new JFrame(),"Nu s-a gasit functia!");
			else {
				//calcul valoarea functiei in punctul introdus				
				new CalculFunctie(tf1,StareCurenta.stare.getArbore(),numar).execute();
				//calcul valoarea derivatei in punctul introdus
				new CalculDerivata(tf2,StareCurenta.stare.getArbore(),numar).execute();
			}
		}
		catch(Exception e){			
			JOptionPane.showMessageDialog(new JFrame(),"Introduceti un numar real!");
		}
	}

}
