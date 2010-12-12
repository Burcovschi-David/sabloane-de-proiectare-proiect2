package Operatori;

public class Produs extends Operator {
	
	public double calcul(double aux1,double aux2){
		return aux1*aux2;
	}
	
	public static double Calcul(double aux1,double aux2){
		return aux1*aux2;
	}
	
	public double calculDerivata(){
		if(getFStang()==null || getFDrept()==null)
			System.exit(1);
		return Plus.Calcul(Calcul(getFStang().calculDerivata(),getFDrept().calcul()),Calcul(getFStang().calcul(),getFDrept().calculDerivata()));
	}
	
	public String derivare(){
		if(getFStang()==null || getFDrept()==null)
			System.exit(1);
		return Plus.concatTermens(Produs.concatTermens(getFStang().derivare(),getFDrept().toString()),Produs.concatTermens(getFStang().toString(),getFDrept().derivare()));
	}
	
	public String concatTermeni(String aux1,String aux2){
		if ((aux1.compareTo("0") == 0) || (aux2.compareTo("0") == 0))
			return "0";
		if (aux1.compareTo("1") == 0)
			return aux2;
		if (aux2.compareTo("1") == 0)
			return aux1;
		if (aux1.charAt(0) == '-')
			if (aux2.charAt(0) == '-')
				return aux1.substring(1) + "*" + aux2.substring(1);
			else
				return aux1 + "*" + aux2;
		else if (aux2.charAt(0) == '-')
			return "-" + aux1 + "*" + aux2.substring(1);
		if (aux1.equals(aux2))
			return aux1 + "^2";
		return aux1 + "*" + aux2;
	}
	
	public static String concatTermens(String aux1,String aux2){
		if ((aux1.compareTo("0") == 0) || (aux2.compareTo("0") == 0))
			return "0";
		if (aux1.compareTo("1") == 0)
			return aux2;
		if (aux2.compareTo("1") == 0)
			return aux1;
		if (aux1.charAt(0) == '-')
			if (aux2.charAt(0) == '-')
				return aux1.substring(1) + "*" + aux2.substring(1);
			else
				return aux1 + "*" + aux2;
		else if (aux2.charAt(0) == '-')
			return "-" + aux1 + "*" + aux2.substring(1);
		if (aux1.equals(aux2))
			return aux1 + "^2";
		return aux1 + "*" + aux2;
	}
}