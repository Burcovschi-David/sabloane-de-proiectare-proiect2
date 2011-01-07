package Operatori;

public class Cat extends Operator
{
	public double calcul(double aux1, double aux2) {
		if(aux2==0){
			   System.out.println("Eroare: impartire cu zero");
			   System.exit(1);
		}
		return aux1/aux2;
	}	
	
	public static double Calcul(double aux1, double aux2){
		if(aux2==0){
			   System.out.println("Eroare: impartire cu zero");
			   System.exit(1);
		}
		return aux1/aux2;
	}
	
	public double calculDerivata()	{
		if(getFStang()==null || getFDrept()==null)
			System.exit(1);
		return Calcul(Minus.Calcul(Produs.Calcul(getFStang().calculDerivata(),getFDrept().calcul()),Produs.Calcul(getFStang().calcul(),getFDrept().calculDerivata())),Math.pow(getFDrept().calcul(),2));
	}
	
	public String derivare()	{
		if(getFStang()==null || getFDrept()==null)
			System.exit(1);
		return concatTermeni("("+Minus.concatTermens(
				      Produs.concatTermens(getFStang().derivare(),getFDrept().toString()),
				      Produs.concatTermens(getFStang().toString(),getFDrept().derivare()))+")",
				"(("+getFDrept().toString()+")^2)");
	}
	
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
			return aux1 + "/" + aux2;
	}
	
	public static String concatTermens(String aux1, String aux2)	{
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
			return aux1 + "/" + aux2;
	}
	
}

