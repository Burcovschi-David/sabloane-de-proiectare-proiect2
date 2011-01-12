package command;
import gramatica.*;

/**
 * Clasa care verifica validitatea sirului introdus (sablonul Interpreter)
 * Clasa Validare indeplineste functiile clasei context din sablonul Interpreter
 * @author Ordog Dorottya
 *
 */
public class Validare implements Command {

	/**
	 * variabila de tip String care este verificata
	 */
	private String text;
	
	/**
	 * variabila in care se stocheaza rezultatul validarii
	 */
	private boolean rezultatValidare;
	/**
	 * variabila String stocheaza numerele regulilor in ordinea inversa aplicarii lor in construiea functiei
	 */
	private String reguliAplicate;
	
	public Validare(String text){
		this.text=text;
		reguliAplicate="";
	}
	
	/**
	 * paseaza validarea textului clasei ExpresieComplexa pe baza gramaticii implementate
	 */
	public void execute() {
		rezultatValidare=new ExpresieComplexa(this).oriceRegulaValidare(text);
	}
	
	/**
	 * Returneaza textul care este verificat
	 * @return textul introdus in campul de editare
	 */
	public String getText() {
		return text;
	}

	/**
	 * returneaza rezultatul validarii
	 * @return true daca textul introdus este valid 
	 */
	public boolean getRezultatValidare() {
		return rezultatValidare;
	}
	
	/**
	 * Adauga o noua regula la succesiunea de reguli aplicate
	 * @param reg numarul regulii aplicate la un moment dat
	 */
	public void adaugaRegula(String reg){
		reguliAplicate+=reg;
	}
	
	/**
	 * returneaza numerele regulilor in ordinea inversa aplicarii lor 
	 * @return true daca textul introdus este valid 
	 */
	public String getReguliAplicate() {
		return reguliAplicate;
	}
}
