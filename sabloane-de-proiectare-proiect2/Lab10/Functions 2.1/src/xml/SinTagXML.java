package xml;

public class SinTagXML extends TagXML {
	
	public SinTagXML(){
		super("Sin","");
	}
	
	public TagXML concatTermeni(TagXML aux1,TagXML aux2){
		this.setFiuStang(aux1);
		this.setFiuDrept(aux2);
		return this;
	}
}
