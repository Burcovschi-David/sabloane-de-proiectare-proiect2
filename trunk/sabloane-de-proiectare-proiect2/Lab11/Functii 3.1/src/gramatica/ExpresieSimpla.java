package gramatica;

import command.Validare;

/**
 * Gramatica pentru ExpresieSimpla
 * @author Ordog Dorottya
 *
 */
public class ExpresieSimpla implements Gramatica {
	
	/**
	 * un fel de context pentru clasa ExpresieSimpla
	 */
	private Validare val;
	
	public ExpresieSimpla(Validare v){
		this.val=v;
	}
	
	/**
	 * Prima regula pentru ExpresieSimpla (regula nr 10 in gramatica)
	 * <expresieSimpla>:=<necunoscuta>
	 * @return true daca operandul primit prin parametru este necunoscuta
	 */
	public boolean regulaNecunoscutaValidare(String op){
		if(op.toLowerCase().equals("x")) 
			return true;
			else return false;
	}
	
	/**
	 * A doua regula pentru ExpresieSimpla (regula nr 11 in gramatica)
	 * <expresieSimpla>:=<constanta>
	 * @return true daca operandul primit prin parametru este o constanta
	 */
	public boolean regulaConstantaValidare(String op){
		try{
			Double.parseDouble(op);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	/**
	 * Verifica daca a fost aplicata o regula ExpresieSimpla
	 * @return true daca a fost aplicata o regula ExpresieSimpla
	 */
	public boolean oriceRegulaValidare(String op) {
		if(regulaNecunoscutaValidare(op)){
			val.adaugaRegula("10,");
			return true;
		}
		else if(regulaConstantaValidare(op)){
			val.adaugaRegula("11 ");
			//adaugam si valoarea constantei in succesiunea de reguli
			val.adaugaRegula(op+",");
			return true;
		}
		else return false;
	}


}
