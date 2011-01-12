package visitorDocumentXML;
/**
 * Clasa generica care care reprezinta un vizitor pentru parcurgerea unui document xml
 * @author Ordog Dorottya
 */

public abstract class VisitorDocumentXML {
	
	public abstract void visitSirPlus();
	public abstract void visitSirMinus();
	public abstract void visitSirCat();
	public abstract void visitSirProdus();
	public abstract void visitSirNecunoscuta();
	public abstract void visitSirConstanta();
	public abstract void visitSirSin();
	public abstract void visitSirCos();
	public abstract void visitSir();
}
