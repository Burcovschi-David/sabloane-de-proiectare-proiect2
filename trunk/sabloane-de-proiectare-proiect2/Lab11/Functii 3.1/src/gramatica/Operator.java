package gramatica;

import command.Validare;

/**
 * Gramatica pentru Operator
 * @author Ordog Dorottya
 *
 */
public class Operator implements Gramatica {
	
	/**
	 * un fel de context pentru clasa Operator
	 */
	private Validare val;
	
	public Operator(Validare v){
		this.val=v;
	}
	
	/**
	 * Prima regula pentru Operator (regula nr 4 in gramatica)
	 * <operator>:=+
	 * @return true daca operatorul primit prin parametru este operatorul plus
	 */
	public boolean regulaPlusValidare(String op){
		if(op.equals("+")) 
			return true;
		else return false;
	}
	
	/**
	 * A doua regula pentru Operator (regula nr 5 in gramatica)
	 * <operator>:=-
	 * @return true daca operatorul primit prin parametru este operatorul minus
	 */
	public boolean regulaMinusValidare(String op){
		if(op.equals("-")) 
			return true;
		else return false;
	}
	
	/**
	 * A treia regula pentru Operator (regula nr 6 in gramatica)
	 * <operator>:=*
	 * @return true daca operatorul primit prin parametru este operatorul produs
	 */
	public boolean regulaProdusValidare(String op){
		if(op.equals("*")) 
			return true;
		else return false;
	}
	
	/**
	 * A patra regula pentru Operator (regula nr 7 in gramatica)
	 * <operator>:=/
	 * @return true daca operatorul primit prin parametru este operatorul cat
	 */
	public boolean regulaCatValidare(String op){
		if(op.equals("/")) 
			return true;
		else return false;
	}
	
	/**
	 * Verifica daca a fost aplicata o regula Operator
	 * @return true daca a fost aplicata o regula Operator
	 */
	public boolean oriceRegulaValidare(String op){
		if(regulaPlusValidare(op)){
			val.adaugaRegula("4,");
			return true;
		}
		else if(regulaMinusValidare(op)){
			val.adaugaRegula("5,");
			return true;
		}
		else if(regulaProdusValidare(op)){
			val.adaugaRegula("6,");
			return true;
		}
		else if(regulaCatValidare(op)){
			val.adaugaRegula("7,");
			return true;
		}
		else return false;
	}

}
