package Functii;
import Operatori.*;

public class Arcsin extends Functie{

	public double calcul(double aux1){
		return Math.asin(aux1);
	}
	
	public static double Calcul(double aux1){
		return Math.asin(aux1);
	}
	
	public String derivare(){
		if (getFStang()==null)
			System.exit(1);
		return Cat.concatTermens(getFStang().derivare(),"sqrt(1-"+getFStang().toString()+"^2)");
	}
	
	public double calculDerivata(){
		if (getFStang() == null)
			System.exit(1);
		return Cat.Calcul(getFStang().calculDerivata(),
				Math.sqrt(1-Math.pow(getFStang().calcul(), 2)));
	}
	
	public String concatTermeni(String aux1){
		String aux;
		int nrP;
		nrP = aux1.charAt(0) == '(' ? 0 : 2;
		aux = "arcsin";
		if (nrP != 0) aux += "(";
		aux += aux1;
		if (nrP != 0) aux += ")";
		return aux;
	}
	
	public static String concatTermens(String aux1){
		String aux;
		int nrP;
		nrP = aux1.charAt(0) == '(' ? 0 : 2;
		aux = "arcsin";
		if (nrP != 0) aux += "(";
		aux += aux1;
		if (nrP != 0) aux += ")";
		return aux;
	}
}


