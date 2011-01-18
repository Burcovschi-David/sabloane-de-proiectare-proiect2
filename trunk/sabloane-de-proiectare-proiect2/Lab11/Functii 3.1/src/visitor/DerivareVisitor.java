package visitor;

import Arbori.Nod;
import Functii.*;
import Operatori.*;

/**
 * Clasa care implementeaza derivarea simbolica pentru fiecare tip de nod al arborelui in parte
 * @author Ordog Dorottya
 *
 */
public class DerivareVisitor extends Visitor {

	private String s;
	private ToStringVisitor tsv;
	
	public DerivareVisitor(){
		s="";
		tsv=new ToStringVisitor();
	}	
	public String getS(){
		return s;
	}
	public void setS(String s){
		this.s=s;
	}
	@Override
	public void visit(Plus p) {
		if((p.getFStang()!=null)&&(p.getFDrept()!=null))
		{
			visit(p.getFStang());
			String s1=this.s;
			visit(p.getFDrept());
			String s2=this.s;
			s=p.concatTermeni(s1,s2);
		}
	}

	@Override
	public void visit(Minus m) {
		if((m.getFStang()!=null)&&(m.getFDrept()!=null))
		{
			visit(m.getFStang());
			String s1=this.s;
			visit(m.getFDrept());
			String s2=this.s;
			s=m.concatTermeni(s1,s2);
		}
	}

	@Override
	public void visit(Cat c) {
		if((c.getFStang()!=null)&&(c.getFDrept()!=null))
		{
			visit(c.getFStang());
			String f1D=this.s;
			visit(c.getFDrept());
			String f2D=this.s;
			c.getFStang().acceptVisitor(tsv);
			String f1=tsv.getS();
			c.getFDrept().acceptVisitor(tsv);
			String f2=tsv.getS();
			this.s=Cat.concatTermens(Minus.concatTermens(Produs.concatTermens(f1D,f2),Produs.concatTermens(f1, f2D)),Produs.concatTermens(f2,f2));	
		}
	}

	@Override
	public void visit(Produs p) {
		if((p.getFStang()!=null)&&(p.getFDrept()!=null))
		{
			visit(p.getFStang());
			String f1D=this.s;
			visit(p.getFDrept());
			String f2D=this.s;
			p.getFStang().acceptVisitor(tsv);
			String f1=tsv.getS();
			p.getFDrept().acceptVisitor(tsv);
			String f2=tsv.getS();
			this.s=Plus.concatTermens(Produs.concatTermens(f1D,f2),Produs.concatTermens(f1, f2D));			
		}
	}

	@Override
	public void visit(Necunoscuta n) {
		this.s="1";
	}

	@Override
	public void visit(Constanta c) {
		this.s="0";
	}

	@Override
	public void visit(Sin s) {
		if(s.getFStang()!=null)
		{
			visit(s.getFStang());
			String fsd=this.s;
			s.getFStang().acceptVisitor(tsv);
			String fs=tsv.getS();
			this.s=Produs.concatTermens(Cos.concatTermens(fs),fsd);			
		}
	}

	@Override
	public void visit(Cos c) {
		if(c.getFStang()!=null)
		{
			visit(c.getFStang());
			String fsd=this.s;
			c.getFStang().acceptVisitor(tsv);
			String fs=tsv.getS();
			this.s=Produs.concatTermens(Sin.concatTermens(fs),fsd);			
		}
	}

	@Override
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
