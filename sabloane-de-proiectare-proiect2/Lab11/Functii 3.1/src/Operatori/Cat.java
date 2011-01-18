package Operatori;
/**
 * Modeleaza operatorul cat
 * @author Ordog Dorottya
 *
 */
public class Cat extends Operator{

	public String concatTermeni(String aux1, String aux2){
		if (aux1.compareTo("0") == 0)
			return "0";
		if (aux2.compareTo("1") == 0)
			return aux1;
		if (aux2.compareTo("0") == 0)
			System.exit(1);
		if (aux1.charAt(0) == '-')
			if (aux2.charAt(0) == '-')
				return aux1.substring(1) + "/" + aux2.substring(1);
			else
				return aux1 + "/" + aux2;
		else if (aux2.charAt(0) == '-')
			return "-" + aux1 + "/" + aux2.substring(1);
		else
			return aux1 + " / " + aux2;
	}
	
	public static String concatTermens(String aux1, String aux2){
		if (aux1.compareTo("0") == 0)
			return "0";
		if (aux2.compareTo("1") == 0)
			return aux1;
		if (aux2.compareTo("0") == 0)
			System.exit(1);
		if (aux1.charAt(0) == '-')
			if (aux2.charAt(0) == '-')
				return aux1.substring(1) + "/" + aux2.substring(1);
			else
				return aux1 + "/" + aux2;
		else if (aux2.charAt(0) == '-')
			return "-" + aux1 + "/" + aux2.substring(1);
		else
			return aux1 + " / " + aux2;
	}

}
