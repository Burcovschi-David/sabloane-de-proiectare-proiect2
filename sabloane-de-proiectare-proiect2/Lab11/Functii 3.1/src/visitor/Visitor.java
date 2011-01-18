package visitor;

import Operatori.*;
import Functii.*;
import Arbori.*;
/**
 * Clasa generica care reprezinta un vizitor pentru parcurgerea unui arbore functional
 * @author Ordog Dorottya
 */

public abstract class Visitor {
	
	public abstract void visit(Plus p);
	public abstract void visit(Minus m);
	public abstract void visit(Cat m);
	public abstract void visit(Produs p);
	public abstract void visit(Necunoscuta n);
	public abstract void visit(Constanta c);
	public abstract void visit(Sin s);
	public abstract void visit(Cos c);
	public abstract void visit(Nod n);
}
