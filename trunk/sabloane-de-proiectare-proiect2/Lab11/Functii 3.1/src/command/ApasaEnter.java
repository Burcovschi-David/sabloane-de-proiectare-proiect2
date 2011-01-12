package command;

import javax.swing.*;
import memento.*;
import stareCurenta.*;


/**
 * Apeleaza comenzile necesare in urma apasarii enter cand focusul este pe primul camp de editare in care este introdusa functia
 * @author Ordog Dorottya
 *
 */
public class ApasaEnter extends JTextField implements Command {

	private JTextField tf;
	
	public ApasaEnter(JTextField tf){
		this.tf=tf;
	}
	
	public void execute() {
		
		//validare text introdus
		Command validare=new Validare(this.getText());
		validare.execute();
		if(((Validare)validare).getRezultatValidare()){
			//JOptionPane.showMessageDialog(new JFrame(),"Validare reusita :) \n Regulile aplicate: "+((Validare)validare).getReguliAplicate());
			//construirea arborelui functional
			FabricaArboreFunctional fab=new FabricaArboreFunctional((Validare)validare);
			fab.execute();
			//setare arbore ca si starea curenta
			StareCurenta.stare.setArbore(fab.getArbore());
			//afisare derivata arborelui
			new DerivareSimbolica(tf,StareCurenta.stare.getArbore()).execute();
			
			//transformare arbore functional in arbore xml
			Command toArboreXML=new ToArboreXML(StareCurenta.stare.getArbore());
			toArboreXML.execute();
			//setare arbore xml in starea curenta
			StareCurenta.stare.setArboreXML(((ToArboreXML)toArboreXML).getArboreXML());
			//creeare si salvare document xml
			new ToFisierXML(StareCurenta.stare.getArboreXML()).execute();
			
			//salvare arbore functional in MemoryMemento
			MemoryMemento.m.setMemento(new Memento(StareCurenta.stare.getArbore()));
		}
		else {
			JOptionPane.showMessageDialog(new JFrame(),"Validare nereusita :( \n Nu uitati sa lasati spatii intre operatori si operanzi.");
		}
	}

}
