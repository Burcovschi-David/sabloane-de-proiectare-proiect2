package gramatica;

import command.Validare;

/**
 * Gramatica pentru Functie
 * @author Ordog Dorottya
 *
 */
public class Functie implements Gramatica {
	
	/**
	 * un fel de context pentru clasa Functie
	 */
	private Validare val;
	
	public Functie(Validare v){
		this.val=v;
	}

	/**
	 * Prima regula pentru Functie (regula nr 8 in gramatica)
	 * <functie>:=sin
	 * @return true daca functia primita prin parametru este functia sin
	 */
	public boolean regulaSinValidare(String op){
		if(op.toLowerCase().equals("sin")) 
			return true;
			else return false;
	}
	
	/**
	 * A doua regula pentru Functie (regula nr 9 in gramatica)
	 * <functie>:=cos
	 * @return true daca functia primita prin parametru este functia cos
	 */
	public boolean regulaCosValidare(String op){
		if(op.toLowerCase().equals("cos")) 
			return true;
			else return false;
	}
	
	/**
	 * Verifica daca a fost aplicata o regula Functie
	 * @return true daca a fost aplicata o regula Functie
	 */
	public boolean oriceRegulaValidare(String op) {
		if(regulaSinValidare(op)){
			val.adaugaRegula("8,");
			return true;
		}
		else if(regulaCosValidare(op)){
			val.adaugaRegula("9,");
			return true;
		}
		else return false;
	}

}
