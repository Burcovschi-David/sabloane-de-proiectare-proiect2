package xml;
/**
 * Modeleaza un tag de tip Constanta 
 * @author Ordog Dorottya
 *
 */
public class ConstantaTagXML extends TagXML {

	public ConstantaTagXML(String atribut){
		super("Constanta","");
		this.addAtribut(new AtributXML("valoare",atribut));
	}
	
	public TagXML concatTermeni(TagXML aux1, TagXML aux2) {
		this.setFiuStang(aux1);
		this.setFiuDrept(aux2);
		return this;
	}

}
