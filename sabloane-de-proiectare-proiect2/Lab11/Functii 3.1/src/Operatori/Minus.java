package Operatori;

/**
 * Modeleaza operatorul minus
 * @author Ordog Dorottya
 *
 */
public class Minus extends Operator {
	
	public String concatTermeni(String aux1,String aux2){
		String aux;
		if(aux1.compareTo("0")==0 || aux2.compareTo("0")==0)
			aux=aux1;
		else if(aux1.compareTo("0")==0) aux=aux2;
		else if(aux2.compareTo("0")==0) aux=aux1;
		else aux=aux1+" - "+aux2;
		return aux;
	}
	
	public static String concatTermens(String aux1,String aux2){
		String aux;
		if(aux1.compareTo("0")==0 || aux2.compareTo("0")==0)
			aux=aux1;
		else if(aux1.compareTo("0")==0) aux=aux2;
		else if(aux2.compareTo("0")==0) aux=aux1;
		else aux=aux1+" - "+aux2;
		return aux;
	}

}
