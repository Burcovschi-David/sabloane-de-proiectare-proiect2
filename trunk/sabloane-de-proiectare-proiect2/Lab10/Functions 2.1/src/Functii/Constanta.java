package Functii;

import Arbori.*;
/**
 * Modeleaza o constanta de tip real
 * @author Ordog Dorottya
 *
 */
public class Constanta extends Nod {

	private double ct;
	
	public Constanta(double ct){
		this.ct=ct;
	}
	public double getCt(){
		return ct;
	}
	public void setCt(double ct){
		this.ct=ct;
	}
}
