package Functii;
import Operatori.Produs;

public class Putere extends Functie{
	
	public static double putere=2;
	
	public double calcul(double aux1){
		return Math.pow(aux1,putere);
	}
	
	public static double Calcul(double aux1){
		return Math.pow(aux1,putere);
	}
	
	public String derivare(){
		if (getFStang() == null)
			System.exit(1);
		return Produs.concatTermens(getFStang().derivare(),
				Double.toString(putere)+"*"+getFStang().toString()+"^"+Double.toString(putere-1));
	}
	
	public double calculDerivata(){
		if (getFStang() == null)
			System.exit(1);
		return Produs.Calcul(getFStang().calculDerivata(),putere*Math.pow(getFStang().calcul(), putere-1));
	}
	
	public String concatTermeni(String aux1){
		String aux;
		int nrP;
		nrP = aux1.charAt(0) == '(' ? 0 : 2;
		aux = "pow";
		if (nrP != 0) aux += "(";
		aux += aux1;
		if (nrP != 0) aux += ")";
		return aux;
	}
	
	public static String concatTermens(String aux1)	{
		String aux;
		int nrP;
		nrP = aux1.charAt(0) == '(' ? 0 : 2;
		aux = "pow";
		if (nrP != 0) aux += "(";
		aux += aux1;
		if (nrP != 0) aux += ")";
		return aux;
	}
	
}

