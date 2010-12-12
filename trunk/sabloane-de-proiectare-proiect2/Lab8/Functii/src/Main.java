import Arbori.*;
import Functii.*;
import Operatori.*;

public class Main {
	
	public static void main(String args[]){
		
		//exemplu cu Plus: f(x)=x+3.0
		Nod n=new Necunoscuta();
		Nod c=new Constanta(3);		
		Nod plus=new Plus();
		
		plus.setFStang(n);
		plus.setFDrept(c);
		
		ArboreFunctional a=new ArboreFunctional(plus);
		
		System.out.println("Functia este: f(x)="+a);
		System.out.println("Derivata este: f'(x)="+a.derivata());
		System.out.println("f(5)="+a.calculezValoare(5));
		System.out.println("f'(2)="+a.calculezDerivata(2));
		System.out.println();
		
		//exemplu cu Produs: f(x)=(x+3.0)*(x-5)
		Nod n2=new Necunoscuta();
		Nod c2=new Constanta(3);	
		Nod plus2=new Plus();
		plus2.setFStang(n2);
		plus2.setFDrept(c2);
		
		Nod n3=new Necunoscuta();
		Nod c3=new Constanta(5);	
		Nod minus=new Minus();
		minus.setFStang(n3);
		minus.setFDrept(c3);
		
		Nod produs=new Produs();		
		produs.setFStang(plus2);
		produs.setFDrept(minus);
		
		ArboreFunctional a2=new ArboreFunctional(produs);
		
		System.out.println("Functia este: f(x)="+a2);
		System.out.println("Derivata este: f'(x)="+a2.derivata());
		System.out.println("f(5)="+a2.calculezValoare(5));
		System.out.println("f'(2)="+a2.calculezDerivata(2));
		System.out.println();
		
		//exemplu cu Produs: f(x)=5*x
		Nod n4=new Necunoscuta();
		Nod c4=new Constanta(5);
		
		Nod produs2=new Produs();
		produs2.setFStang(c4);
		produs2.setFDrept(n4);
		
		ArboreFunctional a3=new ArboreFunctional(produs2);
		
		System.out.println("Functia este: f(x)="+a3);
		System.out.println("Derivata este: f'(x)="+a3.derivata());
		System.out.println("f(5)="+a3.calculezValoare(5));
		System.out.println("f'(2)="+a3.calculezDerivata(2));
		System.out.println();
		
		//exemplu cu Cat: f(x)=(3+x)/2
		Nod c5=new Constanta(3);
		Nod n5=new Necunoscuta();
		Nod plus3=new Plus();
		plus3.setFStang(c5);
		plus3.setFDrept(n5);
		Nod c6=new Constanta(2);
		Nod cat=new Cat();
		cat.setFStang(plus3);
		cat.setFDrept(c6);
		
		ArboreFunctional a4=new ArboreFunctional(cat);
		
		System.out.println("Functia este: f(x)="+a4);
		System.out.println("Derivata este: f'(x)="+a4.derivata());
		System.out.println("f(5)="+a4.calculezValoare(5));
		System.out.println("f'(2)="+a4.calculezDerivata(2));
		System.out.println();
		
		//exemplu cu Sin: f(x)=sin(x+1)
		Nod n7=new Necunoscuta();
		Nod c7=new Constanta(1);
		Nod plus4=new Plus();
		plus4.setFStang(n7);
		plus4.setFDrept(c7);
		Nod sin=new Sin();
		sin.setFStang(plus4);
		
		ArboreFunctional a5=new ArboreFunctional(sin);
		
		System.out.println("Functia este: f(x)="+a5);
		System.out.println("Derivata este: f'(x)="+a5.derivata());
		System.out.println("f(5)="+a5.calculezValoare(5));
		System.out.println("f'(2)="+a5.calculezDerivata(2));
		System.out.println();
		
		//exemplu cu Cos: f(x)=cos(x)
		Nod n8=new Necunoscuta();
		Nod cos=new Cos();
		cos.setFStang(n8);
		
		ArboreFunctional a6=new ArboreFunctional(cos);
		
		System.out.println("Functia este: f(x)="+a6);
		System.out.println("Derivata este: f'(x)="+a6.derivata());
		System.out.println("f(5)="+a6.calculezValoare(5));
		System.out.println("f'(2)="+a6.calculezDerivata(2));
		System.out.println();
	}

}
