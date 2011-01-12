package command;

import javax.swing.*;

import stareCurenta.StareCurenta;
import grafic.*;

/**
 * Clasa responsabila cu desenarea graficului functiei
 * @author Ordog Dorottya
 *
 */

public class Grafic extends JButton implements Command  {

	/**
	 * Metoda care deseneaza graficul functiei
	 */
	public void execute() {
		if(StareCurenta.stare.getArbore()==null)
			JOptionPane.showMessageDialog(new JFrame(),"Nu se gaseste functia!");
		else DesenGrafic.creeareApplet();
	}

}
