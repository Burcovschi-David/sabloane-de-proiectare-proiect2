package Functii;
/**
 * Modeleaza functia cos
 * @author Ordog Dorottya
 *
 */
public class Cos extends Functie {

	
	public String concatTermeni(String aux1)	{
		String aux;
		//int nrP;
		//nrP=aux1.charAt(0)=='(' ? 0:2;
		aux="cos ";
		//if(nrP!=0) aux+="(";
		aux+=aux1;
		//if (nrP!=0) aux+=")";
		return aux;
	}
	
	public static String concatTermens(String aux1)	{
		String aux;
		//int nrP;
		//nrP=aux1.charAt(0)=='(' ? 0:2;
		aux="cos ";
		//if(nrP!=0) aux+="(";
		aux+=aux1;
		//if (nrP!=0) aux+=")";
		return aux;
	}

}
