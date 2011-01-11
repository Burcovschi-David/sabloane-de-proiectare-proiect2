package visitorDocumentXML;

import xml.*;

import java.io.*;

public class ToArboreXMLVisitorDocumentXML extends VisitorDocumentXML {
	
	private ArboreXML arboreXML; //felesleges
	private TagXML tagXML;
	private BufferedReader in;
	private String sir;
	
	public ToArboreXMLVisitorDocumentXML(DocumentXML doc) throws IOException {
		in=new BufferedReader(new FileReader(doc.getFisier()));
		in.readLine(); //citesc primul sir cu tagul <?xml ..?>
	}
	
	public ArboreXML getArbore() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		arboreXML=new ArboreXML(tagXML);
		return arboreXML;
	}

	public void visitSir()  {
		while(sir!=null && sir.indexOf('/')!=-1 && sir.indexOf("Constanta")==-1 && sir.indexOf("Necunoscuta")==-1)
			//sarim peste tagurile de sfarsit
			try {
				sir=in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(sir!=null)
					if(sir.indexOf("Constanta")!=-1)
						 visitSirConstanta();
					else if(sir.indexOf("Necunoscuta")!=-1)
						 visitSirNecunoscuta();
					else if(sir.indexOf("Plus")!=-1)
						 visitSirPlus();
					else if(sir.indexOf("Minus")!=-1)
						 visitSirMinus();
					else if(sir.indexOf("Cat")!=-1)
						 visitSirCat();
					else if(sir.indexOf("Produs")!=-1)
						 visitSirProdus();
					else if(sir.indexOf("Cos")!=-1)
						 visitSirCos();
					else if(sir.indexOf("Sin")!=-1)
						 visitSirSin();			 
		
}

	@Override
	public void visitSirPlus() {
		    //sir=in.readLine();
		    visitSir();
			TagXML s1=this.tagXML;
			//sir=in.readLine();
			visitSir();
			TagXML s2=this.tagXML;
			tagXML=new PlusTagXML().concatTermeni(s1,s2);
	}
	
	public void visitSirNecunoscuta() {
		tagXML=new NecunoscutaTagXML().concatTermeni(null,null);
	}
	
	@Override
	public void visitSirConstanta()  {
		tagXML=new ConstantaTagXML(sir.substring(sir.indexOf('"')+1,sir.lastIndexOf('"')-1)).concatTermeni(null,null);
	}

	@Override
	public void visitSirCos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitSirMinus() {
		// TODO Auto-generated method stub
		
	}	

	@Override
	public void visitSirCat() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void visitSirProdus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitSirSin() {
		// TODO Auto-generated method stub
		
	}


}
