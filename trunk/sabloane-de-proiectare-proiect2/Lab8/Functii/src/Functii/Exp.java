package Functii;
import Operatori.Produs;

public class Exp extends Functie{

	public double calcul(double aux1){
		return Math.exp(aux1);
	}
	
	public static double Calcul(double aux1){
	return Math.exp(aux1);
	}
	
	public String derivare(){
		if (getFStang() == null)
			System.exit(1);
		return Produs.concatTermens(getFStang().derivare(),
				"e^"+getFStang().toString());	  
	}
	
	public double calculDerivata(){
		if (getFStang() == null)
			System.exit(1);
		return Produs.Calcul(getFStang().calculDerivata(),Math.pow(Math.E, getFStang().calcul()));
	}
	
	public String concatTermeni(String aux1)
	{
		String aux;
		int nrP;
		nrP = aux1.charAt(0) == '(' ? 0 : 2;
		aux = "pow";
		if (nrP != 0) aux += "(e,";
		aux += aux1;
		if (nrP != 0) aux += ")";
		return aux;
	}
	
	public static String concatTermens(String aux1)
	{
		String aux;
		int nrP;
		nrP = aux1.charAt(0) == '(' ? 0 : 2;
		aux = "pow";
		if (nrP != 0) aux += "(e,";
		aux += aux1;
		if (nrP != 0) aux += ")";
		return aux;
	}
	
}
