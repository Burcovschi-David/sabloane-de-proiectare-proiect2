package visitorXML;

import xml.*;

import java.io.*;

public class ToFisierXMLVisitorXML extends VisitorXML {
	
	private BufferedWriter out;
	private int nivel;
	
	public ToFisierXMLVisitorXML(String fisier) throws IOException {
		out=new BufferedWriter(new FileWriter(fisier));
		out.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\n");
		nivel=1;
	}
	
	@Override
	public void visit(TagXML tagXML){
		try{
			for(int i=1; i<=nivel; i++)
				out.write(" ");			
			if(tagXML instanceof ConstantaTagXML)
				 visit((ConstantaTagXML)tagXML);
			 else if(tagXML instanceof NecunoscutaTagXML)
				 visit((NecunoscutaTagXML)tagXML);
			 else {		
				 out.write("<"+tagXML.getNume()+">\n");
					
				 nivel++;
				 if(tagXML.getFiuStang()!=null) visit(tagXML.getFiuStang());
				 if(tagXML.getFiuDrept()!=null) visit(tagXML.getFiuDrept());
				 nivel--;
				
				 for(int i=1;i<=nivel;i++)
		            out.write(" ");
		        out.write("</"+tagXML.getNume()+">\n");
		        if(nivel==1) out.close();
			 }
		}
		catch(IOException ex){
			System.out.println(ex.getMessage());
		}

	}

	@Override
	public void visit(PlusTagXML tagXML) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ConstantaTagXML tagXML) {
		try {
			out.write("<"+tagXML.getNume()+" "+tagXML.afisAtribute()+"/>\n");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Override
	public void visit(NecunoscutaTagXML tagXML) {
		try {
			out.write("<"+tagXML.getNume()+" "+tagXML.afisAtribute()+"/>\n");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
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
