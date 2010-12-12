package Arbori;


public class ArboreFunctional {
	
	private Nod radacina;
	
	public ArboreFunctional(Nod n){
		radacina=n;
	}
	public double calculezValoare(double x){
		radacina.setX(x);
		return radacina.calcul();
	}
	public String toString(){
		return radacina.toString();
	}
	public String derivata(){
		return radacina.derivare();
	}
	public double calculezDerivata(double x){
		radacina.setX(x);
		return radacina.calculDerivata();
	}

}
