package xml;

import visitorDocumentXML.*;
/**
 * Modeleaza conceptul de document xml
 * @author Ordog Dorottya
 *
 */
public class DocumentXML {
	
	private String fisier;
	private ArboreXML arboreXML;
	
	public DocumentXML(String fis){
		fisier=fis;
	}
	public String getFisier() {
		return fisier;
	}
	public void setFisier(String fisier) {
		this.fisier = fisier;
	}
	public ArboreXML getArboreXML() {
		return arboreXML;
	}
	public void setArboreXML(ArboreXML arboreXML) {
		this.arboreXML = arboreXML;
	}
	public void acceptVisitor(VisitorDocumentXML v){
		v.visitSir();
		arboreXML=((ToArboreXMLVisitorDocumentXML)v).getArbore();
	}

}
