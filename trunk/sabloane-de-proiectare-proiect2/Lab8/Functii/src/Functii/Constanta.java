package Functii;
import Arbori.Nod;


public class Constanta extends Nod {

	private double ct;
	
	public Constanta(double ct){
		this.ct=ct;
	}
	public double calcul(){
		return ct;
	}
	public double calculDerivata(){
		return 0;
	}
	public String derivare(){
		return "0";
	}
	public String toString(){
		return String.valueOf(ct);
	}
}
