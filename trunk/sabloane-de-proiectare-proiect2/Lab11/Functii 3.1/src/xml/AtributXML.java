package xml;
/**
 * Modeleaza conceptul de atribut in cadrul unui tag xml
 * @author Ordog Dorottya
 *
 */
public class AtributXML {
	
	private String identificator;
	private String valoare;
	
	AtributXML(String id,String val){
		identificator=id;
		valoare=val;
	}
	public String getIdentificator() {
		return identificator;
	}
	public void setIdentificator(String identificator) {
		this.identificator=identificator;
	}
	public String getValoare() {
		return valoare;
	}
	public void setValoare(String valoare) {
		this.valoare = valoare;
	}	
	public String toString(){
		return identificator+"=\""+valoare+"\"";
	}

}
