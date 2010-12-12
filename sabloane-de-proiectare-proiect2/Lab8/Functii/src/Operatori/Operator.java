package Operatori;
import Arbori.*;

public abstract class Operator extends Nod {
	
	public double calcul(){
		if(getFStang()==null || getFDrept()==null)
			System.exit(1);
		return this.calcul(getFStang().calcul(),getFDrept().calcul());
	}
	public String toString(){
		if(getFStang()==null || getFDrept()==null)
			System.exit(1);
		return this.concatTermeni(getFStang().toString(),getFDrept().toString());
	}
	
	public abstract double calcul(double aux1,double aux2);
	public abstract String concatTermeni(String aux1,String aux2);

}
