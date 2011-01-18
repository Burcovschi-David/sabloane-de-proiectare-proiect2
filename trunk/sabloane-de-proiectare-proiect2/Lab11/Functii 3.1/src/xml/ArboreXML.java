package xml;

import visitorXML.*;

/**
 * Modeleaza conceptul de arbore xml
 * @author Ordog Dorottya
 *
 */
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
