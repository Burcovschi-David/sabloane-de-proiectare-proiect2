package xml;

public class CatTagXML extends TagXML {
	
	public CatTagXML(){
		super("Cat","");
	}
	
	public TagXML concatTermeni(TagXML aux1,TagXML aux2){
		this.setFiuStang(aux1);
		this.setFiuDrept(aux2);
		return this;
	}

}
