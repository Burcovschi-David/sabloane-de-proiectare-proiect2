package Functii;

public class Exp extends Functie{
	
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
