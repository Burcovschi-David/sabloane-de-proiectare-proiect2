package xml;

public class MinusTagXML extends TagXML {
	
	public MinusTagXML(){
		super("Minus","");
	}
	
	public TagXML concatTermeni(TagXML aux1,TagXML aux2){
		this.setFiuStang(aux1);
		this.setFiuDrept(aux2);
		return this;
	}

}
