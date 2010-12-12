package Arbori;

public abstract class Nod {
	
	private Nod fStang;
	private Nod fDrept;
	private double x;
	
	public Nod getFStang() {
		return fStang;
	}
	public void setFStang(Nod stang) {
		fStang = stang;
	}
	public Nod getFDrept() {
		return fDrept;
	}
	public void setFDrept(Nod drept) {
		fDrept = drept;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
		if(fStang!=null) fStang.setX(x);
		if(fDrept!=null) fDrept.setX(x);
	}
	
	public abstract double calcul();
	public abstract String derivare();
	public abstract double calculDerivata();
	public abstract String toString();

}
