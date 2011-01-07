package Functii;

import Operatori.Cat;

public class Arcctg extends Functie{

	public double calcul(double aux1){
		return 1/Math.atan(aux1);
	}
	
	public static double Calcul(double aux1){
		return 1/Math.atan(aux1);
	}
	
	public String derivare(){
		if (getFStang() == null)
			System.exit(1);
		return Cat.concatTermens("(-"+getFStang().derivare()+")","(1+"+getFStang().toString()+"^2)");
	}
	
	public double calculDerivata()
	{
		if (getFStang() == null)
			System.exit(1);
		return Cat.Calcul(-1*getFStang().calculDerivata(),
				1+Math.pow(getFStang().calcul(), 2));
	}
	
	public String concatTermeni(String aux1)
	{
		String aux;
		int nrP;
		nrP = aux1.charAt(0) == '(' ? 0 : 2;
		aux = "arcctg";
		if (nrP != 0) aux += "(";
		aux += aux1;
		if (nrP != 0) aux += ")";
		return aux;
	}
	
	public static String concatTermens(String aux1)
	{
		String aux;
		int nrP;
		nrP = aux1.charAt(0) == '(' ? 0 : 2;
		aux = "arcctg";
		if (nrP != 0) aux += "(";
		aux += aux1;
		if (nrP != 0) aux += ")";
		return aux;
	}
	
	
}

