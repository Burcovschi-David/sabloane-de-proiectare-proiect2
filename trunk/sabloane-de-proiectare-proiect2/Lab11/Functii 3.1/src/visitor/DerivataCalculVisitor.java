package visitor;

import Arbori.Nod;
import Functii.*;
import Operatori.*;

/**
 * Clasa care implementeaza calcularea valorii derivatei intr-un punct dat
 * @author Ordog Dorottya
 */

public class DerivataCalculVisitor extends Visitor {

	/**
	 * valoarea necunoscutei in calcul
	 */
	private double valoare;
	/**
	 * rezultatele partiale si cea finala
	 */
	private double rezultat;
	/**
	 * vizitor folosit in calcule partiale
	 */
	private CalculVisitor cv;
	
	public DerivataCalculVisitor(double val){
		this.valoare=val;
		cv=new CalculVisitor(val);
	}

	public double getRezultat() {
		return rezultat;
	}
	
	public void visit(Plus p) {
		if(p.getFStang()!=null && p.getFDrept()!=null)
		{
			visit(p.getFStang());
			double s1=this.rezultat;
			visit(p.getFDrept());
			double s2=this.rezultat;
			rezultat=s1+s2;
		}
	}

	@Override
	public void visit(Minus p) {
		if(p.getFStang()!=null && p.getFDrept()!=null)
		{
			visit(p.getFStang());
			double s1=this.rezultat;
			visit(p.getFDrept());
			double s2=this.rezultat;
			rezultat=s1-s2;
		}
	}

	@Override
	public void visit(Cat p) {
		if(p.getFStang()!=null && p.getFDrept()!=null)
		{
			visit(p.getFStang());
			double s1=this.rezultat;
			visit(p.getFDrept());
			double s2=this.rezultat;
			p.getFStang().acceptVisitor(cv);
			double s3=cv.getRezultat();
			p.getFDrept().acceptVisitor(cv) ;
			double s4=cv.getRezultat();
			this.rezultat=(s1*s4-s3*s2)/s4*s4;

		}
	}

	@Override
	public void visit(Produs p) {
		if(p.getFStang()!=null && p.getFDrept()!=null)
		{
			visit(p.getFStang());
			double s1=this.rezultat;
			visit(p.getFDrept());
			double s2=this.rezultat;
			p.getFStang().acceptVisitor(cv);
			double s3=cv.getRezultat();
			p.getFDrept().acceptVisitor(cv) ;
			double s4=cv.getRezultat();
			this.rezultat=s1*s4+s3*s2;

		}
	}

	@Override
	public void visit(Necunoscuta n) {
		this.rezultat=1;
	}

	@Override
	public void visit(Constanta c) {
		this.rezultat=0;
	}

	@Override
	public void visit(Sin s) {
		if(s.getFStang()!=null){
			visit(s.getFStang());
			double s1=this.rezultat;
			s.getFStang().acceptVisitor(cv);
			double s2=cv.getRezultat();
			this.rezultat=Math.cos(s2)*s1;

		}
	}

	@Override
	public void visit(Cos s) {
		if(s.getFStang()!=null){
			visit(s.getFStang());
			double s1=this.rezultat;
			s.getFStang().acceptVisitor(cv);
			double s2=cv.getRezultat();
			this.rezultat=-Math.sin(s2)*s1;

		}
	}

	@Override
	public void visit(Nod n) {
		if(n instanceof Plus){
			visit((Plus)n);
		}
		else if(n instanceof Minus){
			visit((Minus)n);
		}
		else if(n instanceof Produs){
			visit((Produs)n);
		}
		else if(n instanceof Cat){
			visit((Cat)n);
		}
		else if(n instanceof Sin){
			visit((Sin)n);
		}
		else if(n instanceof Cos){
			visit((Cos)n);
		}
		else if(n instanceof Constanta){
			visit((Constanta)n);
		}
		if(n instanceof Necunoscuta){
			visit((Necunoscuta)n);
		}

	}

}
