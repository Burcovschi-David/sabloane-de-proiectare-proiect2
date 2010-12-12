package Functii;
import Operatori.*;

public class Sin extends Functie {
	
	public double calcul(double aux1){
		return Math.sin(aux1);
	}
	
	public static double Calcul(double aux1){
		return Math.sin(aux1);
	}
		
	public String derivare(){
		if(getFStang()==null)
			System.exit(1);
		return Produs.concatTermens("("+getFStang().derivare()+")",Cos.concatTermens(getFStang().toString()));
	}
	
	public double calculDerivata(){
		if(getFStang()==null)
			System.exit(1);
		return Produs.Calcul(getFStang().calculDerivata(),Cos.Calcul(getFStang().calcul()));
	}
	
	public String concatTermeni(String aux1)
	{
		String aux;
		int nrP;
		nrP=aux1.charAt(0)=='(' ? 0:2;
		aux="sin";
		if(nrP!=0)
			aux+="(";
		aux+=aux1;
		if (nrP!=0)
			aux+=")";
		return aux;
	}
	
	public static String concatTermens(String aux1)
	{
		String aux;
		int nrP;
		nrP=aux1.charAt(0)=='(' ? 0:2;
		aux="sin";
		if(nrP!=0)
			aux+="(";
		aux+=aux1;
		if (nrP!=0)
			aux+=")";
		return aux;
	}
	

}
