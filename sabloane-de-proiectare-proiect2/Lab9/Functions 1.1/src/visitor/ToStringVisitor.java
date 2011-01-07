package visitor;

import Arbori.Nod;
import Functii.*;
import Operatori.*;

public class ToStringVisitor extends Visitor {
	
	private String s;
	
	public ToStringVisitor(){
		s="";
	}	
	public String getS(){
		return s;
	}
	public void setS(String s){
		this.s=s;
	}
	
	public void visit(Plus p) {
		visit(p);
	}
	
	public void visit(Minus m) {
		visit(m);
	}
	
	public void visit(Cat m) {
		visit(m);
	}
	
	public void visit(Produs p) {
		visit(p);
	}

	public void visit(Necunoscuta n) {
		this.s="x";
	}

	public void visit(Constanta c) {
		this.s=Double.toString(c.getCt());
	}
	
	public void visit(Sin s) {
		visit(s);
	}
	
	public void visit(Cos c) {
		visit(c);
	}

	public void visit(Nod n) {
		if(n instanceof Operator) 
			visit((Operator)n);
		else 
			if(n instanceof Necunoscuta) 
				visit((Necunoscuta)n);
		else 
			if(n instanceof Constanta) 
				visit((Constanta)n);
		else
			if(n instanceof Functie)
				visit((Functie)n);
	}
	
	public void visit(Operator o){
		if(o.getFStang()!=null && o.getFDrept()!=null){
			visit(o.getFStang());
			String s1=this.s;
			visit(o.getFDrept());
			String s2=this.s;
			s=o.concatTermeni(s1,s2);
		}
	}
	public void visit(Functie f){
		if(f.getFStang()!=null){
			visit(f.getFStang());
			String s1=this.s;
			this.s=f.concatTermeni(s1);
		}
	}

}
