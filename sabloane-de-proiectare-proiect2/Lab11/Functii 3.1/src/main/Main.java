package main;

import Functii.*;
import Operatori.*;
import Arbori.*;
import visitor.*;
import xml.*;
import visitorXML.*;
import java.io.*;

/**
 * Contine o metoda care exemplifica cum trebuie folosite vizitorii asupra nodurilor unui arbore functional sau xml
 * @author Ordog Dorottya
 *
 */

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		//f(x)=x+3
		Nod n=new Necunoscuta();
		Nod c=new Constanta(3);		
		Nod plus=new Plus();
		
		plus.setFStang(n);
		plus.setFDrept(c);
		
		ArboreFunctional a=new ArboreFunctional(plus);
		Visitor v=new ToStringVisitor();
		Visitor vv=new DerivareVisitor();
		Visitor vvv=new CalculVisitor(5);
		Visitor vvvv=new DerivataCalculVisitor(5);
		a.acceptVisitor(v);
		a.acceptVisitor(vv);
		a.acceptVisitor(vvv);
		a.acceptVisitor(vvvv);
		
		System.out.println("Functia este: f(x)="+((ToStringVisitor)v).getS());
		System.out.println("Derivata este: f'(x)="+((DerivareVisitor)vv).getS());
		System.out.println("f(5)="+((CalculVisitor)vvv).getRezultat());
		System.out.println("f'(5)="+((DerivataCalculVisitor)vvvv).getRezultat());
		
		Visitor av=new ToArboreXMLVisitor();//definire visitor ToArboreXML
		a.acceptVisitor(av); //transformare arbore functional in arbore xml
		ArboreXML arboreXML=new ArboreXML(((ToArboreXMLVisitor)av).getTagXML());//extragere arbore xml
		VisitorXML vxml=new PreordineVisitorXML();//definire visitor pt arborele xml
		arboreXML.acceptVisitor(vxml);//parcurgere arbore xml
		VisitorXML fv=new ToFisierXMLVisitorXML("Functiaf.xml"); //definire visitor ToFisierXML
		arboreXML.acceptVisitor(fv); //transformare arbore xml in fisier xml
		
		/*
		DocumentXML docxml=new DocumentXML("Functiaf.xml"); //creeare document xml
		VisitorDocumentXML vdxml=new ToArboreXMLVisitorDocumentXML(docxml); //definire visitor pt document xml
		docxml.acceptVisitor(vdxml); //transformare document xml in arbore xml
		ArboreXML arboreXML3=docxml.getArboreXML(); //extragere arbore xml
		VisitorXML vxml3=new PreordineVisitorXML();//definire visitor pt arborele xml
		arboreXML3.acceptVisitor(vxml3);//parcurgere arbore xml
		*/
		
		//g(x)=sin x
		Nod sin=new Sin();
		Nod n2=new Necunoscuta();	
		
		sin.setFStang(n2);
		
		ArboreFunctional a2=new ArboreFunctional(sin);
		Visitor v2=new ToStringVisitor();
		Visitor vv2=new DerivareVisitor();
		Visitor vvv2=new CalculVisitor(0);
		Visitor vvvv2=new DerivataCalculVisitor(0);
		a2.acceptVisitor(v2);
		a2.acceptVisitor(vv2);
		a2.acceptVisitor(vvv2);
		a2.acceptVisitor(vvvv2);
		
		System.out.println("Functia este: g(x)="+((ToStringVisitor)v2).getS());
		System.out.println("Derivata este: g'(x)="+((DerivareVisitor)vv2).getS());	
		System.out.println("g(0)="+((CalculVisitor)vvv2).getRezultat());
		System.out.println("g'(0)="+((DerivataCalculVisitor)vvvv2).getRezultat());
		
		Visitor av2=new ToArboreXMLVisitor();//definire visitor
		a2.acceptVisitor(av2); //transformare arbore functional in arbore xml
		ArboreXML arboreXML2=new ArboreXML(((ToArboreXMLVisitor)av2).getTagXML());//extragere arbore xml
		VisitorXML vxml2=new PreordineVisitorXML();//definire visitor pt arborele xml
		arboreXML2.acceptVisitor(vxml2);//parcurgere arbore xml
		VisitorXML fv2=new ToFisierXMLVisitorXML("Functiag.xml"); //definire visitor ToFisierXML
		arboreXML2.acceptVisitor(fv2); //transformare arbore xml in fisier xml
		
	}

}
