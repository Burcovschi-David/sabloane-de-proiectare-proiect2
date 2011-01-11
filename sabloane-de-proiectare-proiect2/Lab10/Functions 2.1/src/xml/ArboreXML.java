package xml;

import visitorXML.*;

public class ArboreXML {
	
	private TagXML radacina;
	
	public ArboreXML(TagXML tagXML){
		radacina=tagXML;
	}
	public TagXML getRadacina() {
		return radacina;
	}
	public void setRadacina(TagXML radacina) {
		this.radacina = radacina;
	}
	public void acceptVisitor(VisitorXML v){
		v.visit(radacina);
	}

}
