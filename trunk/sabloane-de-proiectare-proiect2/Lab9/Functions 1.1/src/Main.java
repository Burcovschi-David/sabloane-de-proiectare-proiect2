import Functii.*;
import Operatori.*;
import Arbori.*;
import visitor.*;

public class Main {
	
	public static void main(String args[]){
		Nod n=new Necunoscuta();
		Nod c=new Constanta(3);		
		Nod plus=new Plus();
		
		plus.setFStang(n);
		plus.setFDrept(c);
		
		ArboreFunctional a=new ArboreFunctional(plus);
		Visitor v=new ToStringVisitor();
		Visitor vv=new DerivareVisitor();
		a.acceptVisitor(v);
		a.acceptVisitor(vv);
		
		System.out.println("Functia este: f(x)="+((ToStringVisitor)v).getS());
		System.out.println("Derivata este: f'(x)="+((DerivareVisitor)vv).getS());
		//System.out.println("f(5)="+a.calculezValoare(5));
		//System.out.println("f'(2)="+a.calculezDerivata(2));
		
		
		Nod sin=new Sin();
		Nod n2=new Necunoscuta();	
		
		sin.setFStang(n2);
		
		ArboreFunctional a2=new ArboreFunctional(sin);
		Visitor v2=new ToStringVisitor();
		Visitor vv2=new DerivareVisitor();
		a2.acceptVisitor(v2);
		a2.acceptVisitor(vv2);
		
		System.out.println("Functia este: g(x)="+((ToStringVisitor)v2).getS());
		System.out.println("Derivata este: g'(x)="+((DerivareVisitor)vv2).getS());
	}

}
