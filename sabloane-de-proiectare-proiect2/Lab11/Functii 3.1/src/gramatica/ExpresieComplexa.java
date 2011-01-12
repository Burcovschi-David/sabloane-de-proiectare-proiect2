package gramatica;

import java.util.StringTokenizer;
import command.*;

/**
 * Gramatica pentru ExpresieComplexa
 * @author Ordog Dorottya
 *
 */
public class ExpresieComplexa implements Gramatica {

	/**
	 * un fel de context pentru clasa ExpresieComplexa
	 */
	private Validare val;
	
	public ExpresieComplexa(Validare v){
		this.val=v;
	}
	
	/**
	 * Prima regula pentru ExpresieComplexa (regula nr 1 in gramatica)
	 * <expresieComplexa>:=<expresieSimpla><operator><expresieSimpla>
	 */
	public boolean regula1Validare(String text){
		   //tokenizare pe baza delimitatorului ' ' 
		   StringTokenizer st=new StringTokenizer(text," "); 	
		   String rezultat[]=new String[3];
		   for(int i=0;i<3;i++)
			   if(st.hasMoreTokens())  
				   rezultat[i]=st.nextToken();
			   else return false;//avem mai putine elemente decat necesita regula
		   if(st.hasMoreTokens()) return false; //avem mai multe elem decat necesita regula
		   boolean expsimp1=new ExpresieSimpla(val).oriceRegulaValidare(rezultat[0]); //verif daca este exprSimpla primul elem		   
		   boolean expsimp2=new ExpresieSimpla(val).oriceRegulaValidare(rezultat[2]);  //verif daca este exprSimpla al treilea elem
		   boolean operator=new Operator(val).oriceRegulaValidare(rezultat[1]);  //verif daca este operator al doilea elem
		   if(expsimp1 && operator && expsimp2) 
			   return true;
		   	else return false;
	}
	
	/**
	 * A doua regula pentru ExpresieComplexa (regula nr 2 in gramatica)
	 * <expresieComplexa>:=<functie><expresieSimpla>
	 */
	public boolean regula2Validare(String text){
		   //tokenizare pe baza delimitatorului ' ' 
		   StringTokenizer st=new StringTokenizer(text," "); 	
		   String rezultat[]=new String[2];
		   for(int i=0;i<2;i++)
			   if(st.hasMoreTokens())  
				   rezultat[i]=st.nextToken();
			   else return false;//avem mai putine elemente decat necesita regula
		   if(st.hasMoreTokens()) return false; //avem mai multe elem decat necesita regula		  
		   boolean expsimp=new ExpresieSimpla(val).oriceRegulaValidare(rezultat[1]);  //verif daca este exprSimpla al doilea elem
		   boolean func=new Functie(val).oriceRegulaValidare(rezultat[0]); //verif daca este functie primul elem
		   if(func && expsimp) 
			   return true;
		   	else return false;
	}
	
	/**
	 * A treia regula pentru ExpresieComplexa (regula nr 3 in gramatica)
	 * <expresieComplexa>:=<expresieSimpla>
	 */
	public boolean regula3Validare(String text){
		   //tokenizare pe baza delimitatorului ' ' 
		   StringTokenizer st=new StringTokenizer(text," "); 	
		   String rezultat;;
		   if(st.hasMoreTokens())  
				   rezultat=st.nextToken();
			   else return false;//avem mai putine elemente decat necesita regula
		   if(st.hasMoreTokens()) return false; //avem mai multe elem decat necesita regula
		   boolean expsimp=new ExpresieSimpla(val).oriceRegulaValidare(rezultat);  //verif daca este exprSimpla
		   if(expsimp) 
			  return true;
		   	else return false;
	}

	/**
	 * Verifica daca este valorificata una dintre regulile descrise in aceasta clasa
	 */
	public boolean oriceRegulaValidare(String text) {
		if(regula1Validare(text)){
			val.adaugaRegula("1");
			return true;
		}
		else if(regula2Validare(text)){
			val.adaugaRegula("2");
			return true;
		}
		else if(regula3Validare(text)){
			val.adaugaRegula("3");
			return true;
		}
		else return false;
	}
}
