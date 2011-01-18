package xml;
/**
 * Modeleaza un tag de tip Cos
 * @author Ordog Dorottya
 *
 */
public class CosTagXML extends TagXML {
	
	public CosTagXML(){
		super("Cos","");
	}
	
	public TagXML concatTermeni(TagXML aux1,TagXML aux2){
		this.setFiuStang(aux1);
		this.setFiuDrept(aux2);
		return this;
	}

}
