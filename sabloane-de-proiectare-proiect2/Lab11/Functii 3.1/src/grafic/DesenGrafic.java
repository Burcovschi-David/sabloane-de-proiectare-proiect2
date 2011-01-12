package grafic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import command.*;
import stareCurenta.*;
import visitor.*;
import Arbori.*;

/**
 * Clasa care creeaza un applet cu graficul functiei
 * @author Ordog Dorottya
 *
 */

public class DesenGrafic extends JApplet {
		
	public void init(){
		this.resize(350,250);
	}
	
	public void paint(Graphics g){		
		//afisare functie
		g.setColor(Color.BLACK);
		ArboreFunctional arbore=StareCurenta.stare.getArbore();
		g.drawString("f(x)="+new ToString(arbore).getFunctie(),250,50);
		g.drawLine(0,1,200,1);
		g.drawLine(200,1,180,10);
		g.drawString("X",200,15);
		g.drawLine(3,1,3,200);
		g.drawLine(3,200,10,180);
		g.drawString("Y",5, 220);
		for(int x=0;x<=200;x++){
			Visitor visitor=new CalculVisitor(x);
			arbore.acceptVisitor(visitor);
			int y=(int)((CalculVisitor)visitor).getRezultat();
			g.fillOval(x,y,2,2);
		}	
	}	

		public static JFrame creeareApplet() {
			DesenGrafic applet = new DesenGrafic();
			JFrame f = new JFrame("Graficul functiei");
			f.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					 e.getWindow().dispose();
				}
			});
			f.setSize (350, 270);
			f.setLocation(500,300);
			f.add(applet , BorderLayout.CENTER);
			applet.init ();
			applet.start ();
			f.setVisible (true);
			return f;
		}
	

}
