package visitor;

import Arbori.Nod;
import Functii.Constanta;
import Functii.Cos;
import Functii.Necunoscuta;
import Functii.Sin;
import Operatori.Cat;
import Operatori.Minus;
import Operatori.Plus;
import Operatori.Produs;

public class DerivareVisitor extends Visitor {

	private String s;
	
	public DerivareVisitor(){
		s="";
	}	
	public String getS(){
		return s;
	}
	public void setS(String s){
		this.s=s;
	}

	public void visit(Plus p) {
		// TODO Auto-generated method stub
		
	}


	public void visit(Minus m) {
		// TODO Auto-generated method stub
		
	}


	public void visit(Cat m) {
		// TODO Auto-generated method stub
		
	}


	public void visit(Produs p) {
		// TODO Auto-generated method stub
		
	}


	public void visit(Necunoscuta n) {
		// TODO Auto-generated method stub
		
	}


	public void visit(Constanta c) {
		// TODO Auto-generated method stub
		
	}


	public void visit(Sin s) {
		// TODO Auto-generated method stub
		
	}


	public void visit(Cos c) {
		// TODO Auto-generated method stub
		
	}


	public void visit(Nod n) {
		// TODO Auto-generated method stub
		
	}

}
