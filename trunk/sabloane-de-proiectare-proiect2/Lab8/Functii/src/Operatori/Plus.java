package Operatori;

public class Plus extends Operator {
	
	public double calcul(double aux1,double aux2){
		return aux1+aux2;
	}
	
	public static double Calcul(double aux1,double aux2){
		return aux1+aux2;
	}
	
	public double calculDerivata(){
		if(getFStang()==null || getFDrept()==null)
			System.exit(1);
		return calcul(getFStang().calculDerivata(),getFDrept().calculDerivata());
	}
	
	public String derivare(){
		if(getFStang()==null || getFDrept()==null)
			System.exit(1);
		return concatTermeni(getFStang().derivare(),getFDrept().derivare());
	}
	
	public String concatTermeni(String aux1,String aux2){
		String aux;
		if(aux1.compareTo("0")==0 && aux2.compareTo("0")==0)
			aux=aux1;
		else if(aux1.compareTo("0")==0) aux=aux2;
		else if(aux2.compareTo("0")==0) aux=aux1;
		else aux=aux1+"+"+aux2;
		return aux;
	}
	
	public static String concatTermens(String aux1,String aux2){
		String aux;
		if(aux1.compareTo("0")==0 && aux2.compareTo("0")==0)
			aux=aux1;
		else if(aux1.compareTo("0")==0) aux=aux2;
		else if(aux2.compareTo("0")==0) aux=aux1;
		else aux=aux1+"+"+aux2;
		return aux;
	}

}
