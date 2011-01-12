package stareCurenta;

import Arbori.*;
import xml.*;

/**
 * Clasa care stocheaza arborele functional curent
 * @author Ordog Dorottya
 *
 */
public class StareCurenta {
	
	/**
	 * arborele functional aflat intr-un moment dat in memorie
	 */
	private ArboreFunctional arbore;
	/**
	 * arborele xml aflat intr-un moment dat in memorie
	 */
	private ArboreXML arboreXML;
	
	/**
	 * variabila statica de tipul clasei StareCurenta (folosita pentru implementarea sablonului Singleton)
	 */
	public static StareCurenta stare=new StareCurenta();
	
	/**
	 * constructor privat (folosita pentru implementarea sablonului Singleton)
	 */
	private StareCurenta(){
	}

	/**
	 * seteaza arborele functional din starea curenta
	 * @param arbore noul arbore functional care va incarcat in starea curenta
	 */
	public void setArbore(ArboreFunctional arbore) {
		this.arbore = arbore;
	}

	/**
	 * returneaza arborele functional la care se lucreaza la un moment dat
	 * @return arborele functional aflat in memorie
	 */
	public ArboreFunctional getArbore() {
		return arbore;
	}
	
	/**
	 * seteaza arborele xml din starea curenta
	 * @param arbore noul arbore xml care va incarcat in starea curenta
	 */
	public void setArboreXML(ArboreXML arbore) {
		this.arboreXML = arbore;
	}

	/**
	 * returneaza arborele xml la care se lucreaza la un moment dat
	 * @return arborele xml aflat in memorie
	 */
	public ArboreXML getArboreXML() {
		return arboreXML;
	}
}
