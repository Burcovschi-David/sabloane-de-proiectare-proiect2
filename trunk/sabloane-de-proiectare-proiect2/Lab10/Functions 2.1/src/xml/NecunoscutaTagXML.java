package xml;

public class NecunoscutaTagXML extends TagXML {

	public NecunoscutaTagXML(){
		super("Necunoscuta","");		
	}
	
	public TagXML concatTermeni(TagXML aux1, TagXML aux2) {
		this.setFiuStang(aux1);
		this.setFiuDrept(aux2);
		return this;
	}

}
