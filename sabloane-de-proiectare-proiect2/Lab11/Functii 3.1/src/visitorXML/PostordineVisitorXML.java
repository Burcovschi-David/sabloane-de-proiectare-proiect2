package visitorXML;

import xml.*;
/**
 * Clasa care implementeaza un vizitor care parcurge arborele xml in postordine
 * @author Ordog Dorottya
 */
public class PostordineVisitorXML extends VisitorXML{

	public void visit(TagXML tagXML) {
		
		visit(tagXML.getFiuStang());
		
		visit(tagXML.getFiuDrept());
		
		System.out.println("<"+tagXML.getNume()+">");
	}

	@Override
	public void visit(PlusTagXML tagXML) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ConstantaTagXML tagXML) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(NecunoscutaTagXML tagXML) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(MinusTagXML tagXML) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(CatTagXML tagXML) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ProdusTagXML tagXML) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SinTagXML tagXML) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(CosTagXML tagXML) {
		// TODO Auto-generated method stub
		
	}

}
