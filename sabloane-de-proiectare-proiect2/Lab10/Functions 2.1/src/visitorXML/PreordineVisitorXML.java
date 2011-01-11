package visitorXML;

import xml.*;

public class PreordineVisitorXML extends VisitorXML {
	
	public void visit(TagXML tagXML) {
		 if(tagXML instanceof ConstantaTagXML)
			 visit((ConstantaTagXML)tagXML);
		 else if(tagXML instanceof NecunoscutaTagXML)
			 visit((NecunoscutaTagXML)tagXML);
		 else {		
			System.out.println("<"+tagXML.getNume()+">");
			
			if(tagXML.getFiuStang()!=null) visit(tagXML.getFiuStang());
			if(tagXML.getFiuDrept()!=null) visit(tagXML.getFiuDrept());
			
			System.out.println("</"+tagXML.getNume()+">");
		 }
	}

	@Override
	public void visit(PlusTagXML tagXML) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void visit(ConstantaTagXML tagXML) {
		System.out.println("<"+tagXML.getNume()+" "+tagXML.afisAtribute()+"/>");
	}

	@Override
	public void visit(NecunoscutaTagXML tagXML) {
		System.out.println("<"+tagXML.getNume()+" "+tagXML.afisAtribute()+"/>");
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
