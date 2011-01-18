package xml;
/**
 * Modeleaza un tag de tip Plus 
 * @author Ordog Dorottya
 *
 */
public class PlusTagXML extends TagXML {
	
	public PlusTagXML(){
		super("Plus","");
	}
	
	public TagXML concatTermeni(TagXML aux1,TagXML aux2){
		this.setFiuStang(aux1);
		this.setFiuDrept(aux2);
		return this;
	}

}
