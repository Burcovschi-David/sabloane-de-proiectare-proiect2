package Functii;
import Arbori.Nod;


public abstract class Functie extends Nod {
	
	public double calcul(){
		if(getFStang()==null)
			System.exit(1);
		return this.calcul(getFStang().calcul());
	}
	public String toString(){
		if(getFStang()==null )
			System.exit(1);
		return this.concatTermeni(getFStang().toString());
	}
	
	public abstract double calcul(double aux1);
	public abstract String concatTermeni(String aux1);

}
