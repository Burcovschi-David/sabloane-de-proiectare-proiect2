package visitorXML;

import xml.*;
/**
 * Clasa care implementeaza un vizitor care parcurge arborele xml in inordine
 * @author Ordog Dorottya
 */
public class InordineVisitorXML extends VisitorXML{

	public void visit(TagXML tagXML) {
		
		visit(tagXML.getFiuStang());
		
		System.out.println("<"+tagXML.getNume()+">");
		
		visit(tagXML.getFiuDrept());
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
