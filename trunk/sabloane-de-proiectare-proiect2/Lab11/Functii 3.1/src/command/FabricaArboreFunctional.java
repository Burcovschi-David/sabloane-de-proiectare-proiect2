package command;

import java.util.StringTokenizer;

import Arbori.*;
import Functii.*;
import Operatori.*;

/**
 * Clasa care raspunde de construirea arborelui functional pe baza textului introdus in campul de editare
 * @author Ordog Dorottya
 *
 */

public class FabricaArboreFunctional implements Command {
	
	/**
	 * arborele functional construit din functia introdusa (initial nula)
	 */
	private ArboreFunctional arbore;
	/**
	 * obiect de tip Validare care contine textul validat si succesiunea de reguli aplicate
	 */
	private Validare val;

	FabricaArboreFunctional(Validare val){
		this.val=val;
	}
	
	/**
	 * functie pentru obtinerea arborelui functional construit
	 * @return arborele functional
	 */
	public ArboreFunctional getArbore() {
		return arbore;
	}

	/**
	 * functia care construieste arborele functional
	 */
	public void execute() {
		//cream un tablou cu reguli
		//tokenizare pe baza delimitatorului ',' 
		StringTokenizer st=new StringTokenizer(val.getReguliAplicate(),","); 	
		String reguli[]=new String[10];
		int nrReguli=0;
		while(st.hasMoreTokens())
			reguli[nrReguli++]=st.nextToken();
		//cream arborele de jos in sus
		//tabloul noduri va contine nodurile care inca nu au nod parinte
		//capacitatea maxima a tabloului corespunde cu numarul maxim de noduri de pe nivelul cel mai de jos al arborelui
		// care poate fi construit
		Nod noduri[]=new Nod[10];
		int nrNoduri=0;
		for(int i=0;i<nrReguli;i++){
			if(reguli[i].equals("10")){
				noduri[nrNoduri++]=new Necunoscuta();
			}
			else if(reguli[i].startsWith("11")){
				noduri[nrNoduri++]=new Constanta(Double.parseDouble(reguli[i].substring(reguli[i].indexOf(' ')+1)));
			}
			else if(reguli[i].equals("8")){
				noduri[nrNoduri++]=new Sin();
			}
			else if(reguli[i].equals("9")){
				noduri[nrNoduri++]=new Cos();
			}
			else if(reguli[i].equals("4")){
				noduri[nrNoduri++]=new Plus();
			}
			else if(reguli[i].equals("5")){
				noduri[nrNoduri++]=new Minus();
			}
			else if(reguli[i].equals("6")){
				noduri[nrNoduri++]=new Produs();
			}
			else if(reguli[i].equals("7")){
				noduri[nrNoduri++]=new Cat();
			}
			else if(reguli[i].equals("1")){
				noduri[nrNoduri-1].setFStang(noduri[nrNoduri-2]);
				noduri[nrNoduri-1].setFDrept(noduri[nrNoduri-3]);
				arbore=new ArboreFunctional(noduri[nrNoduri-1]);
			}
			else if(reguli[i].equals("2")){
				noduri[nrNoduri-1].setFStang(noduri[nrNoduri-2]);
				noduri[nrNoduri-1].setFDrept(null);
				arbore=new ArboreFunctional(noduri[nrNoduri-1]);
			}
			else if(reguli[i].equals("3")){
				noduri[nrNoduri-1].setFStang(null);
				noduri[nrNoduri-1].setFDrept(null);
				arbore=new ArboreFunctional(noduri[nrNoduri-1]);
			}
		}
		
	}

	

}
