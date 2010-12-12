package Functii;
import Arbori.Nod;


public class Necunoscuta extends Nod {
	
	public double calcul(){
		return getX();
	}
	public String derivare(){
		return "1";
	}
	public double calculDerivata(){
		return 1;
	}
	public String toString(){
		return "x";
	}

}
