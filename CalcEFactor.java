
public class CalcEFactor extends EFactor{
	double rating,factor;
	double total=0,ttl=0,EF=0;
	
	public void Multiply(double r, double f) {
		this.rating = r;
		this.factor = f;	
		total+=rating*factor;
	}
	
	public double getEFactor() {
		return total;	
	}
	
	public double getEF() {
		return EF=(total*-0.03)+1.4;	
	}
	
	public double getUCP() {
		return SwEstimation.SzUC*EF;	   		
	}
	
}
