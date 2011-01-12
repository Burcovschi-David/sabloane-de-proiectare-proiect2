package Arbori;

import visitor.*;

/**
 * Modeleaza un arbore functional
 * @author Ordog Dorottya
 *
 */
public class ArboreFunctional {
	
	private Nod radacina;
	
	public ArboreFunctional(Nod n){
		radacina=n;
	}
	public Nod getRadacina(){
		return radacina;
	}
	public void setRadacina(Nod n){
		radacina=n;
	}
	public void acceptVisitor(Visitor v){
		v.visit(radacina);
	}

}
