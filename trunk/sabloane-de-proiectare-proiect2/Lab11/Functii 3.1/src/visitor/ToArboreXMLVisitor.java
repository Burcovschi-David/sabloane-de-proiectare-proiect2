package visitor;

import Arbori.Nod;
import Functii.*;
import Operatori.*;
import xml.*;
/**
 * Clasa care implementeaza transformarea unui arbore functional in arbore xml
 * @author Ordog Dorottya
 */

public class ToArboreXMLVisitor extends Visitor {

	private TagXML tagXML;

	public ToArboreXMLVisitor(){			
	}
	
	public TagXML getTagXML() {
		return tagXML;
	}

	public void setTagXML(TagXML tagXML) {
		this.tagXML = tagXML;
	}

	public void visit(Plus p) {
		if((p.getFStang()!=null)&&(p.getFDrept()!=null))
		{
			visit(p.getFStang());
			TagXML s1=this.tagXML;
			visit(p.getFDrept());
			TagXML s2=this.tagXML;
			tagXML=new PlusTagXML().concatTermeni(s1,s2);
		}
	}

	
	public void visit(Minus m) {
		if((m.getFStang()!=null)&&(m.getFDrept()!=null))
		{
			visit(m.getFStang());
			TagXML s1=this.tagXML;
			visit(m.getFDrept());
			TagXML s2=this.tagXML;
			tagXML=new MinusTagXML().concatTermeni(s1,s2);
		}
	}


	public void visit(Cat p) {
		if((p.getFStang()!=null)&&(p.getFDrept()!=null))
		{
			visit(p.getFStang());
			TagXML s1=this.tagXML;
			visit(p.getFDrept());
			TagXML s2=this.tagXML;
			tagXML=new CatTagXML().concatTermeni(s1,s2);
		}
	}


	public void visit(Produs p) {
		if((p.getFStang()!=null)&&(p.getFDrept()!=null))
		{
			visit(p.getFStang());
			TagXML s1=this.tagXML;
			visit(p.getFDrept());
			TagXML s2=this.tagXML;
			tagXML=new ProdusTagXML().concatTermeni(s1,s2);
		}
	}

	
	public void visit(Necunoscuta n) {
		tagXML=new NecunoscutaTagXML().concatTermeni(null,null);		
	}
	
	public void visit(Constanta c) {
		tagXML=new ConstantaTagXML(String.valueOf(c.getCt())).concatTermeni(null,null);
	}

	
	public void visit(Sin p) {
		if((p.getFStang()!=null))
		{
			visit(p.getFStang());
			TagXML s1=this.tagXML;
			tagXML=new SinTagXML().concatTermeni(s1,null);
		}
	}

	
	public void visit(Cos p) {
		if((p.getFStang()!=null))
		{
			visit(p.getFStang());
			TagXML s1=this.tagXML;
			tagXML=new CosTagXML().concatTermeni(s1,null);
		}
	}

	
	public void visit(Nod n) {	
			if(n instanceof Plus)
				 visit((Plus)n);
			else if(n instanceof Minus)
				visit((Minus)n);
			else if(n instanceof Produs)
				visit((Produs)n);
			else if(n instanceof Cat)
				visit((Cat)n);
			else if(n instanceof Necunoscuta)
				   visit((Necunoscuta)n);
			else if(n instanceof Constanta)
				  visit((Constanta)n);
			else if(n instanceof Sin)
			   visit((Sin)n);
			else if(n instanceof Cos)
				visit((Cos)n);
	}	

}
