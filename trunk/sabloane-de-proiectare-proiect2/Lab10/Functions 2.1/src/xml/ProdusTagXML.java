package xml;

public class ProdusTagXML extends TagXML {
	
	public ProdusTagXML(){
		super("Produs","");
	}
	
	public TagXML concatTermeni(TagXML aux1,TagXML aux2){
		this.setFiuStang(aux1);
		this.setFiuDrept(aux2);
		return this;
	}
}
