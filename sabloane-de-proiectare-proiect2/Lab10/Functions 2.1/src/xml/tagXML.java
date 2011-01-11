package xml;
import java.util.*;

public abstract class TagXML {
	
	private String nume; 
	private String valoare;
	private Vector<AtributXML> atribute;
	private TagXML fiuStang;
	private TagXML fiuDrept;
	
	public TagXML(String n,String val/*,TagXML fiuS,TagXML fiuD*/){
		nume=n;
		valoare=val;
		/*fiuStang=fiuS;
		fiuDrept=fiuD;*/
		atribute=new Vector<AtributXML>();
	}

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getValoare() {
		return valoare;
	}
	public void setValoare(String valoare) {
		this.valoare = valoare;
	}
	public TagXML getFiuStang() {
		return fiuStang;
	}
	public void setFiuStang(TagXML fiuStang) {
		this.fiuStang = fiuStang;
	}
	public TagXML getFiuDrept() {
		return fiuDrept;
	}
	public void setFiuDrept(TagXML fiuDrept) {
		this.fiuDrept = fiuDrept;
	}

	public Vector<AtributXML> getAtribute() {
		return atribute;
	}

	public void setAtribute(Vector<AtributXML> atribute) {
		this.atribute = atribute;
	}
	
	public void addAtribut(AtributXML atr){
		atribute.add(atr);
	}
	public String afisAtribute(){
		String s="";
		Iterator<AtributXML> it=atribute.iterator();
		while(it.hasNext())
			s+=it.next();
		return s;
	}

	public abstract TagXML concatTermeni(TagXML aux1,TagXML aux2);
}
