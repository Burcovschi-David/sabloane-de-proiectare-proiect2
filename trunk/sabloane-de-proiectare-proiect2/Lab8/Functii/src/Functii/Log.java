package Functii;
import Operatori.*;

public class Log extends Functie {
	
	public double calcul(double aux1){
		return Math.log(aux1);
	}
	public static double Calcul(double aux1){
	  return Math.log(aux1);
	}
	
	public String derivare(){
	   if (getFStang() == null)
		   System.exit(1);
	   return Cat.concatTermens(getFStang().derivare(),
			getFStang().toString());
	}
	
	public double calculDerivata(){
		if (getFStang() == null)
			System.exit(1);
		return Produs.Calcul(getFStang().calculDerivata(),
				1/getFStang().calcul());
	}
	
	public String concatTermeni(String aux1){
		String aux;
		int nrP;
		nrP = aux1.charAt(0) == '(' ? 0 : 2;
		aux = "log";
		if (nrP != 0) aux += "(";
		aux += aux1;
		if (nrP != 0) aux += ")";
		return aux;
	}
	
	public static String concatTermens(String aux1)	{
		String aux;
		int nrP;
		nrP = aux1.charAt(0) == '(' ? 0 : 2;
		aux = "log";
		if (nrP != 0) aux += "(";
		aux += aux1;
		if (nrP != 0) aux += ")";
		return aux;
	}	
	
}
